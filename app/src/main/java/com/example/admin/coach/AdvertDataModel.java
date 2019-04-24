package com.example.admin.coach;

public class AdvertDataModel implements BaseDataModel {
    private int Image;
    private String Text;
    private String Description;
    public AdvertDataModel(int img, String text, String desc) {
        Image = img;
        Text = text;
        Description = desc;
    }

    public String getDescription() {
        return Description;
    }

    public void SetImage(int img) {
        Image = img;
    }
    public int getImage() {
        return Image;
    }

    public void setText(String text) {
        Text = text;
    }
    public String getText() {
        return Text;
    }

    @Override
    public int getViewType() {
        return 1;
    }
}
