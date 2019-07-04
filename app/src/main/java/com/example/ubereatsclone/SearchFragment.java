package com.example.ubereatsclone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ubereatsclone.modelClass.SearchModel;
import com.example.ubereatsclone.modelClass.SearchSingleModel;
import com.example.ubereatsclone.utils.SearchListImageAdapter;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    private RecyclerView mSearchRview;
    private Toolbar mSearchTT;
    private EditText mSearchEtext;
    private TextView mSearchDelete;
    private SearchListImageAdapter adapter;
    private ArrayList<SearchModel> mlist;
    private ArrayList<SearchSingleModel> imageList;

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
        View view =  inflater.inflate(R.layout.fragment_search, container, false);
        initialize(view);

            adapterSet();

        mSearchRview = view.findViewById(R.id.searchRview);
        mSearchEtext = view.findViewById(R.id.searchEtext);
//        mSearchDelete = view.findViewById(R.id.searchDelete);
        mlist = new ArrayList<>();
        imageList = new ArrayList<>();

        adapter = new SearchListImageAdapter(mlist, getActivity());
        mSearchRview.hasFixedSize();
        mSearchRview.setLayoutManager(new LinearLayoutManager(getActivity()));

        imageList.add(new SearchSingleModel("flower1", images[1]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[1]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));
        imageList.add(new SearchSingleModel("flower1", images[0]));

        mlist.add(new SearchModel("Top Category", imageList));

        mlist.add(new SearchModel("Top Category", imageList));
        mSearchRview.setAdapter(adapter);


        return view;
    }

    private void adapterSet() {

    }


    private void initialize(View view) {

    }




}
