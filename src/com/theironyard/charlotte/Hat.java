package com.theironyard.charlotte;

/**
 * Created by Blake on 8/9/16.
 */
public class Hat extends InventoryItem {
    public Hat (String name, int quantity) {
        super(name, quantity);
        this.category = "hat";
    }
}
