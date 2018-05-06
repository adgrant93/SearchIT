package com.jskel.android.searchit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class displaySearch extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Results> resultsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_search);
        mRecyclerView = (RecyclerView) findViewById(R.id.searchResultRecyclerView);
        mRecyclerView.setHasFixedSize(true); //For efficiency since all views in list will be same size

        mLayoutManager = new LinearLayoutManager(this); //Determines how the layout will be displayed (Linear)
        mRecyclerView.setLayoutManager(mLayoutManager); //Sets the newly created

        Results results2 = new Results("Hi There");
        Results hi = new Results("ok dad");
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        resultsList.add(results2);
        resultsList.add(hi);
        mAdapter = new DisplaySearchAdapter(this, resultsList);
        mRecyclerView.setAdapter(mAdapter);

        

    }
}

       /* ArrayList<String> searchArray = new ArrayList<String>();
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
        listView.setAdapter(adapter);*/