package com.mobile.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public int max(int a, int b){
        if(a >= b) return a;
        return b;
    }

    public int min(int a, int b){
        if(a >= b) return b;
        return a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}