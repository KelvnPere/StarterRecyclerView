package com.measure.starterrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.measure.starterrecyclerview.adapter.RecyclerViewAdapter;
import com.measure.starterrecyclerview.model.Data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  
    private RecyclerView recyclerView;
    private ArrayList <Data> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);

        setUpRecyclerView();
        insertFakeNotes();

    }

    private void insertFakeNotes() {
        for (int i = 0; i <  1000; i++){

            Data data = new Data();
            data.setTitle("Its Working!!" + i);
            mData.add(data);
        }
        mAdapter.notifyDataSetChanged();
    }


    private void setUpRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
       mAdapter = new RecyclerViewAdapter(mData);
       recyclerView.setAdapter(mAdapter);
    }


}
