package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface SubcategoryDAO {
    Subcategory create(int id, int discount, String name, Set<Product> products);
    Subcategory update(Subcategory subcategory);
    Subcategory getById(long id);
    List<Subcategory> get();
    void delete(long id);
}
