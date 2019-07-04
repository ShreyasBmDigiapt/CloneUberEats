package com.example.ubereatsclone.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ubereatsclone.R;
import com.example.ubereatsclone.modelClass.SearchSingleModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class SearchSingleImageAdapter extends RecyclerView.Adapter<UberHolder.CategoryHolder> {

    public ArrayList<SearchSingleModel> mlist;
    public Context context;

    public SearchSingleImageAdapter(ArrayList<SearchSingleModel> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public UberHolder.CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_single, parent, false);
        return new UberHolder.CategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UberHolder.CategoryHolder holder, int position) {
        SearchSingleModel pojo = mlist.get(position);
        holder.mCategoryText.setText(pojo.getSearchSingleImageText());
        Picasso.get().load(pojo.searchSingleImageURl).into(holder.mCategoryImage);

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
