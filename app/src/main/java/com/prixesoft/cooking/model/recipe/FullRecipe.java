package com.prixesoft.cooking.model.recipe;

import com.prixesoft.cooking.model.ingredient.Ingredient;

/**
 * Created by david on 27-Mar-17.
 */

public class FullRecipe extends Recipe {

    FullRecipe(String name, String description, Ingredient[] ingredients) {
        super(name, description, ingredients);
    }
}
