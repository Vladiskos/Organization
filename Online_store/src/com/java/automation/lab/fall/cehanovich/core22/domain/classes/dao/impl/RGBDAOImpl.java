package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.RGB;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.RGBDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.time.OffsetDateTime;
import java.util.List;

public class RGBDAOImpl implements RGBDAO {
    private static RGBDAOImpl instance;

    public synchronized static RGBDAOImpl getInstance() {
        if (instance==null) {
            instance = new RGBDAOImpl();
        }
        return instance;
    }

    private RGBDAOImpl() {

    }

    @Override
    public synchronized RGB create(int red, int green, int blue) {
        return new RGB(red, green, blue);
    }

    @Override
    public synchronized RGB update(RGB newRGB) {
        return new RGB(newRGB.getRed(), newRGB.getGreen(), newRGB.getBlue());
    }

    @Override
    public RGB getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<RGB> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
