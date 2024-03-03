package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int cnt = 0;
    private TextView textView;
    private int currentApiVersion = android.os.Build.VERSION.SDK_INT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        textView = findViewById(R.id.show_text);
        if (savedInstanceState != null) {
            cnt = savedInstanceState.getInt("counter", 0);
        }
        textView.setText(String.valueOf(cnt));
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("counter", cnt);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counter")) {
            cnt = savedInstanceState.getInt("counter");
        }
    }


    public void Button_Listener(View obj) {
        cnt += 1;
        textView.setText(String.valueOf(cnt));
    }


    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_LONG).show();
    }

}