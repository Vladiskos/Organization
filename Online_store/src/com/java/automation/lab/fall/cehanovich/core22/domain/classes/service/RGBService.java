package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.RGB;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.RGBDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.ShippingInfoDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.RGBDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.ShippingInfoDAOImpl;

import java.time.OffsetDateTime;
import java.util.List;

public class RGBService {
    private static final RGBDAO DAO = RGBDAOImpl.getInstance();


    public static RGB createRGB(int red, int green, int blue) {
        return DAO.create(red, green, blue);
    }

    public static RGB getRGBById(Long id) {
        return DAO.getById(id);
    }

    public static List<RGB> get() {
        return DAO.get();
    }

    public static RGB update(RGB o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
