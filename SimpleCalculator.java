package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleCalculator extends AppCompatActivity {
    TextView answer;
    EditText num1, num2;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.et1);
        num2 = findViewById(R.id.et2);
        answer = findViewById(R.id.ans);
        add = findViewById(R.id.btn);
        sub = findViewById(R.id.btn2);
        mul = findViewById(R.id.btn3);
        div = findViewById(R.id.btn4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int sol = a+b;
                answer.setText(String.valueOf(sol));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int sol = a-b;
                answer.setText(String.valueOf(sol));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int sol = a*b;
                answer.setText(String.valueOf(sol));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int sol = a/b;
                answer.setText(String.valueOf(sol));
            }
        });
    }
}