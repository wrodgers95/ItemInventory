package com.theironyard.charlotte;

/**
 * Created by Blake on 8/9/16.
 */
public class Pants extends InventoryItem {
    public Pants (String name, int quantity){
        super (name, quantity);
        this.category = "Pants";
    }
}
