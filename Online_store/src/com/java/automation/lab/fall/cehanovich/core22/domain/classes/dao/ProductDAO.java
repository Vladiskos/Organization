package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ShippingInfo;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.User;

import java.time.OffsetDateTime;
import java.util.List;

public interface ProductDAO {
    Product create(int code, String name, String brand, String description);
    Product update(Product product);
    Product getById(long id);
    List<Product> get();
    void delete(long id);
}
