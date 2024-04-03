package com.nevanpplg2.favfood.models;

import android.view.View;

public class FoodItem {
    private String name;
    private String description;
    private int image;
    private String imageUrl;

    public FoodItem(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public FoodItem(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Deprecated
    public int getImage() {
        return image;
    }

    @Deprecated
    public void setImage(int image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
