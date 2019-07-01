package com.example.ubereatsclone.modelClass;

import java.util.ArrayList;

public class MainModel {

    private String title;
    private ArrayList<RestroPOJOsingle> mList;



    public MainModel(String title, ArrayList<RestroPOJOsingle> mList) {
        this.title = title;
        this.mList = mList;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<RestroPOJOsingle> getmList() {
        return mList;
    }
}
