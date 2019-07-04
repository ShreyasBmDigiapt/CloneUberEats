package com.example.ubereatsclone.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.ubereatsclone.R;
import com.example.ubereatsclone.modelClass.OfferModel;
import com.nshmura.recyclertablayout.RecyclerTabLayout;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class OfferRTLAdapter extends RecyclerView.Adapter<OfferRTLAdapter.OfferHolder> {

    private ArrayList<OfferModel> mList;
    private Context context;

    public OfferRTLAdapter(ArrayList<OfferModel> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public OfferHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.snipper_offer_items, parent,false);
        return new OfferHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferHolder holder, int position) {
        OfferModel model = mList.get(position);
        Picasso.get().load(model.getOfferImageUrl()).into(holder.mIvOfferImage);
        holder.mTvOfferTitle.setText(model.getOfferSingleTitle());
        holder.mTvOfferSubTitle.setText(model.getOfferSingleSubTitle());
        holder.mTvOfferTime.setText(model.getOfferSingleTime());
        holder.mTvOfferRating.setText(model.getOfferSingleRatings());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class OfferHolder extends RecyclerView.ViewHolder {

        private ImageView mIvOfferImage;
        private TextView mTvOfferTitle, mTvOfferSubTitle, mTvOfferTime, mTvOfferRating;

        public OfferHolder(@NonNull View itemView) {
            super(itemView);

            mIvOfferImage = itemView.findViewById(R.id.singleOfferImage);
            mTvOfferTitle = itemView.findViewById(R.id.singleofferTitle);
            mTvOfferSubTitle = itemView.findViewById(R.id.singleOfferSubtitle);
            mTvOfferTime = itemView.findViewById(R.id.offerSingleTime);
            mTvOfferRating = itemView.findViewById(R.id.offerSingleRating);
        }
    }
}
