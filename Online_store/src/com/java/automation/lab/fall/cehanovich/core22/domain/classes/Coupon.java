package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

public class Coupon {
    private int id;
    private boolean enabled;
    private int discountPercent;

    public Coupon(int id, boolean enabled, int discountPercent) {
        this.id = id;
        this.enabled = enabled;
        this.discountPercent = discountPercent;
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

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Coupon {\nID: " + id + "Is enabled" + enabled + "Discount: " + discountPercent + "%\n}";
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
        return id == other.id && enabled == other.enabled && discountPercent == other.discountPercent;
    }

    @Override
    public int hashCode() {
        return id * 13 + discountPercent + 3;
    }
}
