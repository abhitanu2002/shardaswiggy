package org.example;

import java.util.List;

public class Dish {
    private int restroId;

    String dishId;

    String dishName;

    int price;

    //List<Review> reviews;

    //String descriptiion;

    int qty;
    boolean vegNveg;

    public Dish(int id, int restaurantId, String name, double price) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
    }



    public int getRestroId() {
        return restroId;
    }

    public String getDishId() {
        return dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public void setRestroId(int restroId) {
        this.restroId = restroId;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
