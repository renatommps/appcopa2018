package com.example.appcopa2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.appcopa2018.model.Partida;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static android.support.v7.widget.RecyclerView.VERTICAL;

public class DisplayScheduleActivity extends AppCompatActivity {

    private static final String TAG = "DisplayScheduleActivity";

    // variaveis
    private ArrayList<Partida> mPartidas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_schedule);

        Log.d(TAG, "onCreate: started DisplayScheduleActivity");

        initSchedule();
    }

    private void initSchedule() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date dataJogo1 = formatter.parse("17/06/2018 15:00");
            Date dataJogo2 = formatter.parse("22/06/2018 09:00");
            Date dataJogo3 = formatter.parse("27/06/2018 15:00");

            String imgUrlBrasil = "https://hdlogo.files.wordpress.com/2018/04/brazil-flag-logo.png";
            String imgUrlSuica = "https://hdlogo.files.wordpress.com/2018/04/switzerland-flag-logo.png";
            String imgUrlCostaRica = "https://hdlogo.files.wordpress.com/2018/04/costa-rica-flag-logo.png?w=1000&h=";
            String imgUrlServia = "https://hdlogo.files.wordpress.com/2018/04/serbia-flag-logo.png";

            mPartidas.add( new Partida(9, dataJogo1, "E", "Arena Rostov", "Brasil", imgUrlBrasil, "Suiça", imgUrlSuica) );
            mPartidas.add( new Partida(25, dataJogo2, "E", "Krestovsky", "Brasil", imgUrlBrasil, "Costa Rica", imgUrlCostaRica) );
            mPartidas.add( new Partida(41, dataJogo3, "E", "Otkrytiye Arena", "Servia", imgUrlServia, "Brasil", imgUrlBrasil) );

            initRecyclerView();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    private void initRecyclerView(){
        Log.d(TAG, "initImageBitmaps: init recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recycler_view_schedule);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mPartidas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(), VERTICAL);
        recyclerView.addItemDecoration(decoration);
    }
}
