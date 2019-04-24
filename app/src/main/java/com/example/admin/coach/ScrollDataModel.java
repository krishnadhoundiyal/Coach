package com.example.admin.coach;

public class ScrollDataModel implements BaseDataModel {
    private String text;
    private int image;
    ScrollDataModel(String text,int image) {
        this.text = text;
        this.image = image;
    }
    public void setText(String text) {
        this.text = text;
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
