package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.ShippingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.ShippingInfoDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.info.ShippingInfo;

import java.time.OffsetDateTime;
import java.util.List;

public class ShippingInfoService {
    private static final ShippingInfoDAO DAO = ShippingInfoDAOImpl.getInstance();


    public static ShippingInfo createShippingInfo(OffsetDateTime date, Address address, User customerInfo) {
        return DAO.create(date, address, customerInfo);
    }

    public static ShippingInfo getShippingInfoById(Long id) {
        return DAO.getById(id);
    }

    public static List<ShippingInfo> get() {
        return DAO.get();
    }

    public static ShippingInfo update(ShippingInfo o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
