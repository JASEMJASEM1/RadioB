package com.dam.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    public MainActivity() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroupid);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (radioButton.getId()) {
                case R.id.pizzaId: {
                    textView.setCursorVisible(true);
                    textView.setText("Pizza");
                }
                case R.id.humbergerId: {
                    textView.setCursorVisible(true);
                    textView.setText("Humberger");
                }
                case R.id.steakjj: {
                    textView.setCursorVisible(true);
                    textView.setText("steak");
                }
            }
        });
    }
}