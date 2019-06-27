package com.example.ubereatsclone.login.loginFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.ubereatsclone.R;

public class TroubleFragment5 extends Fragment {

    private FrameLayout mFrame1, mFrame2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trouble_fragment5, container, false);

        mFrame1 = view.findViewById(R.id.troubleFrame1);
        mFrame2 = view.findViewById(R.id.troubleFrame2);
        mFrame2.animate().translationY(-625);

        mFrame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        return  view;
    }
}
