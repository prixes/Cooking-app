package com.prixesoft.cooking.IO;

import android.content.Context;
import android.content.res.Resources;
import android.util.JsonReader;

import com.prixesoft.cooking.R;
import com.prixesoft.cooking.model.recipe.FullRecipe;
import com.prixesoft.cooking.model.recipe.Recipe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by david on 27-Mar-17.
 */

public class RecipeReaderJSON {

    static Recipe readJSON (String fileName , Context context) throws IOException {

        FullRecipe recipe = new FullRecipe();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(context.getFilesDir() +  "/" + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Error catching
        }

        JsonReader jsonReader = new JsonReader(fileReader);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String name = jsonReader.nextName();
            if(name.equals(Resources.getSystem().getString(R.string.json_title)))
                recipe.setName(jsonReader.nextString());
            if(name.equals(Resources.getSystem().getString(R.string.json_type)))
              ///  recipe.setType(jsonReader.);                               < ====== object to enum ???1
            return recipe;
            if(name.equals(Resources.getSystem().getString(R.string.json_ingredients))) {
                jsonReader.nextString();                                 ///  <============================== ingredients
            }
            if(name.equals(Resources.getSystem().getString(R.string.json_description))) {
                recipe.setDescription(jsonReader.nextString());
            }
            if(name.equals(Resources.getSystem().getString(R.string.json_timePreparing))) {
                recipe.setTimePreparing(jsonReader.nextInt());
            }
            if(name.equals(Resources.getSystem().getString(R.string.json_timeToCook))) {
                recipe.setTimeToCook(jsonReader.nextInt());
            }
            if(name.equals(Resources.getSystem().getString(R.string.json_timeCooking))) {
                recipe.setTimeCooking(jsonReader.nextInt());
            }
            if(name.equals(Resources.getSystem().getString(R.string.json_vegi))) {
                recipe.setVegi(jsonReader.nextInt());
            }

            if(name.equals(Resources.getSystem().getString(R.string.json_tags))) {
                recipe.setDescription(jsonReader.nextString());  //   <========== tags reading
            }
        }











        return recipe;
    }
}
