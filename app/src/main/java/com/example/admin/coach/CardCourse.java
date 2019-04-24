package com.example.admin.coach;

import android.graphics.drawable.Icon;

public class CardCourse {
    private String  action1;
    private String  action2;
    private int  image;
    private int rating;
    private String course;
    public CardCourse(int img,int rating,String course) {
        this.action1 = "SEEK";
        this.action1 = "PLAN";
        this.image = img;
        this.rating = rating;
        this.course = course;
    }

    public int getImageIcon() {
        return R.drawable.cheese_1;
    }

    public String getCourseText() {
        return new String("Physics");
    }

    public int getMultipleIcon() {
        return R.drawable.baseline_group_black_24;
    }
    public int getSingleIcon () {
        return R.drawable.baseline_group_black_24;
    }
    public int getImageLocation () { return this.image;}
}
