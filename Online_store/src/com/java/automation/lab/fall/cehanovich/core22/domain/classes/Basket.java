package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Date;

public class Basket {
    private Variation[] variations;
    private int varCounter = 0;
    private BigDecimal totalPrice;
    private PaymentMethod paymentMethod;
    private PriceBook priceBook;
    private Coupon coupon;
    private User user;
    private BillingInfo billingInfo;
    private ShippingInfo shippingInfo;

    public Basket(Variation[] variations, BigDecimal totalPrice, PaymentMethod paymentMethod, PriceBook priceBook,
                  Coupon coupon, BillingInfo billingInfo, ShippingInfo shippingInfo) {
        this.variations = variations;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.priceBook = priceBook;
        this.coupon = coupon;
        this.billingInfo = billingInfo;
        this.shippingInfo = shippingInfo;

    }

    public Variation[] getVariations() {
        return variations;
    }

    public void setVariations(Variation[] variations) {
        this.variations = variations;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
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

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
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
        return new Order(this, "", new BigDecimal(5), totalPrice);
    }

    public ShippingInfo createShipping(Date date, String address) {
        return new ShippingInfo(date, address, user);
    }

    public BigDecimal countTotalPrice() {
        totalPrice = new BigDecimal(0);
        totalPrice = totalPrice.setScale(2, RoundingMode.CEILING);

        for (Variation variation : variations) {
            for (Variation var : priceBook.getPriceAndProduct().keySet()) {
                if (variation.equals(var)) {
                    totalPrice = totalPrice.add(priceBook.getPriceAndProduct().get(variation)
                            .subtract(priceBook.getPriceAndProduct().get(variation)
                                    .divide(new BigDecimal(100)))
                            .multiply(new BigDecimal(variation.getDiscount())));
                }
            }
        }
        totalPrice = (totalPrice.divide(new BigDecimal(100), 2)).
                multiply(new BigDecimal(coupon.getDiscount()));
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
        return Arrays.equals(variations, other.variations) && totalPrice.equals(other.totalPrice) &&
                paymentMethod.equals(other.paymentMethod) && coupon.equals(other.coupon);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(variations) + totalPrice.hashCode() - paymentMethod.hashCode() + coupon.hashCode();
    }

}
