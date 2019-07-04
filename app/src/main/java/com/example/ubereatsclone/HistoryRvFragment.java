package com.example.ubereatsclone;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubereatsclone.modelClass.HistoryItems;
import com.example.ubereatsclone.modelClass.HistoryRTLItems;
import com.example.ubereatsclone.utils.HistoryRvAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryRvFragment extends Fragment {

    private RecyclerView mRv;
    private ArrayList<HistoryItems> mList;
    private HistoryRvAdapter adapter;

    public HistoryRvFragment(ArrayList<HistoryItems> mList) {
        this.mList = mList;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_history_rv, container, false);
        mRv = view.findViewById(R.id.historyRv);
        mRv.hasFixedSize();
        mRv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HistoryRvAdapter(mList, getContext());
        mRv.setAdapter(adapter);
        return view;
    }

}
