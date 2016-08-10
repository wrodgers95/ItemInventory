package com.theironyard.charlotte;

/**
 * Created by Blake on 8/9/16.
 */
public class Accessory extends InventoryItem {
    public Accessory (String name, int quantity){
        super (name, quantity);
        this.category = "Accessory";
    }
}
