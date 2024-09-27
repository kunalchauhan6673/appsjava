package com.example.primenumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeNumber extends AppCompatActivity {

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
                boolean isPrime = true;

                for (int i = 2; i <= n/2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    answer.setText(n + " is Prime");
                } else {
                    answer.setText(n + " is not Prime");
                }
            }
        });
    }
}
