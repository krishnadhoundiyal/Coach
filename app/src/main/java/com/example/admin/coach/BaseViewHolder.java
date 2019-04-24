package com.example.admin.coach;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    BaseViewHolder(View itemView){
        super(itemView);
    }
    public abstract void bind(T Object);
}
