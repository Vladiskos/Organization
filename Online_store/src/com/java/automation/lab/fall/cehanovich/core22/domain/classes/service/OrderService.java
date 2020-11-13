package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BasketDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.OrderDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.BasketDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.OrderDAOImpl;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {
    private static final OrderDAO DAO = OrderDAOImpl.getInstance();


    public static Order createOrder(Basket basket, String description, BigDecimal tax) {
        return DAO.create(basket, description, tax);
    }

    public static Order getOrderById(Long id) {
        return DAO.getById(id);
    }

    public static List<Order> get() {
        return DAO.get();
    }

    public static Order update(Order o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
