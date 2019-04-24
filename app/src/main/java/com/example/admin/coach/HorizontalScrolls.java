package com.example.admin.coach;

import java.util.ArrayList;
import java.util.List;

public class HorizontalScrolls implements BaseDataModel {
    private List<? extends BaseDataModel> ListReference;
    public HorizontalScrolls(List<? extends  BaseDataModel> listItem){
        ListReference = new ArrayList<>(listItem);
    }
    @Override
    public int getViewType() {
        return 3;
    }

    public List<? extends BaseDataModel> getListReference() {
        return ListReference;
    }
}
