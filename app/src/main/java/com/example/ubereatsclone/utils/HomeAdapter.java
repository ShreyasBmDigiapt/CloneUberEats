package com.example.ubereatsclone.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ubereatsclone.R;
import com.example.ubereatsclone.modelClass.RestroPOJOsingle;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeAdapter  extends RecyclerView.Adapter<UberHolder.RestroCardHolder> {

    private ArrayList<RestroPOJOsingle> mList;
    private Context context;

    public HomeAdapter(ArrayList<RestroPOJOsingle> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public UberHolder.RestroCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.snippet_restor_item, parent, false);
        return new UberHolder.RestroCardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UberHolder.RestroCardHolder holder, int position) {
        RestroPOJOsingle pojo = mList.get(position);

        Picasso.with(context).load(pojo.getThumImage()).into(holder.mRestroCardImage);
        holder.mRestroCardTitle.setText(pojo.getTitle());
        holder.mRestroCardDes.setText(pojo.getDescription());
        holder.mRestroCardRating.setText(pojo.getRatings());
        holder.mRestroCardTimming.setText(pojo.getTimmings());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "UberEats", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
