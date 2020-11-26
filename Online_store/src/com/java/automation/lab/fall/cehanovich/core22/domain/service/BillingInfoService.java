package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.info.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.BillingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.BillingInfoDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
import java.util.List;

public class BillingInfoService {
    private static final BillingInfoDAO DAO = BillingInfoDAOImpl.getInstance();


    public static BillingInfo createBillingInfo(BigDecimal totalPrice, PaymentType paymentType, String information) {
        return DAO.create(totalPrice, paymentType, information);
    }

    public static BillingInfo getBillingInfoById(Long id) {
        return DAO.getById(id);
    }

    public static List<BillingInfo> get() {
        return DAO.get();
    }

    public static BillingInfo update(BillingInfo o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
