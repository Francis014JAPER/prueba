package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn1333 = findViewById(R.id.Btn1200);
        Btn1333.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), LOGIN.class);
            startActivity(intent);
        });
    }
}