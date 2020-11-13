package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.PriceBookDAO;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class PriceBookDAOImpl implements PriceBookDAO {
    private static PriceBookDAOImpl instance;

    public synchronized static PriceBookDAOImpl getInstance() {
        if (instance==null) {
            instance = new PriceBookDAOImpl();
        }
        return instance;
    }

    private PriceBookDAOImpl() {

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

    @Override
    public PriceBook getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<PriceBook> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
