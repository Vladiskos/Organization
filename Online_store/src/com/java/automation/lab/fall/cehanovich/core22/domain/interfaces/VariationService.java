package com.java.automation.lab.fall.cehanovich.core22.domain.interfaces;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Product;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

public interface VariationService {
    Variation create(int id, Size size, Color color, Product product, int discount);
    Variation update(Variation variation);
}
