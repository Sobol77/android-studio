package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView month;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        month = findViewById(R.id.month);
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> montAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        month.setAdapter(montAdapter);
        month.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String month = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), "kliknales: "+ month, Toast.LENGTH_SHORT).show();
    }
}