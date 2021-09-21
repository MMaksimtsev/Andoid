package ru.geekbrains.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private DataStorage dataStorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataStorage = new DataStorage();
        initTetView();
        initButtonNumberOne();
        initButtonNumberTwo();
    }

    private void initButtonNumberOne() {
        Button numberOne =findViewById(R.id.number_1);
        numberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStorage.setBuffer("1");
                textView2.setText(dataStorage.getBuffer());
            }
        });
    }
    private void initButtonNumberTwo() {
        Button numberTwo =findViewById(R.id.number_2);
        numberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStorage.setBuffer("2");
                textView2.setText(dataStorage.getBuffer());
            }
        });
    }

    private void initTetView() {
        textView2 = findViewById(R.id.textView2);
    }





}