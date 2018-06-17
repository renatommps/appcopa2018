package com.example.appcopa2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.appcopa2018.model.Team;

public class DisplayConvocationsActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Team.fillList();
        setContentView(R.layout.activity_display_convocations);

    // set up the RecyclerView
        recyclerView = findViewById(R.id.rvAnimals);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyRecyclerViewAdapter(this, Team.getPlayerNames());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        PlayerInfoActivity.setSelection(adapter.getItem(position));
        Intent intent = new Intent(this, PlayerInfoActivity.class);
        startActivity(intent);
    }

}
