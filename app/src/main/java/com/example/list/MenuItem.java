package com.example.list;

public class MenuItem {
    private int id;
    private String name;
    private float rating;
    private int quantity;
    private double price;
    private int imageResId;

    public MenuItem(int id, String name, float rating, int quantity, double price, int imageResId ) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.quantity = quantity;
        this.price = price;
        this.imageResId = imageResId;
    }

    public int getId() { return id;}
    public String getName() {return name; }
    public float getRating() { return rating; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public int getImageResId() { return imageResId; }

    //setter
    public void setQuantity(int quantity) {this.quantity = quantity;}
}