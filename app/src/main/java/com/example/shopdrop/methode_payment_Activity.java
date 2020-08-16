package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class methode_payment_Activity extends AppCompatActivity {

    private Button PayConfirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methode_payment_);

        PayConfirmButton= (Button) findViewById(R.id.pay_confirm);

        PayConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(methode_payment_Activity.this, order_review_Activity.class);
                startActivity(intent);
            }
        });
    }
}