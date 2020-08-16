package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirm_order_Activity extends AppCompatActivity {

    private Button ConfirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order_);

        ConfirmButton = (Button) findViewById(R.id.confirm_btn);

        ConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_order_Activity.this, methode_payment_Activity.class);
                startActivity(intent);

            }
        });

    }
}