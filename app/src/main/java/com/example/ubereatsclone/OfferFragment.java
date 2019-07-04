package com.example.ubereatsclone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubereatsclone.modelClass.OfferModel;
import com.example.ubereatsclone.utils.OfferRTLAdapter;
import com.nshmura.recyclertablayout.RecyclerTabLayout;

import java.util.ArrayList;


public class OfferFragment extends Fragment {

    private ArrayList<OfferModel> mList;
    private OfferRTLAdapter adapter;
    private ViewPager mViewPager;
    private RecyclerTabLayout mRTL;

    public static String[] images = {
            "https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://cdn.pixabay.com/photo/2018/02/09/21/46/rose-3142529__340.jpg"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_offer, container, false);

        mViewPager = view.findViewById(R.id.offerViewPager);
        mRTL = view.findViewById(R.id.offerRTL);
        mList = new ArrayList<>();
        mList.add(new OfferModel(images[0],"qwerty", "asd", "21:23","4.5"));


        return view;
    }
}
