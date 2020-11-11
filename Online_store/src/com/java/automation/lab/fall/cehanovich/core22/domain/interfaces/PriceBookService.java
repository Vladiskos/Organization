package com.java.automation.lab.fall.cehanovich.core22.domain.interfaces;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

public interface PriceBookService {
    PriceBook create(Currency currency, boolean enabled, OffsetDateTime validFrom, OffsetDateTime validTo,
                     Map<Variation, BigDecimal> priceAndProduct);
    PriceBook update(PriceBook priceBook);
}
