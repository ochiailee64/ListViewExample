package com.example.csaper6.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> list = new ArrayList<>();
        for(int i =0; i <100; i++)
        {
            list.add(i, "Items #" +i);

        }
        ListView listview = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.list_item_textview, list);
        listview.setAdapter(listAdapter);





    }


}