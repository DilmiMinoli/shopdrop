package com.example.catergorized;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_car;
    Button btn_cat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start=(Button)findViewById(R.id.maintain_btn);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this,AddNewCategoryActivity.class);

                startActivity(in);

            }
        });

        btn_car=(Button)findViewById(R.id.check_orders_btn);

        btn_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this,UpdateCategoryActivity.class);

                startActivity(in);

            }
        });

        btn_cat=(Button)findViewById(R.id.delete_btn);

        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this,DeleteCategoryActivity.class);

                startActivity(in);

            }
        });


    }
}