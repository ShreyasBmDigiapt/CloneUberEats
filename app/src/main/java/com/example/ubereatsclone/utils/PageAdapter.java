package com.example.ubereatsclone.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.example.ubereatsclone.R;
import com.squareup.picasso.Picasso;

public class PageAdapter extends androidx.viewpager.widget.PagerAdapter {

    private Context context;
    private String[] images;

    private static final String TAG = "PageAdapter1";

    private ImageView mPagerImage;

    public PageAdapter(Context context, String[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.pager_image_layout, container, false);

        mPagerImage = itemView.findViewById(R.id.pager_image);

        try {
            Picasso.with(context).load(images[position]).error(R.drawable.back).into(mPagerImage);
        }catch (Exception e){
            Log.d(TAG, "instantiateItem: "+e.getMessage());
        }
        container.addView(itemView);

        return itemView;
    }
}
