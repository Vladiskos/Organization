package com.java.automation.lab.fall.cehanovich.core22.domain.classes.services;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.interfaces.BasketService;

import java.math.BigDecimal;
import java.util.List;

public class BasketServiceImpl implements BasketService {
    private static BasketServiceImpl inst;

    public synchronized BasketServiceImpl getInst() {
        if (inst==null) {
            inst = new BasketServiceImpl();
            System.out.println();
        }
        return inst;
    }

    private BasketServiceImpl () {

    }

    @Override
    public synchronized Basket create(int id, List<Variation> variations, BigDecimal totalPrice,
                                      PaymentMethod paymentMethod, PriceBook priceBook, Coupon coupon) {
        return new Basket(id, variations, totalPrice, paymentMethod,  priceBook, coupon);
    }

    @Override
    public synchronized Basket update(Basket newBasket) {
        Basket updated = new Basket(newBasket.getId(), newBasket.getVariations(), newBasket.getTotalPrice(),
                newBasket.getPaymentMethod(), newBasket.getPriceBook(),newBasket.getCoupon());
        return updated;
    }
}
