package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PAG3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);
        Button Btn140 = findViewById(R.id.Btn7);
        Btn140.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MENU.class);
            startActivity(intent);
        });
    }
}