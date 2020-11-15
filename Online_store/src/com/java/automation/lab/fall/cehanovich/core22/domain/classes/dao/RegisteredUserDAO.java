package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BankCard;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.RegisteredUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface RegisteredUserDAO {
    RegisteredUser create(int id, String firstname, String lastname, String contactNumber, String email,
                          Set<BankCard> savedCards, Address address, int discountPercent, LocalDate birthday);
    RegisteredUser update(RegisteredUser user);
    RegisteredUser getById(long id);
    List<RegisteredUser> get();
    void delete(long id);
}
