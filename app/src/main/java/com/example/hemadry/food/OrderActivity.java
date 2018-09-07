package com.example.hemadry.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    private EditText nameET,addET,proET,itET,phoneET;
    private Button saveBT;
    private FoodDataBaseSource source;
    //private OrderAdepter adepter;
    //private List<Order>orders = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        nameET = findViewById(R.id.na);
        addET = findViewById(R.id.ad);
        proET = findViewById(R.id.p);
        itET = findViewById(R.id.it);
        phoneET = findViewById(R.id.pn);

        source = new FoodDataBaseSource(this);

        saveBT = findViewById(R.id.sb);


    }

    public void SaveData(View view) {


        boolean status = source.insertOrder(nameET.getText().toString(),addET.getText().toString(),
                proET.getText().toString(),itET.getText().toString(),phoneET.getText().toString());
        if (status = true)
        {
            Toast.makeText(this,"saved",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"failed",Toast.LENGTH_LONG).show();
        }
    }
}
