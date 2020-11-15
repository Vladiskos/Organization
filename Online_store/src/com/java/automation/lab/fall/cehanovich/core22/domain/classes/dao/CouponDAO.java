package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
import java.util.List;

public interface CouponDAO {
    Coupon create(int id, boolean enabled, int discountPercent);
    Coupon update(Coupon coupon);
    Coupon getById(long id);
    List<Coupon> get();
    void delete(long id);
}
