package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.OrderDAO;

import java.math.BigDecimal;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    private static OrderDAOImpl instance;

    public synchronized static OrderDAOImpl getInstance() {
        if (instance==null) {
            instance = new OrderDAOImpl();
        }
        return instance;
    }

    private OrderDAOImpl() {

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

    @Override
    public Order getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Order> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
