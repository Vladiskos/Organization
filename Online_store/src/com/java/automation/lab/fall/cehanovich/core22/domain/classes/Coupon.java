package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class Coupon {
    private int id;
    private boolean enabled;
    private int discount;

    public Coupon(int id, boolean enabled, int discount) {
        this.id = id;
        this.enabled = enabled;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Coupon {\nID: " + id + "Is enabled" + enabled + "Discount: " + discount + "%\n}";
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
        Coupon other = (Coupon) that;
        return id == other.id && enabled == other.enabled && discount == other.discount;
    }

    @Override
    public int hashCode() {
        return id * 13 + discount + 3;
    }
}
