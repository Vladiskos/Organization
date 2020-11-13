package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.AddressDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BasketDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.AddressDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.BasketDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;

import java.math.BigDecimal;
import java.util.List;

public class BasketService {
    private static final BasketDAO DAO = BasketDAOImpl.getInstance();


    public static Basket createBasket(int id, List<Variation> variations, BigDecimal totalPrice, PaymentMethod paymentMethod,
                                      PriceBook priceBook, Coupon coupon) {
        return DAO.create( id, variations, totalPrice, paymentMethod, priceBook, coupon);
    }

    public static Basket getBasketById(Long id) {
        return DAO.getById(id);
    }

    public static List<Basket> get() {
        return DAO.get();
    }

    public static Basket update(Basket o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
