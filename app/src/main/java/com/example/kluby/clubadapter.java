package com.example.kluby;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class clubadapter extends ArrayAdapter<club_object> {


    public clubadapter(@NonNull Context context, int resource, @NonNull ArrayList<club_object> objects) {
        super(context, resource, objects);
    }
}
