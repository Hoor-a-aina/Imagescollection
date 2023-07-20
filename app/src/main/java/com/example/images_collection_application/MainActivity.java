package com.example.images_collection_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCats;
    ImageButton btnCars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnCats = findViewById(R.id.imgBtN);
        ImageButton btnCars = findViewById(R.id.imgBtN2);

        btnCats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intCats = new Intent(MainActivity.this,CatsImg.class);
                startActivity(intCats);
            }
        });
        btnCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intCars = new Intent(MainActivity.this,CarsImg.class);
                startActivity(intCars);
            }
        });
    }
}