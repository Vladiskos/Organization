package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BillingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.CouponDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.BillingInfoDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.CouponDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
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
