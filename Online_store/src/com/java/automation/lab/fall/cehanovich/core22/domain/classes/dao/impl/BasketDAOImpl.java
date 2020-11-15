package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BasketDAO;

import java.math.BigDecimal;
import java.util.List;

public class BasketDAOImpl implements BasketDAO{
    private static BasketDAOImpl instance;

    public static synchronized BasketDAOImpl getInstance() {
        if (instance==null) {
            instance = new BasketDAOImpl();
            System.out.println();
        }
        return instance;
    }

    private BasketDAOImpl() {

    }

    @Override
    public synchronized Basket create(int id, List<Variation> variations, BigDecimal totalPrice,
                                      PaymentMethod paymentMethod, PriceBook priceBook, Coupon coupon) {
        return new Basket(id, variations, totalPrice, paymentMethod,  priceBook, coupon);
    }

    @Override
    public synchronized Basket update(Basket newBasket) {
        return new Basket(newBasket.getId(), newBasket.getVariations(), newBasket.getTotalPrice(),
                newBasket.getPaymentMethod(), newBasket.getPriceBook(),newBasket.getCoupon());
    }

    @Override
    public Basket getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Basket> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
