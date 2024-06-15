package com.example.fitfinessee.RecipePage.data.model;

public class Ingredient {
    String name, imageUrl, amount;

    public Ingredient(String name, String imageUrl, String amount) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAmount() {
        return amount;
    }
}
