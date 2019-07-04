package com.example.ubereatsclone.utils;

import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.ubereatsclone.R;
import com.example.ubereatsclone.modelClass.OfferMainImagePosition;
import com.example.ubereatsclone.modelClass.OfferModel;
import com.example.ubereatsclone.modelClass.RTL_model;
import com.nshmura.recyclertablayout.RecyclerTabLayout;

public class OfferRTLAdapter extends RecyclerTabLayout.Adapter<OfferRTLAdapter.RTLHolder> {

    private OfferPagerAdapter mAdapter;
    private static final String TAG = "OfferRTLAdapter1";
    private int position;


    public OfferRTLAdapter(ViewPager viewPager, int position) {
        super(viewPager);
        mAdapter = (OfferPagerAdapter)mViewPager.getAdapter();
        this.position = position;
    }

    @NonNull
    @Override
    public RTLHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rtl_text, parent, false);
        return new RTLHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RTLHolder holder, int pos) {

        RTL_model model = mAdapter.get_item(pos);
        SpannableString title = new SpannableString(model.getTabTitle());
        position = pos;
        Log.d(TAG, "onBindViewHolder: "+pos);
        holder.mRTLText.setText(title);
    }

    @Override
    public int getItemCount() {
        return mAdapter.getCount();
    }

    public class RTLHolder extends RecyclerView.ViewHolder {
        private TextView mRTLText;

        public RTLHolder(@NonNull View itemView) {
            super(itemView);
            mRTLText = itemView.findViewById(R.id.RTLText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getViewPager().setCurrentItem(getAdapterPosition());
                }
            });
        }
    }
}
