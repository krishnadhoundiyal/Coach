package com.example.admin.coach;

public class ScrollDataModel implements BaseDataModel {
    private String text;
    private int image;
    private int items;
    ScrollDataModel(String text,int image,int items) {
        this.text = text;
        this.image = image;
        this.items = items;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getItems() {
        return this.items;
    }

    public String getText() {
        return text;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    @Override
    public int getViewType() {
        return 2;
    }
}
