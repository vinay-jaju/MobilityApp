package com.deloitte.vjaju.mobilityapp;


public class DashItems {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    private String name;
    private String desc;
    int imageId;

    public DashItems(int imgId,String name, String desc) {
        this.name = name;
        this.imageId=imgId;
        this.desc = desc;
    }
}