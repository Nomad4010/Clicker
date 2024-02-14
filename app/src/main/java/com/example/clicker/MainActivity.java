package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.textView);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);

        buttonPlus.setBackgroundColor(getResources().getColor(R.color.Red));
        buttonMinus.setBackgroundColor(getResources().getColor(R.color.Blue));

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCounter();
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseCounter();
            }
        });
    }

    private void increaseCounter() {
        counter++;
        updateCounterText();
    }

    private void decreaseCounter() {
        if (counter > 0) {
            counter--;
            updateCounterText();
        }
    }

    private void updateCounterText() {
        counterTextView.setText(String.valueOf(counter));
    }
}