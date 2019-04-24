package com.example.admin.coach;

import java.util.ArrayList;
import java.util.List;

public class ScrollDataList implements BaseDataModel {
    private List<? extends  BaseDataModel> ScrollElementList;
    private String Description;
    ScrollDataList(List<? extends BaseDataModel> items, String desc) {
        ScrollElementList = items;
        Description = desc;
    }

    public String getDescription() {
        return Description;
    }

    public List<? extends  BaseDataModel> getAllElements() {
        return ScrollElementList;
    }
    @Override
    public int getViewType() {
        return 3;
    }
}
