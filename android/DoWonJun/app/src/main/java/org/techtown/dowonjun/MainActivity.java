package org.techtown.dowonjun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int stack = 0;

    Button btn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
    }
    public void onBtnClicked(View v) {
        changeImage();
    }

    private void changeImage() {
        if (stack == 0) {
            imageView.setImageResource(R.drawable.dream01);
            stack = 0;
        } else if(stack == 1) {
            imageView.setImageResource(R.drawable.dream02);
            stack = 0;
        } else if(stack == 2) {
            imageView.setImageResource(R.drawable.dream03);
            stack = 0;
        }
    }

    private int rand(int a) {
        return (int)(Math.random() * 3);

    }
}