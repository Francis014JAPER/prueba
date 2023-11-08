package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PAG2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);

        Button Btn139 = findViewById(R.id.Btn6);
        Btn139.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MENU.class);
            startActivity(intent);
        });
    }
}