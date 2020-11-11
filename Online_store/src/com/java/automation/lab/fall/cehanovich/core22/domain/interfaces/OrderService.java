package com.java.automation.lab.fall.cehanovich.core22.domain.interfaces;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;

import java.math.BigDecimal;

public interface OrderService {
    Order create(Basket basket, String description, BigDecimal tax);
    Order update(Order order);

}
