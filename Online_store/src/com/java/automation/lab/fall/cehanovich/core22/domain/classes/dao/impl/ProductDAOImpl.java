package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.ProductDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.time.OffsetDateTime;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    private static ProductDAOImpl instance;

    public synchronized static ProductDAOImpl getInstance() {
        if (instance==null) {
            instance = new ProductDAOImpl();
        }
        return instance;
    }

    private ProductDAOImpl() {

    }

    @Override
    public synchronized Product create(int code, String name, String brand, String description) {
        return new Product(code, name, brand, description);
    }

    @Override
    public synchronized Product update(Product newProduct) {
        return new Product(newProduct.getCode(), newProduct.getName(), newProduct.getBrand(),
                newProduct.getDescription());
    }

    @Override
    public Product getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Product> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
