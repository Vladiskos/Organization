package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Subcategory;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.CategoryDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.util.List;
import java.util.Set;

public class CategoryDAOImpl implements CategoryDAO {
    private static CategoryDAOImpl instance;

    public synchronized static CategoryDAOImpl getInstance() {
        if (instance==null) {
            instance = new CategoryDAOImpl();
        }
        return instance;
    }

    private CategoryDAOImpl() {

    }

    @Override
    public synchronized Category create(int id, Set<Subcategory> subcategories, String name) {
        return new Category(id, subcategories, name);
    }

    @Override
    public synchronized Category update(Category newCategory) {
        return new Category(newCategory.getId(), newCategory.getSubcategories(), newCategory.getName());
    }

    @Override
    public Category getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Category> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
