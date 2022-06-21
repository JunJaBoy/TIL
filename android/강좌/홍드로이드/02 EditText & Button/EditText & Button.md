```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:orientation="vertical"
    android:layout_gravity="center_vertical"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/et1"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:hint="아무거나 써봐"
        android:layout_gravity="center"
        android:gravity="center"/>

    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="그리고 눌러"
        android:layout_gravity="center"
        android:backgroundTint="#888888"/>
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="뭐하냐?"
        android:textSize="20dp"
        android:layout_gravity="center"
        android:id="@+id/tv1"/>
</LinearLayout>
```

```java
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        btn1 = findViewById(R.id.btn1);
        tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("공부 시작 안하냐?");
            }
        });
    }
}
```