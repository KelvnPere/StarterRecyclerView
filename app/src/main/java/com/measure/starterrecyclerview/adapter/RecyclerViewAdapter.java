package com.measure.starterrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.measure.starterrecyclerview.R;
import com.measure.starterrecyclerview.model.Data;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.myViewHolder>{

    // Data structure for holding the Note Object
    private ArrayList<Data> mData = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<Data> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.my_text_view, viewGroup,false );
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {
     myViewHolder.title.setText(mData.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

//    Created Viewholder class instance

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.note_title);

        }
    }
}
