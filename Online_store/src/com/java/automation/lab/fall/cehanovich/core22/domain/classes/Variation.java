package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.util.Arrays;

public class Variation extends Thread {
    private int id;
    private Size size;
    private Color color;
    private Product product;
    private int discount;

    public Variation(int id, Size size, Color color, Product product, int discount) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.product = product;
        this.discount = discount;
    }

    public static synchronized void update(Size size, Color color, Product product, int discount) {

    }

    public int getIdd() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "Variation {\nID: " + id + "Size: " + size + "Color: " + color + "Products: " + product.toString()
                + "Discount: " + discount + "\n}";
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
        Variation other = (Variation) that;
        return id == other.id && size.equals(other.size) && color.equals(other.color) &&
                product.equals(other.product) && discount == other.discount;
    }

    @Override
    public int hashCode() {
        return id + size.hashCode() + color.hashCode() + product.hashCode() - discount;
    }
}
