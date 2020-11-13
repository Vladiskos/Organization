package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Subcategory implements Comparable<Subcategory> {
    private int id;
    private int discount;
    private String name;
    private Set<Product> products;

    public Subcategory(int id, int discount, String name, Set<Product> products) {
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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Subcategory {\nID: " + id + "Discount: " + discount + "Name: " + name + "Products: " +
                products.toString() + "\n}";
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
                products.equals(other.products);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode() + products.hashCode();
    }


    @Override
    public int compareTo(Subcategory a) {
        return this.getId() - a.getId();
    }

    public static Comparator<Subcategory> DiscountComparator = new Comparator<Subcategory>() {

        @Override
        public int compare(Subcategory a1, Subcategory a2) {
            return a1.getDiscount() - a2.getDiscount();
        }
    };

    public static Comparator<Subcategory> NameComparator = new Comparator<Subcategory>() {

        @Override
        public int compare(Subcategory a1, Subcategory a2) {
            return (a1.getName().compareTo(a2.getName()));
        }
    };
}
