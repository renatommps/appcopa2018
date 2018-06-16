package com.example.appcopa2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void opensNewsScene(View view) {
        Intent intent = new Intent(this, DisplayNewsActivity.class);
        startActivity(intent);
    }

    public void opensConvocationsScene(View view) {
        Intent intent = new Intent(this, DisplayConvocationsActivity.class);
        startActivity(intent);
    }

    public void opensScheduleScene(View view) {
        Intent intent = new Intent(this, DisplayScheduleActivity.class);
        startActivity(intent);
    }

    public void opensVideosScene(View view) {
        Intent intent = new Intent(this, DisplayVideosActivity.class);
        startActivity(intent);
    }
}
