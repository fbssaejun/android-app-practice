package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import butterknife.OnClick;

public class ButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }

    @OnClick(R.id.backButton)
    public void onBackClick() {
        Toast.makeText(this, "Back Button Clicked", Toast.LENGTH_SHORT).show();
    }
}