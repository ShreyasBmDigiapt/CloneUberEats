package com.example.ubereatsclone.modelClass;

import java.util.ArrayList;

public class HistoryRTLItems {

    private ArrayList<HistoryItems> historyItemsList;
    private String historyTabTitle;

    public HistoryRTLItems(ArrayList<HistoryItems> historyItemsList, String historyTabTitle) {
        this.historyItemsList = historyItemsList;
        this.historyTabTitle = historyTabTitle;
    }

    public ArrayList<HistoryItems> getHistoryItemsList() {
        return historyItemsList;
    }

    public void setHistoryItemsList(ArrayList<HistoryItems> historyItemsList) {
        this.historyItemsList = historyItemsList;
    }

    public String getHistoryTabTitle() {
        return historyTabTitle;
    }

    public void setHistoryTabTitle(String historyTabTitle) {
        this.historyTabTitle = historyTabTitle;
    }
}
