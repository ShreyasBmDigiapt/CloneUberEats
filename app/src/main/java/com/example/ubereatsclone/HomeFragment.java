package com.example.ubereatsclone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubereatsclone.utils.PageAdapter;


public class HomeFragment extends Fragment {

    private ViewPager mViewPager;
    private PageAdapter adapter;
    private String[] images = {
            "R.drawable.ubereats", "R.drawable.uber_login", "R.drawable.history"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        mViewPager = view.findViewById(R.id.pager);
        adapter = new PageAdapter(getActivity(), images);
        mViewPager.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}


