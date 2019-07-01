package com.example.ubereatsclone.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ubereatsclone.R;

public class UberHolder {

    public static class RestroCardHolder extends RecyclerView.ViewHolder {

        public ImageView mRestroCardImage;
        public TextView mRestroCardTitle, mRestroCardDes, mRestroCardTimming, mRestroCardRating;

        public RestroCardHolder(@NonNull View itemView) {
            super(itemView);
            mRestroCardTitle = itemView.findViewById(R.id.restroCardTitle);
            mRestroCardDes = itemView.findViewById(R.id.restroCardDes);
            mRestroCardImage = itemView.findViewById(R.id.restroCardImage);
            mRestroCardTimming = itemView.findViewById(R.id.restroCardTime);
            mRestroCardRating = itemView.findViewById(R.id.restroCardRating);
        }
    }

    public static class  Holder extends RecyclerView.ViewHolder {

        public TextView title;
        public RecyclerView mRecyclerView;

        public Holder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.foodTitle);
            mRecyclerView = itemView.findViewById(R.id.foodRecyclerView);
        }
    }
}
