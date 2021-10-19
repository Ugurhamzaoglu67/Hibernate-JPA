package com.ugurhmz.product.model.enums;



public enum EnumProductType {

    FOOD("Food"),
    DRINK("Drink"),
    CLOTHES("Clothes"),
    SHOES("Shoes"),
    CONSUMABLE("Consumable");

    private final String type;

    EnumProductType(String type) {
        this.type = type;
    }


    public String getType() { return type; }
}
