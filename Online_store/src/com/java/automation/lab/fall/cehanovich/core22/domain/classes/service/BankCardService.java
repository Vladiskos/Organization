package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BankCardDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BasketDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.BankCardDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.BasketDAOImpl;

import java.math.BigDecimal;
import java.util.List;

public class BankCardService {
    private static final BankCardDAO DAO = BankCardDAOImpl.getInstance();


    public static BankCard createBankCard(String number, String validity, String cvc, BigDecimal balance) throws Exception {
        return DAO.create(number, validity, cvc, balance);
    }

    public static BankCard getBankCardById(Long id) {
        return DAO.getById(id);
    }

    public static List<BankCard> get() {
        return DAO.get();
    }

    public static BankCard update(BankCard o) throws Exception {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
