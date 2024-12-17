package com.example.twoactivitiesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Найти кнопку
        Button buttonBack = findViewById(R.id.buttonBack);

        // Обработчик для кнопки возврата
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Закрывает текущую активити и возвращает на предыдущую
            }
        });
    }
}