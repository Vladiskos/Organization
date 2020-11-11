package com.java.automation.lab.fall.cehanovich.core22.domain.classes.services;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;
import com.java.automation.lab.fall.cehanovich.core22.domain.interfaces.PriceBookService;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

public class PriceBookServiceImpl implements PriceBookService {
    private static PriceBookServiceImpl inst;

    public synchronized static PriceBookServiceImpl getInst() {
        if (inst==null) {
            inst = new PriceBookServiceImpl();
        }
        return inst;
    }

    private PriceBookServiceImpl () {

    }

    @Override
    public synchronized PriceBook create(Currency currency, boolean enabled, OffsetDateTime validFrom,
                                         OffsetDateTime validTo, Map<Variation, BigDecimal> priceAndProduct) {
        return new PriceBook(currency, enabled, validFrom, validTo, priceAndProduct);
    }

    @Override
    public synchronized PriceBook update(PriceBook newPriceBook) {
        return new PriceBook(newPriceBook.getCurrency(), newPriceBook.isEnabled(), newPriceBook.getValidFrom(),
                newPriceBook.getValidTo(), newPriceBook.getPriceAndProduct());
    }
}
