package com.prixesoft.cooking.model.recipe;

import com.prixesoft.cooking.model.ingredient.Ingredient;

import java.util.Deque;

/**
 * Created by david on 27-Mar-17.
 */

public class Recipe {

    String name;
    RecipeType type;
    Deque<Ingredient> ingredients;
    String description;

    public Recipe() {

    }

    public Recipe (String name , RecipeType type, Deque<Ingredient> ingredients  , String description ){

        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.type = type;
    }



    public Deque<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Deque<Ingredient> ingredients) {
        this.ingredients = ingredients;
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

    public RecipeType getType() {
        return type;
    }

    public void setType(RecipeType type) {
        this.type = type;
    }
}
