package com.example.fitfinessee.RecipePage.data.model;

import androidx.annotation.DrawableRes;

public class Category {
    int id;
    String name;
    @DrawableRes int image;

    public Category(int id, String name, @DrawableRes int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public @DrawableRes int getImage() {
        return image;
    }
}
