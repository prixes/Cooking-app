package com.prixesoft.cooking.IO;

import android.content.Context;
import android.content.res.Resources;

import com.prixesoft.cooking.R;
import com.prixesoft.cooking.model.ingredient.Ingredient;
import com.prixesoft.cooking.model.recipe.FullRecipe;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Deque;

/**
 * Created by david on 27-Mar-17.
 */

public class RecipeWriteJSON {

    static JSONArray jsonPacket = new JSONArray();

    //Building creating and writing JSON file
     public void writeJSON(FullRecipe recipe, Context context) throws JSONException {

        // Building whole JSON structure
        //   JSONObject jsonImage = new JSONObject();
    //    JSONArray jsonImages = new JSONArray();
    //    for(int i=0; i <= 5 ; i ++) {
    //        if( imagePath[i] !=null)
    //            jsonImage.put("type",imageType[i] == true ? "gallery" : "camera");
    //        jsonImage.put("path",imagePath[i]);
    //        jsonImages.put(jsonImage);
    //        jsonImage = new JSONObject();
    //    }


        JSONObject jsonGeneral = new JSONObject();
       // jsonGeneral.put("images",jsonImages);

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_title) , recipe.getTitle() );
        jsonGeneral.put(Resources.getSystem().getString(R.string.json_type) , recipe.getType()) ;

        JSONArray iArray = new JSONArray();
        Deque<Ingredient> ingredients = recipe.getIngredients();
        while ( !ingredients.isEmpty()) {
            iArray.put(ingredients.removeFirst());
        }
        jsonGeneral.put(Resources.getSystem().getString(R.string.json_ingredients), iArray) ;

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_description), recipe.getDescription()) ;

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_timePreparing) , recipe.getTimePreparing());

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_timeToCook) , recipe.getTimeToCook());

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_timeCooking ) , recipe.getTimeCooking());

        jsonGeneral.put(Resources.getSystem().getString(R.string.json_vegi) , recipe.getVegi());

        JSONArray tagArray = new JSONArray();
        Deque<String> tags = recipe.getTags();
        while ( !tags.isEmpty()) {
            tagArray.put(ingredients.removeFirst());
        }
        jsonGeneral.put(Resources.getSystem().getString(R.string.json_tags) , tagArray) ;



        jsonPacket.put(jsonGeneral);


         String fileName = "1.json";
         String path = context.getFilesDir().toString();
         File file = new File( path +  "/" + fileName);

        if(!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try{
            // Writting json file to /data/data/com.prixesoft.cooking
            FileWriter fileWriter = new FileWriter(path +  "/" + path);
            fileWriter.write(jsonPacket.toString(2));
            fileWriter.flush();
            fileWriter.close();


        }catch (Exception e){
            System.err.println("Error: " + e);

        }

    }
}
