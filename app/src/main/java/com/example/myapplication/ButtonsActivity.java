package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButtonsActivity extends AppCompatActivity {

    @BindString(R.string.back_button_toaster) String BackToaster;
    @BindString(R.string.next_button_toaster) String NextToaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
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
        Toast.makeText(this, BackToaster, Toast.LENGTH_SHORT).show();
    }

    protected void onNextButtonClicked() {
        Toast.makeText(this, NextToaster, Toast.LENGTH_SHORT).show();
    }
}