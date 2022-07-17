package org.techtown.mission3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView01 = findViewById(R.id.imageView);
        imageView02 = findViewById(R.id.imageView2);

        Button button01 = findViewById(R.id.button);
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageUp();
            }
        });

        Button button02 = findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageDown();
            }
        });

        moveImageUp();
    }

    private void moveImageDown() {
        imageView01.setImageResource(0);
        imageView02.setImageResource(R.drawable.dream01);

        imageView01.invalidate();
        imageView02.invalidate();
    }

    private void moveImageUp() {
        imageView01.setImageResource(R.drawable.dream02);
        imageView02.setImageResource(0);

        imageView01.invalidate();
        imageView02.invalidate();
    }






    /*ScrollView scrollView1;
    ScrollView scrollView2;
    ImageView imageView;
    ImageView imageView2;
    BitmapDrawable bitmap;
    BitmapDrawable bitmap2;

    int location = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        scrollView1 = findViewById(R.id.scrollView);
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView1.setHorizontalScrollBarEnabled(true);
        scrollView2.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.dream01);
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.dream02);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        int bitmapWidth2 = bitmap2.getIntrinsicWidth();
        int bitmapHeight2 = bitmap2.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

        imageView2.setImageDrawable(bitmap2);
        imageView2.getLayoutParams().width = bitmapWidth2;
        imageView2.getLayoutParams().height = bitmapHeight2;


    }

    public void onBtnClicked(View view) {
        changeImage();
    }

    public void changeImage() {
        if (location == 0) {
            Resources res = getResources();
            imageView.setImageResource(0);
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.dream02);
            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();

            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmapWidth;
            imageView.getLayoutParams().height = bitmapHeight;

            imageView2.setImageResource(0);
            bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.dream01);
            int bitmapWidth2 = bitmap2.getIntrinsicWidth();
            int bitmapHeight2 = bitmap2.getIntrinsicHeight();

            imageView2.setImageDrawable(bitmap2);
            imageView2.getLayoutParams().width = bitmapWidth2;
            imageView2.getLayoutParams().height = bitmapHeight2;
            location = 1;
        } else if (location == 1) {
            Resources res = getResources();
            imageView2.setImageResource(0);
            bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.dream01);
            int bitmapWidth2 = bitmap2.getIntrinsicWidth();
            int bitmapHeight2 = bitmap2.getIntrinsicHeight();

            imageView2.setImageDrawable(bitmap2);
            imageView2.getLayoutParams().width = bitmapWidth2;
            imageView2.getLayoutParams().height = bitmapHeight2;

            imageView.setImageResource(0);
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.dream02);

            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();

            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmapWidth;
            imageView.getLayoutParams().height = bitmapHeight;
            location = 0;
        }

    }*/
}