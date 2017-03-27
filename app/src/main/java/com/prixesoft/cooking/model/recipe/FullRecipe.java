package com.prixesoft.cooking.model.recipe;

import com.prixesoft.cooking.model.ingredient.Ingredient;

import java.util.Deque;

/**
 * Created by david on 27-Mar-17.
 */

public class FullRecipe extends Recipe {

    int timeToCock , timePreparing , timeCooking;
    int vegi;                                                   // 0 - non vegi  1 - vegi  2 - vegan
    Deque<String> tags;

    public FullRecipe(){

    }

    public FullRecipe(String name , RecipeType type , Deque<Ingredient> ingredients , String description) {

        super(name , type , ingredients , description);
    }

    public int getVegi() {
        return vegi;
    }

    public void setVegi(int vegi) {
        this.vegi = vegi;
    }

    public int getTimeToCock() {
        return timeToCock;
    }

    public void setTimeToCook(int timeToCock) {
        this.timeToCock = timeToCock;
    }

    public int getTimePreparing() {
        return timePreparing;
    }

    public void setTimePreparing(int timePreparing) {
        this.timePreparing = timePreparing;
    }

    public int getTimeCooking() {
        return timeCooking;
    }

    public void setTimeCooking(int timeCooking) {
        this.timeCooking = timeCooking;
    }

    public Deque<String> getTags() {
        return tags;
    }

    public void setTags(Deque<String> tags) {
        this.tags = tags;
    }
}
