package com.prixesoft.cooking;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.prixesoft.cooking.IO.RecipeWriteJSON;
import com.prixesoft.cooking.data.binding.AddRecipeGUI;
import com.prixesoft.cooking.databinding.AddRecipeBinding;
import com.prixesoft.cooking.model.recipe.FullRecipe;

import org.json.JSONException;

/**
 * Created by david on 28-Mar-17.
 */

public class AddRecipe extends AppCompatActivity {


    AddRecipeGUI addRecipeGUI;
    AddRecipeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);

        binding = DataBindingUtil.setContentView(this, R.layout.add_recipe);
        addRecipeGUI = new AddRecipeGUI();
    }


    public void onButtonPublish(View view) {
        FullRecipe recipe = new FullRecipe();
        recipe.setTitle(addRecipeGUI.getTitle());

       // recipe.setIngredients(addRecipeGUI.getIngredients());
        // parse ingredients
        recipe.setDescription(addRecipeGUI.getDescription());

     //   recipe.setTimeToCook(Integer.parseInt(addRecipeGUI.getTimeToCook()));
      //  recipe.setTimeCooking(Integer.parseInt(addRecipeGUI.getTimeToCooking()));
      //  recipe.setTimePrepare(Integer.parseInt(addRecipeGUI.getTimeToPrepare()));

        RecipeWriteJSON json = new RecipeWriteJSON();
        try {
            json.writeJSON(recipe, this) ;
        } catch (JSONException e) {
            e.printStackTrace();
            return;
        }


        Intent intentAddRecipe = new Intent(this,MainActivity.class);
        intentAddRecipe.putExtra("recipe","1.json");
        startActivity(intentAddRecipe);

    }

}
