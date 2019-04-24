package com.example.admin.coach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SubjectItems extends RecyclerView.Adapter<SubjectItems.ViewHolder> {

    @NonNull
    private LayoutInflater mLayoutInflater;
    private ArrayList<CardCourse> dataSet;
    private int itemViewType;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        ViewHolder(View item) {
            super(item);
            imageView = item.findViewById(R.id.imagecardsgrid);
            textView = item.findViewById(R.id.textcardsgrid);
        }

    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // View view = mLayoutInflater.inflate(R.layout.cardview_grids,parent,false);
        View view=  LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_grids,parent,false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            CardCourse card = this.dataSet.get(position);
            Log.d("Image",Integer.toString(card.getImageLocation()));
            Log.d("Text",card.getCourseText());
            holder.imageView.setImageResource(card.getImageLocation());
            holder.textView.setText(card.getCourseText());
    }

    @Override
    public int getItemCount() {
        return this.dataSet.size();
    }
    public SubjectItems(Context context,ArrayList<CardCourse> data) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.dataSet = data;
    }
}
