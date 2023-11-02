package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
public class LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    Button Btn1 = findViewById(R.id.Btn1);
    Btn1.setOnClickListenerLA(v -> {
        Intent intent = new Intent (v.getContext(), MENU.class);
        startActivity(intent);
    });
}