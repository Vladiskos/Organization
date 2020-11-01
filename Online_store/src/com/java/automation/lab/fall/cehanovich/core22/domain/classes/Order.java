package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class Order {
    private Basket basket;
    private User user;
    private String address;
    private String description;

    public Order(Basket basket, User user, String address, String description) {
        this.basket = basket;
        this.user = user;
        this.address = address;
        this.description = description;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Order {\nBasket: " + basket.toString() + "User: " + user.toString() + "Address: " + address +
                "Description: " + description + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        Order other = (Order) that;
        return basket.equals(other.basket) && user.equals(other.user) && address.equals(other.address) &&
                description.equals(other.description);
    }
    @Override
    public int hashCode() {
        return basket.hashCode() + user.hashCode() + address.hashCode() - description.hashCode();
    }

}
