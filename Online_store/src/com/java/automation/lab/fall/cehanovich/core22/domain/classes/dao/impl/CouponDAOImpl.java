package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.CouponDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
import java.util.List;

public class CouponDAOImpl implements CouponDAO {
    private static CouponDAOImpl instance;

    public synchronized static CouponDAOImpl getInstance() {
        if (instance==null) {
            instance = new CouponDAOImpl();
        }
        return instance;
    }

    private CouponDAOImpl() {

    }

    @Override
    public synchronized Coupon create(int id, boolean enabled, int discountPercent) {
        return new Coupon(id, enabled, discountPercent);
    }

    @Override
    public synchronized Coupon update(Coupon newCoupon) {
        return new Coupon(newCoupon.getId(), newCoupon.isEnabled(), newCoupon.getDiscountPercent());
    }

    @Override
    public Coupon getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Coupon> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
