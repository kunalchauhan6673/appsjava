package com.example.primenumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num;
        Button check;
        TextView answer;

        num = findViewById(R.id.et1);
        check = findViewById(R.id.btn);
        answer = findViewById(R.id.ans);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n = Integer.parseInt(num.getText().toString());
                if (n % 2 == 0) {
                    answer.setText(n + " is Even");
                } else {
                    answer.setText(n + " is Odd");
                }
            }
        });
    }
}

