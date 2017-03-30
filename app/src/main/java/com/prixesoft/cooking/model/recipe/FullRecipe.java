package com.prixesoft.cooking.model.recipe;

import com.prixesoft.cooking.model.ingredient.Ingredient;

import java.util.Deque;

/**
 * Created by david on 27-Mar-17.
 */

public class FullRecipe extends Recipe {

    int timeToCook, timePreparing , timeCooking;
    VegiInfo vegi;
    Deque<String> tags;

    public FullRecipe(){
        super();
        timeToCook = 0;
        timePreparing = 0;
        timeCooking = 0;
        vegi = VegiInfo.NON_VERI;
        // tags
    }

    public FullRecipe(String name , RecipeType type , Deque<Ingredient> ingredients , String description) {

        super(name , type , ingredients , description);
    }

    public VegiInfo getVegi() {
        return vegi;
    }

    public void setVegi(VegiInfo vegi) {
        this.vegi = vegi;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(int timeToCock) {
        this.timeToCook = timeToCock;
    }

    public int getTimePreparing() {
        return timePreparing;
    }

    public void setTimePrepare(int timePreparing) {
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
