package com.example.hemadry.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {

    private RecyclerView recyclerRV;
    private List<Detail>details = new ArrayList<>();
    private FoodAdepter adepter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        toolbar = findViewById(R.id.toolber);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Product");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));

        recyclerRV = findViewById(R.id.recyclerView);
        adepter = new FoodAdepter(this,Detail.foodDetail());
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerRV.setLayoutManager(llm);
        recyclerRV.setAdapter(adepter);
    }
}
