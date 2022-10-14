package com.example.kluby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);

        ArrayList<club_object> arrayList = new ArrayList<>();

      arrayList.add(new club_object(R.drawable.psg, "psg", "sub"));

    }
}