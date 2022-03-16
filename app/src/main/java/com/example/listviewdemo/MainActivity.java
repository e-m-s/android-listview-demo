package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Man> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = loadData();

        ListView lv = findViewById(R.id.listview_people);
        ArrayAdapter<Man> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(this, data.get(i).getName(), Toast.LENGTH_LONG);
        });
    }

    private List<Man> loadData() {
        List<Man> result = new ArrayList<>();
        result.add(new Man("Karel"));
        result.add(new Man("Jana"));
        return result;
    }
}