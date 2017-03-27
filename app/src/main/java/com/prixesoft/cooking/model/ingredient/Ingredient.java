package com.prixesoft.cooking.model.ingredient;

import android.content.Intent;
import android.content.res.Resources;

import com.prixesoft.cooking.R;


/**
 * Created by david on 27-Mar-17.
 */

public class Ingredient {

    private float amount;
    private MeasureType type;

    private String name;
    boolean isSpice;

    Ingredient () {

    }

    Ingredient (Number amount, MeasureType type , String name, boolean isSpice) {
        this.amount = amount.floatValue();
        this.type = type ;
        this.name = name ;
        this.isSpice = isSpice ;

    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public MeasureType getType() {
        return type;
    }

    public void setType(MeasureType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpice() {
        return isSpice;
    }

    public void setSpice(boolean spice) {
        isSpice = spice;
    }


    public String toString() {


        return amount + " " + getTypeString(type) + " " + name ;
    }




    public final static String getTypeString(MeasureType type) {

        switch(type) {
            case NUMBER:
                return Resources.getSystem().getString(R.string.number);
            case TEASPOON:
                return Resources.getSystem().getString(R.string.teaspoon);
            case TABLESPOON:
                return Resources.getSystem().getString(R.string.tablespoon);
            case FLUID_OUNCE:
                break;
            case GILL:
                break;
            case CUP:
                return Resources.getSystem().getString(R.string.cup);
            case PINT:
                break;
            case QUART:
                break;
            case GALLON:
                break;
            case DECILITER:
                break;
            case MILLILITER:
                return Resources.getSystem().getString(R.string.milliliter);
            case LITRE:
                return Resources.getSystem().getString(R.string.liter);
            case POUND:
                break;
            case OUNCE:
                break;
            case MILLIGRAM:
                return Resources.getSystem().getString(R.string.milligram);
            case GRAM:
                return Resources.getSystem().getString(R.string.gram);
            case KILOGRAM:
                return Resources.getSystem().getString(R.string.kilogram);
            case MILLIMETER:
                break;
            case CENTIMETER:
                break;
            case METER:
                break;
            case INCH:
                break;
            case PINCH:
                return Resources.getSystem().getString(R.string.pinch);
            case ERROR:
                break;
        }

    return "Error";
    }


    // NUMBER ,TEASPOON , TABLESPOON , FLUID_OUNCE , GILL ,
    // CUP , PINT , QUART , GALLON , DECILITER , MILLILITER, LITRE ,
    // POUND , OUNCE , MILLIGRAM , GRAM , KILOGRAM ,
    // MILLIMETER , CENTIMETER , METER , INCH
    MeasureType convertTypeFromString(String type) {
        if ( type.equals("чаена лъжица") ) return MeasureType.TEASPOON;
        if ( type.equals("супена лъжица") ) return MeasureType.TABLESPOON;
        return MeasureType.ERROR ;
    }
}
