package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;

import java.math.BigDecimal;
import java.util.List;

public interface OrderDAO {
    Order create(Basket basket, String description, BigDecimal tax);
    Order update(Order order);
    Order getById(long id);
    List<Order> get();
    void delete(long id);
}
