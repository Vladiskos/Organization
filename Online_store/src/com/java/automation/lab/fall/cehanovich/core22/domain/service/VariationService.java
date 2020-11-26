package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.VariationDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.VariationDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.util.List;

public class VariationService {
    private static final VariationDAO DAO = VariationDAOImpl.getInstance();


    public static Variation createVariation(int id, Size size, Color color, Product product, int discount) {
        return DAO.create(id, size, color, product, discount);
    }

    public static Variation getVariationById(Long id) {
        return DAO.getById(id);
    }

    public static List<Variation> get() {
        return DAO.get();
    }

    public static Variation update(Variation o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
