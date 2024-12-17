package com.example.twoactivitiesapp;

import android.os.Bundle;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Найти кнопки
        Button buttonGoToSecond = findViewById(R.id.buttonGoToSecond);
        Button buttonExit = findViewById(R.id.buttonExit);

        // Обработчик для кнопки перехода
        buttonGoToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        // Обработчик для кнопки выхода
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity(); // Завершает все активности и закрывает приложение
            }
        });
    }
}