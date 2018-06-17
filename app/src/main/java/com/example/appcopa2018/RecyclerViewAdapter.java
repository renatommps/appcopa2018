package com.example.appcopa2018;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.appcopa2018.model.Partida;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder    >{

    private static final String TAG = "RecyclerViewAdapter";

    private Context mContext;
    private ArrayList<Partida> mPartidas;


    public RecyclerViewAdapter(Context mContext, ArrayList<Partida> mPartidas) {
        this.mContext = mContext;
        this.mPartidas = mPartidas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mPartidas.get(position).getTime1flagUrl())
                .into(holder.imgTime1);

        Glide.with(mContext)
                .asBitmap()
                .load(mPartidas.get(position).getTime2flagUrl())
                .into(holder.imgTime2);


        holder.jogoNumero.setText(Integer.toString(mPartidas.get(position).getNumero()));
        holder.grupoNome.setText(mPartidas.get(position).getGrupo());
        holder.estadioNome.setText(mPartidas.get(position).getEstadio());
        holder.time1name.setText(mPartidas.get(position).getTime1());
        holder.time2name.setText(mPartidas.get(position).getTime2());
        holder.dataHora.setText(formatDateTimeField(mPartidas.get(position).getData()));

//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "clicked on: " + mImageNames.get(position));
//
//                Toast toast = Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
    }

    private String formatDateTimeField(Date data) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("pt"));
        String[] dayNames = symbols.getShortWeekdays();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);

        String formatedDate = String.valueOf(day) + "/" + String.valueOf(month);
        String formatedDayofWeek = "(" + dayNames[dayOfWeek] + ")";
        String formatedHour = ( (hours < 10) ? ("0" + String.valueOf(hours)) : String.valueOf(hours) )
                + "h"
                + ((minutes < 10) ? ("0" + String.valueOf(minutes)) : String.valueOf(minutes));

        String formatedDateHour = formatedDate + " " + formatedDayofWeek + " - " + formatedHour;

        return formatedDateHour;
    }

    @Override
    public int getItemCount() {
        return mPartidas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout infosLayout;
        TextView jogoText;
        TextView jogoNumero;
        TextView separator1;
        TextView grupoText;
        TextView grupoNome;
        TextView separator2;
        TextView estadioNome;
        RelativeLayout parentLayout;
        CircleImageView imgTime1;
        TextView time1name;
        TextView versus;
        TextView time2name;
        CircleImageView imgTime2;
        TextView dataHora;

        public ViewHolder(View itemView) {
            super(itemView);
            infosLayout = itemView.findViewById(R.id.infos_layout);
            jogoText = itemView.findViewById(R.id.jogo_text);
            jogoNumero = itemView.findViewById(R.id.jogo_numero);
            separator1 = itemView.findViewById(R.id.separator_1);
            grupoText = itemView.findViewById(R.id.grupo_text);
            grupoNome = itemView.findViewById(R.id.grupo_nome);
            separator2 = itemView.findViewById(R.id.separator_2);
            estadioNome = itemView.findViewById(R.id.estadio_nome);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            imgTime1 = itemView.findViewById(R.id.img_time_1);
            time1name = itemView.findViewById(R.id.time_1_name);
            versus = itemView.findViewById(R.id.versus);
            time2name = itemView.findViewById(R.id.time_2_name);
            imgTime2 = itemView.findViewById(R.id.img_time_2);
            dataHora = itemView.findViewById(R.id.data_hora);
        }
    }
}
