package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
import java.util.List;

public interface BillingInfoDAO {
    BillingInfo create(BigDecimal totalPrice, PaymentType paymentType, String information);
    BillingInfo update(BillingInfo billingInfo);
    BillingInfo getById(long id);
    List<BillingInfo> get();
    void delete(long id);
}
