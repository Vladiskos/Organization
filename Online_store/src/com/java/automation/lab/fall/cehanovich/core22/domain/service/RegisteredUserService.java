package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.RegisteredUserDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.RegisteredUserDAOImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class RegisteredUserService {
    private static final RegisteredUserDAO DAO = RegisteredUserDAOImpl.getInstance();


    public static RegisteredUser createRegisteredUser(int id, String firstname, String lastname, String contactNumber,
                                                      String email, Set<BankCard> savedCards, Address address,
                                                      int discountPercent, LocalDate birthday) {
        return DAO.create(id, firstname, lastname, contactNumber, email, savedCards, address, discountPercent, birthday);
    }

    public static RegisteredUser getRegisteredUserById(Long id) {
        return DAO.getById(id);
    }

    public static List<RegisteredUser> get() {
        return DAO.get();
    }

    public static RegisteredUser update(RegisteredUser o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
