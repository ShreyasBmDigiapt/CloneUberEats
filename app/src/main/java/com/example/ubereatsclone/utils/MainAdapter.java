package com.example.ubereatsclone.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ubereatsclone.R;
import com.example.ubereatsclone.modelClass.MainModel;
import com.example.ubereatsclone.modelClass.RestroPOJOsingle;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter {

    private static final int SINGLERESTRO = 1111;
    private static final int RECYCLERRESTRO = 9999;
    private Context context;
    private ArrayList<Object> mList;


    public MainAdapter(Context context, ArrayList<Object> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getItemViewType(int position) {
        if (mList.get(position) instanceof RestroPOJOsingle) {
            return SINGLERESTRO;
        } else if (mList.get(position) instanceof MainModel) {
            return RECYCLERRESTRO;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;

        switch (viewType) {
            case SINGLERESTRO:
                 view = inflater.inflate(R.layout.snippet_restro, parent, false);
                holder = new UberHolder.RestroCardHolder(view);
                break;

                default:
                     view = inflater.inflate(R.layout.restro_recycler_view, parent, false);
                    holder = new UberHolder.Holder(view);
                    break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case SINGLERESTRO:
                UberHolder.RestroCardHolder rHolder1 = (UberHolder.RestroCardHolder) holder;
                configViewHolder1(rHolder1, (RestroPOJOsingle)mList.get(position));
                break;

                default:
                    UberHolder.Holder rHolder2 = (UberHolder.Holder) holder;
                    configViewHolder2(rHolder2, (MainModel)mList.get(position));
                    break;
        }
    }



    private void configViewHolder1(UberHolder.RestroCardHolder holder, RestroPOJOsingle pojo) {

        Picasso.with(context).load(pojo.getThumImage()).into(holder.mRestroCardImage);
        holder.mRestroCardTitle.setText(pojo.getTitle());
        holder.mRestroCardDes.setText(pojo.getDescription());
        holder.mRestroCardRating.setText(pojo.getRatings());
        holder.mRestroCardTimming.setText(pojo.getTimmings());
    }

    private void configViewHolder2(UberHolder.Holder holder, MainModel pojo) {
        HomeAdapter adapter = new HomeAdapter(pojo.getmList(), context);
        holder.mRecyclerView.setHasFixedSize(true);
        holder.mRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.title.setText(pojo.getTitle());
        holder.mRecyclerView.setAdapter(adapter);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

}
