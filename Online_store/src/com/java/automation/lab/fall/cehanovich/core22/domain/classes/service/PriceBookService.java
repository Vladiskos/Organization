package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Basket;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.PriceBook;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Variation;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.OrderDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.PriceBookDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.OrderDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.PriceBookDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class PriceBookService {
    private static final PriceBookDAO DAO = PriceBookDAOImpl.getInstance();


    public static PriceBook createPriceBook(Currency currency, boolean enabled, OffsetDateTime validFrom,
                                            OffsetDateTime validTo, Map<Variation, BigDecimal> priceAndProduct) {
        return DAO.create(currency, enabled, validFrom, validTo, priceAndProduct);
    }

    public static PriceBook getPriceBookById(Long id) {
        return DAO.getById(id);
    }

    public static List<PriceBook> get() {
        return DAO.get();
    }

    public static PriceBook update(PriceBook o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
