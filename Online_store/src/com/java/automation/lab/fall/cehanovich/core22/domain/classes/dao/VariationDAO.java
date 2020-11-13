package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.util.List;

public interface VariationDAO {
    Variation create(int id, Size size, Color color, Product product, int discount);
    Variation update(Variation variation);
    Variation getById(long id);
    List<Variation> get();
    void delete(long id);
}
