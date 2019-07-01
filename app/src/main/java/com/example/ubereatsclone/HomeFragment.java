package com.example.ubereatsclone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubereatsclone.modelClass.MainModel;
import com.example.ubereatsclone.modelClass.RestroPOJOsingle;
import com.example.ubereatsclone.utils.MainAdapter;
import com.example.ubereatsclone.utils.PageAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    public ArrayList<Object> list = new ArrayList<>();
    private ArrayList<RestroPOJOsingle> li = new ArrayList<>();
    private String[] images = {
            "https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://cdn.pixabay.com/photo/2018/02/09/21/46/rose-3142529__340.jpg"
    };
    //sfasfaf
    private static final String TAG = "HomeFragment1";

    private MainAdapter adapter;
    private RecyclerView mMainRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mMainRecyclerView = view.findViewById(R.id.mainRecyclerView);
        adapter = new MainAdapter( getActivity(), list);
        mMainRecyclerView.hasFixedSize();
        mMainRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        li.add(new RestroPOJOsingle(
                        "rerqerereq",
                        images[0],
                        "Dish 1",
                        "sasafasag",
                        "23: 43 ",
                        "4.5 star"
                )
        );

        li.add(new RestroPOJOsingle(
                        "rerqerereq",
                        images[0],
                        "Dish 1",
                        "sasafasag",
                        "23: 43 ",
                        "4.5 star"
                )
        );
        li.add(new RestroPOJOsingle(
                        "rerqerereq",
                        images[0],
                        "Dish 1",
                        "sasafasag",
                        "23: 43 ",
                        "4.5 star"
                )
        );

        list.add(new MainModel(
                "BVS RESTRO",
                li
        ));
        list.add(new MainModel(
                "RANDE RESTRO",
                li
        ));
        list.add(new RestroPOJOsingle(
                "rerqerereq",
                images[0],
                "Dish 1",
                "sasafasag",
                "23: 43 ",
                "4.5 star"
        ));

        list.add(new RestroPOJOsingle(
                "rerqerereq",
                images[0],
                "Dish 1",
                "sasafasag",
                "23: 43 ",
                "4.5 star"
        ));

        list.add(new RestroPOJOsingle(
                "rerqerereq",
                images[0],
                "Dish 1",
                "sasafasag",
                "23: 43 ",
                "4.5 star"
        ));

        list.add(new RestroPOJOsingle(
                "rerqerereq",
                images[0],
                "Dish 1",
                "sasafasag",
                "23: 43 ",
                "4.5 star"
        ));

        mMainRecyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }


}





