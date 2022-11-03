package com.example.kluby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
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

        arrayList.add(new club_object(R.drawable.psg, "psg", "miasto: paryz"));
        arrayList.add(new club_object(R.drawable.arsenal, "arsenal", "miasto: Londyn"));
        arrayList.add(new club_object(R.drawable.barcelona, "barcelona", "miasto: Barcelona"));
        arrayList.add(new club_object(R.drawable.bvb, "bvb", "miasto: Dortmund"));
        arrayList.add(new club_object(R.drawable.juve, "juventus", "miasto: Turyn"));
        arrayList.add(new club_object(R.drawable.manchester, "man utd", "miasto: Manchester"));
        arrayList.add(new club_object(R.drawable.milan, "ac milan", "miasto: Mediolan"));
        arrayList.add(new club_object(R.drawable.real, "real madryt", "miasto: Madryt"));
        arrayList.add(new club_object(R.drawable.manc, "man city", "miasto: Manchester"));

        clubadapter Clubadapter = new clubadapter(this,R.layout.list,arrayList);

        listView.setAdapter(Clubadapter);
    }
}