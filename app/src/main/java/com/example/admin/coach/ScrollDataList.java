package com.example.admin.coach;

import java.util.ArrayList;
import java.util.List;

public class ScrollDataList implements BaseDataModel {
    private List<? extends  BaseDataModel> ScrollElementList;
    private String Description;
    private int ItemsPerScreenWidth;
    private String pagerType;
    ScrollDataList(List<? extends BaseDataModel> items, String desc,int itemsPerScreenWidth,String pager) {
        ScrollElementList = items;
        Description = desc;
        ItemsPerScreenWidth = itemsPerScreenWidth;
        pagerType = pager;
    }

    public String getDescription() {
        return Description;
    }
    public String getPagerType() {
        return pagerType;
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
