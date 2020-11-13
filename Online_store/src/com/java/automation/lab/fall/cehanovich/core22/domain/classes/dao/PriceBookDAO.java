package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public interface PriceBookDAO {
    PriceBook create(Currency currency, boolean enabled, OffsetDateTime validFrom, OffsetDateTime validTo,
                     Map<Variation, BigDecimal> priceAndProduct);
    PriceBook update(PriceBook priceBook);
    PriceBook getById(long id);
    List<PriceBook> get();
    void delete(long id);
}
