package com.jskel.android.searchit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class displaySearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_search);
        ArrayList<String> searchArray = new ArrayList<String>();
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        searchArray.add("Goodbye!");
        searchArray.add("Hello!");
        searchArray.add("Hola!");
        ListView listView = (ListView) findViewById(R.id.searchList);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, searchArray);
        listView.setAdapter(adapter);
    }
}
