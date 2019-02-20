package com.example.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Order> products = new ArrayList<>();

    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        listView = (ListView) findViewById(R.id.list);

        MyAdapter myAdapter = new MyAdapter(Order.products, this);
        listView.setAdapter(myAdapter);
    }

}
