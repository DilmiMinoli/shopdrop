package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Button;

import static com.example.shopdrop.R.id.add_to_cart;
import static com.example.shopdrop.R.id.add_to_cart_button;

public class ProductDetailsActivity extends AppCompatActivity {

    private Button addToCartButton;
    private Button BuyNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

       addToCartButton = (Button) findViewById(R.id.add_to_cart_button);
        BuyNowButton = (Button) findViewById(R.id.buy_now_btn);

       addToCartButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(ProductDetailsActivity.this,CartActivity.class);
               startActivity(intent);

           }
       });

       BuyNowButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(ProductDetailsActivity.this, Card_detail_Activity.class);
               startActivity(intent);

           }
       });

    }

}