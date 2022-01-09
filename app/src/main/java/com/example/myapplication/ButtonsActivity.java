package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButtonsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        findViewById(R.id.backButton).setOnClickListener(view -> onBackButtonClicked());
        findViewById(R.id.nextButton).setOnClickListener(view -> onNextButtonClicked());
    }

//    @OnClick({R.id.backButton, R.id.nextButton})
//    protected void onViewClicked(View v) {
//        switch (v.getId()) {
//            case R.id.backButton:
//                Toast.makeText(this, "Back Clicked", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.nextButton:
//                Toast.makeText(this, "Next Clicked", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }

    protected void onBackButtonClicked() {
        Toast.makeText(this, "Back Clicked", Toast.LENGTH_SHORT).show();
    }

    protected void onNextButtonClicked() {
        Toast.makeText(this, "Next Clicked", Toast.LENGTH_SHORT).show();
    }
}