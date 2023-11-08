package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PAG1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag1);

        Button Btn138 = findViewById(R.id.Btn5);
        Btn138.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MENU.class);
            startActivity(intent);
        });
    }
}