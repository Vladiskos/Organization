package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class Order {
    private Basket basket;
    private String description;

    public Order(Basket basket, String description) {
        this.basket = basket;
        this.description = description;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Order {\nBasket: " + basket.toString() + "Description: " + description + "\n}";
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
        return basket.equals(other.basket) && description.equals(other.description);
    }
    @Override
    public int hashCode() {
        return basket.hashCode() + description.hashCode();
    }

}
