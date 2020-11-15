package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Coupon;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Subcategory;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.CategoryDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.CouponDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.CategoryDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.CouponDAOImpl;

import java.util.List;
import java.util.Set;

public class CategoryService {
    private static final CategoryDAO DAO = CategoryDAOImpl.getInstance();

    public static Category createCategoryInfo(int id, Set<Subcategory> subcategories, String name) {
        return DAO.create(id, subcategories, name);
    }

    public static Category getCategoryById(Long id) {
        return DAO.getById(id);
    }

    public static List<Category> get() {
        return DAO.get();
    }

    public static Category update(Category o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
