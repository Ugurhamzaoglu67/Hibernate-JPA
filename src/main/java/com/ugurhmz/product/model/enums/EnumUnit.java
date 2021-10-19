package com.ugurhmz.product.model.enums;



public enum EnumUnit {

    TOTAL("Total"),
    KG("Kilogramme"),
    LITER("Liter"),
    PORTION("Portion"),
    PACKAGE("Package");


    private final String unit;


    EnumUnit(String unit){
        this.unit = unit;
    }

    private String getUnit(){ return unit; }



}
