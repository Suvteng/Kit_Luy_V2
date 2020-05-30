package com.chester.kit_luyv2.model;

public class Item {
    private String itemName;
    private String date;
    private String price;

    public Item(String itemName, String date, String price) {
        this.itemName = itemName;
        this.date = date;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
