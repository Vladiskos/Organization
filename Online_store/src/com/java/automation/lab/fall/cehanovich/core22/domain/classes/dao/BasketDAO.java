package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;

import java.math.BigDecimal;
import java.util.List;

public interface BasketDAO {
    Basket create(int id, List<Variation> variations, BigDecimal totalPrice, PaymentMethod paymentMethod,
                  PriceBook priceBook, Coupon coupon);
    Basket update(Basket basket);
    Basket getById(long id);
    List<Basket> get();
    void delete(long id);
}
