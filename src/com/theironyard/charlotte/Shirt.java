package com.theironyard.charlotte;


public class Shirt extends InventoryItem {
    public Shirt (String name, int quantity){
        super (name, quantity);
        this.category = "shirt";
    }
}
