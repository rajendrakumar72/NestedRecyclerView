package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter parentAdapter;
    ArrayList<ParentModel> parentModelArrayList=new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentModelArrayList.add(new ParentModel("Category 1"));
        parentModelArrayList.add(new ParentModel("Category 2"));
        parentModelArrayList.add(new ParentModel("Category 3"));
        parentModelArrayList.add(new ParentModel("Category 4"));
        parentModelArrayList.add(new ParentModel("Category 5"));
        parentModelArrayList.add(new ParentModel("Category 6"));

        parentRecyclerView=findViewById(R.id.parentRecyclerView);
        parentRecyclerView.setHasFixedSize(true);

        parentLayoutManger=new LinearLayoutManager(this);

        parentAdapter=new ParentRecyclerViewAdapter(parentModelArrayList,MainActivity.this);

        parentRecyclerView.setLayoutManager(parentLayoutManger);
        parentRecyclerView.setAdapter(parentAdapter);

        parentAdapter.notifyDataSetChanged();



    }
}