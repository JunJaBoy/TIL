package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ItemData> dataList = new ArrayList<>();
    int[] pic = {R.drawable.c, R.drawable.ij};

    final Adapter adapter = new Ad`apter(dataList);
    static int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rc);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i < 2; i++) {
            dataList.add(new ItemData(pic[i], "TITLE"+i,String.format("%03d", i)));
        }
        recyclerView.setAdapter(adapter);
    }
}