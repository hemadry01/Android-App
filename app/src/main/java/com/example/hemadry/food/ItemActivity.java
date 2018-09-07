package com.example.hemadry.food;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    private ImageView imIV;
    private TextView nameTV,deTV,prTV;
    private Button buttonBT;

    private TextView showTV;
    int counter = 0;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        nameTV = findViewById(R.id.tit);
        deTV =findViewById(R.id.dit);
        prTV = findViewById(R.id.pr);
        imIV = findViewById(R.id.im);
        showTV = findViewById(R.id.show);
        buttonBT = findViewById(R.id.button);
        buttonBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemActivity.this,OrderActivity.class);
                startActivity(intent);
            }
        });
        //recive data

        Intent intent = getIntent();
        String Title =  intent.getExtras().getString("Title");
        String Description =  intent.getExtras().getString("Description");
        String Price =  intent.getExtras().getString("Price");
        int img = intent.getExtras().getInt("Image");

        nameTV.setText(Title);
        deTV.setText(Description);
        prTV.setText(Price);
        imIV.setImageResource(img);
    }

    public void increment(View view) {
        counter++;
        showTV.setText(Integer.toString(counter));
    }

    public void discriment(View view) {
        counter--;
        showTV.setText(Integer.toString(counter));
    }
}
