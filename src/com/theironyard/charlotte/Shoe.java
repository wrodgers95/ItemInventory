package com.theironyard.charlotte;

/**
 * Created by Blake on 8/9/16.
 */
public class Shoe extends InventoryItem {
    public Shoe (String name, int quantity){
        super (name, quantity);
        this.category = "shoe";
    }
}
