package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v) {
        findViewById(R.id.button5).setEnabled(false);
        ((Button)findViewById(R.id.button5)).setText("New New Disabled");

//        v.setEnabled(false);
//        Button button = (Button) v;
//        button.setText("Disabled");
//        Log.d("success", "Button disabled");
    }
}