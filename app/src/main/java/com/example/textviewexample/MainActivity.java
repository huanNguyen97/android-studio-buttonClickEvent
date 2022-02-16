package com.example.textviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the layout
        final TextView simpleTextView = (TextView) findViewById(R.id.simpleTextView);
        Button changeText = (Button) findViewById(R.id.btnChangeText);

        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleTextView.setText("After Clicking");
            }
        });
    }
}