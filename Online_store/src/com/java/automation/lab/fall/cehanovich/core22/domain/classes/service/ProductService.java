package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.PriceBookDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.ProductDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.PriceBookDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.ProductDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

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
