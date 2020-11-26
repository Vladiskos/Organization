package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.ProductDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.ProductDAOImpl;

import java.util.List;

public class ProductService {
    private static final ProductDAO DAO = ProductDAOImpl.getInstance();

    public static Product createProductBook(int code, String name, String brand, String description) {
        return DAO.create(code, name, brand, description);
    }

    public static Product getProductById(Long id) {
        return DAO.getById(id);
    }

    public static List<Product> get() {
        return DAO.get();
    }

    public static Product update(Product o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
