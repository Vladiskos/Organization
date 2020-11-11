package com.java.automation.lab.fall.cehanovich.core22.domain.classes.services;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;
import com.java.automation.lab.fall.cehanovich.core22.domain.interfaces.OrderService;

import java.math.BigDecimal;

public class OrderServiceImpl implements OrderService {
    private static OrderServiceImpl inst;

    public synchronized static OrderServiceImpl getInst() {
        if (inst==null) {
            inst = new OrderServiceImpl();
        }
        return inst;
    }

    private OrderServiceImpl () {

    }

    @Override
    public synchronized Order create(Basket basket, String description, BigDecimal tax) {
        return new Order(basket.getId() + 1000, basket, description, tax);
    }

    @Override
    public synchronized Order update(Order newOrder) {
        Order updated = new Order(newOrder.getId(), newOrder.getBasket(), newOrder.getDescription(), newOrder.getTax());
        return updated;
    }
}
