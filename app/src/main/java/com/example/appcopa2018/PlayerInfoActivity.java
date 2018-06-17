package com.example.appcopa2018;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.appcopa2018.model.Team;

public class PlayerInfoActivity extends AppCompatActivity {

    protected static String selection = null;
    TextView display_data;

    public static void setSelection(String name) {
        selection = name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);
        display_data = (TextView) findViewById(R.id.display_result);
        display_data.setText(Team.getPlayer(selection).toString());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
