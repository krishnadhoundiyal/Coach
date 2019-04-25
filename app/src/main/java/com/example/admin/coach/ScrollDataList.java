package com.example.admin.coach;

import java.util.ArrayList;
import java.util.List;

public class ScrollDataList implements BaseDataModel {
    private List<? extends  BaseDataModel> ScrollElementList;
    private String Description;
    private int ItemsPerScreenWidth;
    ScrollDataList(List<? extends BaseDataModel> items, String desc,int itemsPerScreenWidth) {
        ScrollElementList = items;
        Description = desc;
        ItemsPerScreenWidth = itemsPerScreenWidth;
    }

    public String getDescription() {
        return Description;
    }

    public int getItemsPerScreenWidth() {
        return ItemsPerScreenWidth;
    }

    public List<? extends  BaseDataModel> getAllElements() {
        return ScrollElementList;
    }
    @Override
    public int getViewType() {
        return 3;
    }
}
