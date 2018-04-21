package com.jskel.android.searchit;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplaySearchAdapter extends RecyclerView.Adapter<DisplaySearchAdapter.ViewHolder> {
    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder { //my ViewHolder
        public TextView mTextView;
        public ViewHolder(TextView view){
            super(view); //ViewHolder has no default constructor. Therefore it must be instantiated with a View
            mTextView = view;
        }
    }

    public DisplaySearchAdapter (String[] myDataSet){
        mDataSet = myDataSet;
    }

    @Override
    public DisplaySearchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

    }
    
}
