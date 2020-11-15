package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BillingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BillingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.PaymentType;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class BillingInfoDAOImpl implements BillingInfoDAO {
    private static BillingInfoDAOImpl instance;

    public synchronized static BillingInfoDAOImpl getInstance() {
        if (instance==null) {
            instance = new BillingInfoDAOImpl();
        }
        return instance;
    }

    private BillingInfoDAOImpl() {

    }

    @Override
    public synchronized BillingInfo create(BigDecimal totalPrice, PaymentType paymentType, String information) {
        return new BillingInfo(totalPrice, paymentType, information);
    }

    @Override
    public synchronized BillingInfo update(BillingInfo newBillingInfo) {
        return new BillingInfo(newBillingInfo.getTotalPrice(), newBillingInfo.getPayment(),
                newBillingInfo.getInformation());
    }

    @Override
    public BillingInfo getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<BillingInfo> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
