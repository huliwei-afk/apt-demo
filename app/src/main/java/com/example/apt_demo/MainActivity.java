package com.example.apt_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.annotation.DIActivity;
import com.example.annotation.DIView;

@DIActivity
public class MainActivity extends AppCompatActivity {

    @DIView(value = R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DIMainActivity.bindView(this);
        textView.setText("Hello, Java Poet!");
    }
}