package com.example.buttontest;
//정수를 입력받아 아스키코드로 변환하거나 아스키코드를 입력받아 정수로 변환하여 출력한다
//아스키코드 범위를 벗어나게 되면 범위 밖이라고 출력한다
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}