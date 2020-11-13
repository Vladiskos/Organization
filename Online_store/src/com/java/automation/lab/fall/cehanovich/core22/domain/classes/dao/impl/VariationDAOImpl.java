package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.VariationDAO;

import java.util.List;

public class VariationDAOImpl implements VariationDAO {
    private static VariationDAOImpl instance;

    public synchronized static VariationDAOImpl getInstance() {
        if (instance==null) {
            instance = new VariationDAOImpl();
        }
        return instance;
    }

    private VariationDAOImpl() {

    }

    @Override
    public synchronized Variation create(int id, Size size, Color color, Product product, int discount) {
        return new Variation(id, size, color, product, discount);
    }

    @Override
    public synchronized Variation update(Variation newVariation) {
        Variation updated = new Variation(newVariation.getId(), newVariation.getSize(), newVariation.getColor(),
                newVariation.getProduct(), newVariation.getDiscount());
        return updated;
    }

    @Override
    public Variation getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Variation> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
