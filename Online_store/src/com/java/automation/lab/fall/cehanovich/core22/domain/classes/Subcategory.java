package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class Subcategory {
    private int id;
    private int discount;
    private String name;
    private Product[] products;

    public Subcategory(int id, int discount, String name, Product[] products) {
        this.id = id;
        this.discount = discount;
        this.name = name;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Subcategory {\nID: " + id + "Discount: " + discount + "Name: " + name + "Products: " +
                Arrays.toString(products) + "\n}";
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
        Subcategory other = (Subcategory) that;
        return id == other.id && discount == other.discount && name.equals(other.name) &&
                Arrays.equals(products, other.products);
    }
    @Override
    public int hashCode() {
        return id + name.hashCode() + Arrays.hashCode(products);
    }
}
