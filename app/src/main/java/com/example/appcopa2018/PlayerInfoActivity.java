package com.example.appcopa2018;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appcopa2018.model.Player;
import com.example.appcopa2018.model.Team;

public class PlayerInfoActivity extends AppCompatActivity {

    protected static String selection = null;
    TextView display_data;
    ImageView display_image;

    public static void setSelection(String name) {
        selection = name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);
        display_data = (TextView) findViewById(R.id.display_result);
        display_image = (ImageView) findViewById(R.id.display_image);
        Player p = Team.getPlayer(selection);
        display_data.setText(p.toString());
        display_image.setImageDrawable(getResources().getDrawable(getResourceID(p.getImg(), "mipmap", getApplicationContext())));

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    protected final static int getResourceID(final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }
}
