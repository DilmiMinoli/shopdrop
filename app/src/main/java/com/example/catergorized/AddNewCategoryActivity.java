package com.example.catergorized;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddNewCategoryActivity extends AppCompatActivity {

    private String categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_category);
    }
}