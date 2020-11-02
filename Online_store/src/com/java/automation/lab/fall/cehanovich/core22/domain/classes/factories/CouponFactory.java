package com.java.automation.lab.fall.cehanovich.core22.domain.classes.factories;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;

public class CouponFactory {
    private int idCounter = 1;

    public Coupon createFivePercentCoupon() {
        idCounter++;
        return new Coupon(idCounter, true, 5);
    }

    public Coupon createTenPercentCoupon() {
        idCounter++;
        return new Coupon(idCounter, true, 10);
    }

    public Coupon createFifteenPercentCoupon() {
        idCounter++;
        return new Coupon(idCounter, true, 15);
    }
}
