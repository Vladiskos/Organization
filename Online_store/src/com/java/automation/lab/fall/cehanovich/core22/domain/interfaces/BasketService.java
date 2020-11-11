package com.java.automation.lab.fall.cehanovich.core22.domain.interfaces;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;

import java.math.BigDecimal;
import java.util.List;

public interface BasketService {
    Basket create(int id, List<Variation> variations, BigDecimal totalPrice, PaymentMethod paymentMethod,
                  PriceBook priceBook, Coupon coupon);
    Basket update(Basket basket);
}
