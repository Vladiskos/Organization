package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.CouponDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.CouponDAOImpl;

import java.util.List;

public class CouponService {
    private static final CouponDAO DAO = CouponDAOImpl.getInstance();

    public static Coupon createCouponInfo(int id, boolean enabled, int discountPercent) {
        return DAO.create(id, enabled, discountPercent);
    }

    public static Coupon getCouponById(Long id) {
        return DAO.getById(id);
    }

    public static List<Coupon> get() {
        return DAO.get();
    }

    public static Coupon update(Coupon o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
