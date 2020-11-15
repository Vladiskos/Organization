package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.SubcategoryDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.UserDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.SubcategoryDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.UserDAOImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class SubcategoryService {
    private static final SubcategoryDAO DAO = SubcategoryDAOImpl.getInstance();


    public static Subcategory createSubcategory(int id, int discount, String name, Set<Product> products) {
        return DAO.create(id, discount, name, products);
    }

    public static Subcategory getSubcategoryById(Long id) {
        return DAO.getById(id);
    }

    public static List<Subcategory> get() {
        return DAO.get();
    }

    public static Subcategory update(Subcategory o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
