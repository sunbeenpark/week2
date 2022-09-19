package com.circle.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "네이버 접속 버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(Action)
    }
}