package com.example.ubereatsclone.utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.ubereatsclone.OfferRvFragment;
import com.example.ubereatsclone.modelClass.OfferMainImagePosition;
import com.example.ubereatsclone.modelClass.OfferModel;
import com.example.ubereatsclone.modelClass.RTL_model;

import java.util.ArrayList;

public class OfferPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<RTL_model> mList;
    private int position;
    private static final String TAG = "OfferPagerAdapter1";

    public OfferPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<RTL_model> mList) {
        super(fm, behavior);
        this.mList = mList;


    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        OfferRvFragment fragment = new OfferRvFragment(mList.get(position).getOffers());
        Log.d(TAG, "getItem: "+position);
        return fragment;
    }

    @Override
    public int getCount() {
        return mList.size();
    }


    //get tab_item
    public RTL_model get_item(int position) {
//        Log.d(TAG, "get_item: "+position);
        return mList.get(position);
    }

}
