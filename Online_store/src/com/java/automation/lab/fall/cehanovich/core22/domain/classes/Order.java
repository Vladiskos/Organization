package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Order {
    private int id;
    private Basket basket;
    private String description;
    private BigDecimal tax;
    private BigDecimal totalPrice;

    public Order(int id, Basket basket, String description, BigDecimal tax) {
        this.id = id;
        this.basket = basket;
        this.description = description;
        this.tax = tax;
        this.totalPrice = basket.getTotalPrice();
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal countTotalPrice() {
        totalPrice = totalPrice.setScale(2, RoundingMode.CEILING);

        totalPrice = totalPrice.add(totalPrice.divide(new BigDecimal(100)).multiply(tax));
        return totalPrice;
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
