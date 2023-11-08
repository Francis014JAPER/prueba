package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button Btn134 = findViewById(R.id.Btn9);
        Btn134.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), LOGIN.class);
            startActivity(intent);
        });
        Button Btn135 = findViewById(R.id.Btn4);
        Btn135.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), PAG1.class);
            startActivity(intent);
        });
        Button Btn136 = findViewById(R.id.Btn2);
        Btn136.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), PAG2.class);
            startActivity(intent);
        });
        Button Btn137 = findViewById(R.id.Btn3);
        Btn137.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), PAG3.class);
            startActivity(intent);
        });
    }
}