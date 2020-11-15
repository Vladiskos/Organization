package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.BankCardDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.math.BigDecimal;
import java.util.List;

public class BankCardDAOImpl implements BankCardDAO {
    private static BankCardDAOImpl instance;

    public static synchronized BankCardDAOImpl getInstance() {
        if (instance==null) {
            instance = new BankCardDAOImpl();
            System.out.println();
        }
        return instance;
    }

    private BankCardDAOImpl() {

    }

    @Override
    public synchronized BankCard create(String number, String validity, String cvc, BigDecimal balance) throws Exception {
        return new BankCard(number, validity, cvc, balance);
    }

    @Override
    public synchronized BankCard update(BankCard newBankCard) throws Exception {
        return new BankCard(newBankCard.getNumber(), newBankCard.getValidity(), newBankCard.getCvc(),
                newBankCard.getBalance());
    }

    @Override
    public BankCard getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<BankCard> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
