package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.ShippingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;

public class ShippingInfoDAOImpl implements ShippingInfoDAO {
    private static ShippingInfoDAOImpl instance;

    public synchronized static ShippingInfoDAOImpl getInstance() {
        if (instance==null) {
            instance = new ShippingInfoDAOImpl();
        }
        return instance;
    }

    private ShippingInfoDAOImpl() {

    }

    @Override
    public synchronized ShippingInfo create(OffsetDateTime date, Address address, User customerInfo) {
        return new ShippingInfo(date, address, customerInfo);
    }

    @Override
    public synchronized ShippingInfo update(ShippingInfo newShippingInfo) {
        return new ShippingInfo(newShippingInfo.getDate(), newShippingInfo.getAddress(),
                newShippingInfo.getCustomerInfo());
    }

    @Override
    public ShippingInfo getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<ShippingInfo> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
