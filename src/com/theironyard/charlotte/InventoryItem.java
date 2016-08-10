package com.theironyard.charlotte;

public class InventoryItem {
    public String name;
    public int quantity;
    public String category;


    public InventoryItem(String name, int quantity) {

        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.quantity + this.name + this.category;
    }

    public static InventoryItem createItem(String name, int quantity, String category) {
        if (category.equalsIgnoreCase("Shoe")) {
            return new Shoe(name, quantity);
        } else if (category.equalsIgnoreCase("Shirt")) {
            return new Shirt(name, quantity);
        } else if (category.equalsIgnoreCase("Hat")) {
            return new Hat(name, quantity);
        } else if (category.equalsIgnoreCase("Pants")) {
            return new Pants(name, quantity);
        } else if (category.equalsIgnoreCase("Accessory")) {
            return new Accessory(name, quantity);
        } return createItem(name, quantity, category);
    }
}
