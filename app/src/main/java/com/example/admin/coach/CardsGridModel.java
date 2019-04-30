package com.example.admin.coach;

public class CardsGridModel implements BaseDataModel {
    private int image;
    private String text;
    private int index;
    private String type;
    CardsGridModel(String txt, int img, int indx,String tpe) {
       image = img;
       text = txt;
       index = indx;
       type = tpe;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    @Override
    public int getViewType() {
        if (type.equals("staggered")) {
            if (index % 3 == 0) {
                //return type for full row span
                return 60;
            } else {
                return 61;
            }
        } else {
            if (text.equals("MultiRow")) {
                return 61;
            } else if (text.equals("SingleRow")) {
                return 60;
            }
        }

        return 0;
    }
}
