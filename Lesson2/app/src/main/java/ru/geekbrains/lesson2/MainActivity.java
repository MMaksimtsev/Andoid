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
        initNumericButton();

        Button symbolPoint = findViewById(R.id.symbol_point);
        symbolPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!dataStorage.getBuffer().contains("."))
                        && (!dataStorage.getBuffer().isEmpty())) {
                    dataStorage.setBuffer(symbolPoint.getText().toString());
                    textView2.setText(dataStorage.getBuffer());
                }
            }
        });

        Button symbolC = findViewById(R.id.symbol_C);
        symbolC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    dataStorage.setBuffer(null);
                    textView2.setText("");
            }
        });

        Button symbolPercent = findViewById(R.id.symbol_percent);
        symbolPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStorage.setNumberOne(Float.parseFloat(dataStorage.getBuffer()));
                textView2.setText(dataStorage.getNumberOne() + " " + symbolPercent.getText().toString());
            }
        });
    }

    private void initNumericButton() {
        Button numberOne =findViewById(R.id.number_1);
        showSymbol(numberOne);

        Button numberTwo =findViewById(R.id.number_2);
        showSymbol(numberTwo);

        Button numberThree =findViewById(R.id.number_3);
        showSymbol(numberThree);

        Button numberFour =findViewById(R.id.number_4);
        showSymbol(numberFour);

        Button numberFive =findViewById(R.id.number_5);
        showSymbol(numberFive);

        Button numberSix =findViewById(R.id.number_6);
        showSymbol(numberSix);

        Button numberSeven =findViewById(R.id.number_7);
        showSymbol(numberSeven);

        Button numberEight =findViewById(R.id.number_8);
        showSymbol(numberEight);

        Button numberNine =findViewById(R.id.number_9);
        showSymbol(numberNine);

        Button numberZero =findViewById(R.id.number_0);
        showSymbol(numberZero);

        Button numberDoubleZero =findViewById(R.id.number_00);
        showSymbol(numberDoubleZero);
    }





    private void showSymbol(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStorage.setBuffer(button.getText().toString());
                textView2.setText(dataStorage.getBuffer());
            }
        });
    }


    private void initTetView() {
        textView2 = findViewById(R.id.textView2);
    }





}