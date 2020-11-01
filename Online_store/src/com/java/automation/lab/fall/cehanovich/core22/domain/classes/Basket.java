package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentMethod;

import java.util.Arrays;

public class Basket {
    private Variation[] variations;
    private int totalPrice;
    private PaymentMethod paymentMethod;
    private Coupon coupon;

    public Basket(Variation[] variations, int totalPrice, PaymentMethod paymentMethod, Coupon coupon) {
        this.variations = variations;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.coupon = coupon;
    }

    public Variation[] getVariations() {
        return variations;
    }

    public void setVariations(Variation[] variations) {
        this.variations = variations;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }


    @Override
    public String toString() {
        return "Basket {\nVariations: " + Arrays.toString(variations) + "Total Price: " + totalPrice +
                "PaymentMethod: " + paymentMethod + "Coupon: " + coupon.toString() + "\n}";
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
        Basket other = (Basket) that;
        return Arrays.equals(variations, other.variations) && totalPrice == other.totalPrice &&
                paymentMethod.equals(other.paymentMethod) && coupon.equals(other.coupon);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(variations) + totalPrice - paymentMethod.hashCode() + coupon.hashCode();
    }

}
