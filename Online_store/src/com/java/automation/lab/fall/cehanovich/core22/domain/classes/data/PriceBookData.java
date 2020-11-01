package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;

import java.util.Arrays;

public class PriceBookData extends Data {
    private PriceBook[] priceBooks;

    public PriceBookData(String information, PriceBook[] priceBooks) {
        this.information = information;
        this.priceBooks = priceBooks;
    }

    public PriceBook[] getPriceBooks() {
        return priceBooks;
    }

    public void setPriceBooks(PriceBook[] priceBooks) {
        this.priceBooks = priceBooks;
    }


    @Override
    public String toString() {
        return "PriceBook Data {\nInformation: " + information + "Orders: " + Arrays.toString(priceBooks) + "\n}";
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
        PriceBookData other = (PriceBookData) that;
        return information.equals(other.information) && Arrays.equals(priceBooks,other.priceBooks);
    }

    @Override
    public int hashCode() {
        return information.hashCode() + Arrays.hashCode(priceBooks);
    }
}
