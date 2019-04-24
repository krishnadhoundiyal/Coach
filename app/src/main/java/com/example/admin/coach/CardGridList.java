package com.example.admin.coach;

import java.util.ArrayList;
import java.util.List;

public class CardGridList implements BaseDataModel {
    private List<? extends  BaseDataModel> Elements;
    private String Description;
    CardGridList(List<? extends  BaseDataModel> items,String desc) {
        Description = desc;
        Elements = items;
    }
    public List<? extends  BaseDataModel> getAllElements() {
        return Elements;
    }
    public String getDescription() {
        return Description;
    }
    @Override

    public int getViewType() {
        return 5;
    }
}
