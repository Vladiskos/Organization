package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;

import java.math.BigDecimal;
import java.util.List;

public interface BankCardDAO {
    BankCard create(String number, String validity, String cvc, BigDecimal balance) throws Exception;
    BankCard update(BankCard bankCard) throws Exception;
    BankCard getById(long id);
    List<BankCard> get();
    void delete(long id);
}
