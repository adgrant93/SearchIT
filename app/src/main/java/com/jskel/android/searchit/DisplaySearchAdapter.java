package com.jskel.android.searchit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class DisplaySearchAdapter extends RecyclerView.Adapter<DisplaySearchAdapter.ViewHolder> {
    private List<Results> resultsList;

    public static class ViewHolder extends RecyclerView.ViewHolder { //my ViewHolder
        public TextView mTextView;
        public ViewHolder(TextView view){
            super(view); //ViewHolder has no default constructor. Therefore it must be instantiated with a View
            mTextView = (TextView) view.findViewById(R.id.resultTitle);
        }
    }

    public DisplaySearchAdapter (List<Results> myDataSet){
        this.resultsList = myDataSet;
    }

    /*
    * This class inflates the view, passes the view to the holder, and returns that to the LayoutManager
    * */

    @Override
    public DisplaySearchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        TextView view = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.display_search_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Results results = resultsList.get(position);
        holder.mTextView.setText(results.getTitle());
     //   notifyItemChanged(position);
    }

    @Override
    public int getItemCount(){
        return resultsList.size();
    }
    
}
