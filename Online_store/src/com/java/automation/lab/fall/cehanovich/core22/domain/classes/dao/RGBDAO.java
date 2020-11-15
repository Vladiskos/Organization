package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.RGB;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;

import java.time.OffsetDateTime;
import java.util.List;

public interface RGBDAO {
    RGB create(int red, int green, int blue);
    RGB update(RGB rgb);
    RGB getById(long id);
    List<RGB> get();
    void delete(long id);
}
