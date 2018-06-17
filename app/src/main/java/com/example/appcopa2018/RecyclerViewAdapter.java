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

import java.util.ArrayList;
import java.util.Date;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder    >{

    private static final String TAG = "RecyclerViewAdapter";

    private Context mContext;
    private ArrayList<Partida> mPartidas = new ArrayList<>();


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

    @Override
    public int getItemCount() {
        return mPartidas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout mainLayout;
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

        public ViewHolder(View itemView) {
            super(itemView);
            mainLayout = itemView.findViewById(R.id.main_layout);
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
        }
    }
}
