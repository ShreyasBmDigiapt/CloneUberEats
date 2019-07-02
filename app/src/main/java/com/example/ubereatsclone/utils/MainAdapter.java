package com.example.ubereatsclone.utils;

import android.content.Context;
import android.util.Log;
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

import static com.example.ubereatsclone.modelClass.MainModel.MUILTIPLE_RV;
import static com.example.ubereatsclone.modelClass.MainModel.SINGLE_RV;

public class MainAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<MainModel> mList;
    private static final String TAG = "MainAdapter1";


    public MainAdapter(Context context, ArrayList<MainModel> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (mList.get(position).getViewType()) {
            case 1111:
                return SINGLE_RV;

            case 2222:
                return MUILTIPLE_RV;

            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder = null;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;

        switch (viewType) {
            case SINGLE_RV:
                view = inflater.inflate(R.layout.snippet_restro, parent, false);
                holder = new UberHolder.RestroCardHolder(view);
                break;


            case MUILTIPLE_RV:
                view = inflater.inflate(R.layout.restro_recycler_view, parent, false);
                holder = new UberHolder.Holder(view);
                break;

        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        switch (holder.getItemViewType()) {
            case SINGLE_RV:
                UberHolder.RestroCardHolder rHolder1 = (UberHolder.RestroCardHolder) holder;
                Log.d(TAG, "onBindViewHolder: " + mList.size());
                configViewHolder1(rHolder1, (MainModel) mList.get(position));
                break;

            case MUILTIPLE_RV:
                UberHolder.Holder rHolder2 = (UberHolder.Holder) holder;
                configViewHolder2(rHolder2, (MainModel) mList.get(position));
                break;

        }
    }

    private void configViewHolder1(UberHolder.RestroCardHolder holder, MainModel pojo) {
        Picasso.with(context).load(pojo.getThumImage()).into(holder.mRestroCardImage);
        holder.mRestroCardTitl.setText(pojo.getTitle());
        holder.mRestroCardDes.setText(pojo.getDescription());
        holder.mRestroCardRating.setText(pojo.getRatings());
        holder.mRestroCardTimming.setText(pojo.getTimmings());
        holder.mRestroCardView.setCardElevation(0);
    }


    private void configViewHolder2(UberHolder.Holder holder, MainModel pojo) {
        HomeAdapter adapter = new HomeAdapter(pojo.getmList(), context);
        holder.mRecyclerView.hasFixedSize();
        holder.mRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.title.setText(pojo.getMainTitle());
        holder.mRecyclerView.setAdapter(adapter);
    }


    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + mList.size());
        return mList.size();
    }

}
