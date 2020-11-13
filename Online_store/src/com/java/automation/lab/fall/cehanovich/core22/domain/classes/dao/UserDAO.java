package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface UserDAO {
    RegisteredUser create(int id, String firstname, String lastname, String contactNumber, String email,
                          Set<BankCard> savedCards, Address address, int discountPercent, LocalDate birthday);
    RegisteredUser update(RegisteredUser user);
    RegisteredUser getById(long id);
    List<RegisteredUser> get();
    void delete(long id);
}
