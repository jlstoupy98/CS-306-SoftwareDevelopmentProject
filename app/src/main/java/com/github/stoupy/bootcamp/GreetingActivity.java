package com.github.stoupy.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {
    public static final String EXTRA_USER_NAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_USER_NAME);

        TextView textView = findViewById(R.id.greetingMessage);
        textView.setText("Hello " + name + " !");
    }
}