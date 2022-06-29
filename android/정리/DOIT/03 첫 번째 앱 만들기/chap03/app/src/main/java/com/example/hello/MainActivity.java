package com.example.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate : MainActivity.java 가 호출될 때 가장 먼저 실행되는 메소드, 자바의 main메소드와 비슷하다.
        super.onCreate(savedInstanceState); // super : 상속을 받은 클래스에서 부모 클래스를 가리킬 때 사용한다.
        setContentView(R.layout.activity_main); // setContentView : 화면에 무엇을 보여줄 것인지 설정한다. // R.layout.activity_main : 사용자가 보게 될 화면 모양의 정보, activity_main.xml의 내용을 표시한다.
    } // 실행 시 activity_main.xml 레이아웃을 화면에 보여준다.

    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3147-0464"));
        startActivity(myIntent);
    }
}