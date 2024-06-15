package com.example.fitfinessee.RecipePage.data.model;

import java.util.List;

public class Recipe {
    int id, categoryId;
    String name, imageUrl, description;
    List<Ingredient> ingredients;
    List<String> steps;

    public Recipe(int id, int categoryId, String name, String imageUrl, String description, List<Ingredient> ingredients, List<String> steps) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }
}
