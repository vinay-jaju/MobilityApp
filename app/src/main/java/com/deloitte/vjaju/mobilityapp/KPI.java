package com.deloitte.vjaju.mobilityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class KPI extends AppCompatActivity {
    private RecyclerView horizontal_recycler_view;
    private ArrayList<Arraylist> horizontalList;
    private CustomAdapter horizontalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpi);

        horizontal_recycler_view= (RecyclerView) findViewById(R.id.horizontal_recycler_view);
        horizontalList = new ArrayList<Arraylist>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            horizontalList.add(new Arraylist(
                    MyData.nameArray[i],
                    MyData.drawableArray[i]
            ));
        }
        horizontalAdapter=new CustomAdapter(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(KPI.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);
        horizontal_recycler_view.setAdapter(horizontalAdapter);
    }
}
