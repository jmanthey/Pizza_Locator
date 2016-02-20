package com.example.android.pizzalocator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra("edu.css.MESSAGE");
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);
    }


}
