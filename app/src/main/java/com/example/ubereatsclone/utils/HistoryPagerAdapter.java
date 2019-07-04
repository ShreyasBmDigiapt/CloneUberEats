package com.example.ubereatsclone.utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.ubereatsclone.HistoryRvFragment;
import com.example.ubereatsclone.modelClass.HistoryRTLItems;

import java.util.ArrayList;

public class HistoryPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<HistoryRTLItems> mList;

    public HistoryPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<HistoryRTLItems> mList) {
        super(fm, behavior);
        this.mList = mList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HistoryRvFragment fragment = new HistoryRvFragment(mList.get(position).getHistoryItemsList());
        return fragment;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
