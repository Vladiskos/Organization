package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.SubcategoryDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class SubcategoryDAOImpl implements SubcategoryDAO {
    private static SubcategoryDAOImpl instance;

    public synchronized static SubcategoryDAOImpl getInstance() {
        if (instance==null) {
            instance = new SubcategoryDAOImpl();
        }
        return instance;
    }

    private SubcategoryDAOImpl() {

    }

    @Override
    public synchronized Subcategory create(int id, int discount, String name, Set<Product> products) {
        return new Subcategory(id, discount, name, products);
    }

    @Override
    public synchronized Subcategory update(Subcategory newSubcategory) {
        return new Subcategory(newSubcategory.getId(), newSubcategory.getDiscount(), newSubcategory.getName(),
                newSubcategory.getProducts());
    }

    @Override
    public Subcategory getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Subcategory> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
