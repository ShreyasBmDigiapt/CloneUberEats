package com.example.ubereatsclone.modelClass;

import java.util.ArrayList;

public class RTL_model {

    private ArrayList<OfferModel> offers;
    private String tabTitle, imageURLS;

    public RTL_model(ArrayList<OfferModel> offers, String tabTitle, String imageURLS) {
        this.offers = offers;
        this.tabTitle = tabTitle;
        this.imageURLS = imageURLS;
    }

    public ArrayList<OfferModel> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<OfferModel> offers) {
        this.offers = offers;
    }

    public String getTabTitle() {
        return tabTitle;
    }

    public void setTabTitle(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public String getImageURLS() {
        return imageURLS;
    }

    public void setImageURLS(String imageURLS) {
        this.imageURLS = imageURLS;
    }
}
