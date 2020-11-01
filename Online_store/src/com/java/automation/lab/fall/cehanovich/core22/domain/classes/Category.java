package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class Category {
    private int id;
    private Subcategory[] subcategories;
    private String name;

    public Category(int id, Subcategory[] subcategories, String name) {
        this.id = id;
        this.subcategories = subcategories;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subcategory[] getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(Subcategory[] subcategories) {
        this.subcategories = subcategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Category {\nID: " + id + "Subcategories" + Arrays.toString(subcategories) + "Name: " + name + "\n}";
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
        Category other = (Category) that;
        return id == other.id && Arrays.equals(subcategories, other.subcategories) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(subcategories) + id + name.hashCode();
    }

}