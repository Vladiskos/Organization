package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Subcategory;

import java.util.List;
import java.util.Set;

public interface CategoryDAO {
    Category create(int id, Set<Subcategory> subcategories, String name);
    Category update(Category category);
    Category getById(long id);
    List<Category> get();
    void delete(long id);
}
