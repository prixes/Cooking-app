package com.prixesoft.cooking.data.binding;

/**
 * Created by david on 28-Mar-17.
 */


import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.widget.ImageView;


public class AddRecipeGUI extends BaseObservable {

    private ImageView imageViews[] = new ImageView[6];
    private String title , ingredients , description ;
    private String timeToCook , timeToCooking , timeToPrepare ;
    private String spTimeToCook , spTimeToCooking , spTimeToPrepare ;



    public ImageView[] getImageViews() {
        return imageViews;
    }

    public void setImageViews(ImageView[] imageViews) {
        this.imageViews = imageViews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(String timeToCook) {
        this.timeToCook = timeToCook;
    }

    public String getTimeToCooking() {
        return timeToCooking;
    }

    public void setTimeToCooking(String timeToCooking) {
        this.timeToCooking = timeToCooking;
    }

    public String getTimeToPrepare() {
        return timeToPrepare;
    }

    public void setTimeToPrepare(String timeToPrepare) {
        this.timeToPrepare = timeToPrepare;
    }

    public String getSpTimeToCook() {
        return spTimeToCook;
    }

    public void setSpTimeToCook(String spTimeToCook) {
        this.spTimeToCook = spTimeToCook;
    }

    public String getSpTimeToCooking() {
        return spTimeToCooking;
    }

    public void setSpTimeToCooking(String spTimeToCooking) {
        this.spTimeToCooking = spTimeToCooking;
    }

    public String getSpTimeToPrepare() {
        return spTimeToPrepare;
    }

    public void setSpTimeToPrepare(String spTimeToPrepare) {
        this.spTimeToPrepare = spTimeToPrepare;
    }
}
