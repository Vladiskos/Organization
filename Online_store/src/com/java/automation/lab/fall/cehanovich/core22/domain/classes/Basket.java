package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentMethod;

import java.util.Arrays;

public class Basket {
    private Variation[] variations;
    private int varCounter = 0;
    private int totalPrice;
    private PaymentMethod paymentMethod;
    private PriceBook priceBook;
    private Coupon coupon;
    private User user;

    public Basket(Variation[] variations, int totalPrice, PaymentMethod paymentMethod, PriceBook priceBook,
                  Coupon coupon) {
        this.variations = variations;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.priceBook = priceBook;
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

    public PriceBook getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(PriceBook priceBook) {
        this.priceBook = priceBook;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addVariation(Variation variation) {
        variations[varCounter] = variation;
        varCounter++;
    }

    public void deleteVariation(int index) {
        for (int i = index; i < variations.length; i++) {
            variations[i] = variations[++i];
        }
        variations[varCounter - 1] = null;
        varCounter--;
    }

    public Order createOrder() {

        return new Order(this, "");
    }

    public int countTotalPrice() {
        totalPrice = 0;
        for (Variation variation : variations) {
            for (Variation var : priceBook.getPriceAndProduct().keySet()) {
                if (variation.equals(var)) {
                    totalPrice += priceBook.getPriceAndProduct().get(variation) -
                            (totalPrice / 100) * variation.getDiscount();
                }
            }
        }
        totalPrice -= (totalPrice / 100) * coupon.getDiscount();
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Basket {\nVariations: " + Arrays.toString(variations) + "Total Price: " + totalPrice +
                "PaymentMethod: " + paymentMethod + "Price book: " + priceBook.toString() + "Coupon: " +
                coupon.toString() + "\n}";
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
