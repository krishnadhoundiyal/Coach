package com.example.admin.coach;

import android.widget.ImageView;
import android.widget.TextView;

public class CardDataModel implements BaseDataModel {
    private int img;
    private String Planet;
    private String Distance;
    private String Weight;
    private String Gravity;
    @Override
    public int getViewType() {
        return 4;
    }
    CardDataModel(String planet,String distance,String weight,String gravity, int image){
        img = image;
        Planet = planet;
        Distance = weight;
        Weight = gravity;
        Gravity = distance;

    }

    public String getDistance() {
        return Distance;
    }

    public String getPlanet() {
        return Planet;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getGravity() {
        return Gravity;
    }

    public void setGravity(String gravity) {
        Gravity = gravity;
    }

    public String getWeight() {
        return Weight;
    }

    public void setPlanet(String planet) {
        Planet = planet;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public int getImg() {
        return img;
    }
}
