package com.java.automation.lab.fall.cehanovich.core22.domain.classes.services;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;
import com.java.automation.lab.fall.cehanovich.core22.domain.interfaces.VariationService;

import java.math.BigDecimal;

public class VariationServiceImpl implements VariationService {
    private static VariationServiceImpl inst;

    public synchronized static VariationServiceImpl getInst() {
        if (inst==null) {
            inst = new VariationServiceImpl();
        }
        return inst;
    }

    private VariationServiceImpl () {

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
}
