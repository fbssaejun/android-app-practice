package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    //disables button when it is clicked
    public void disable(View v) {
        findViewById(R.id.button5).setEnabled(false);
        ((Button)findViewById(R.id.button5)).setText("New New Disabled");

    }

    //Gets the text from user input
    public void handleText(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById((R.id.output))).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }

    public void launchSettings(View v) {
        //Launch a new activity

        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}