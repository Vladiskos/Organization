package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.UserDAO;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class UserDAOImpl implements UserDAO {
    private static UserDAOImpl instance;

    public synchronized static UserDAOImpl getInstance() {
        if (instance==null) {
            instance = new UserDAOImpl();
        }
        return instance;
    }

    private UserDAOImpl() {

    }

    @Override
    public synchronized RegisteredUser create(int id, String firstname, String lastname, String contactNumber, String email,
                                    Set<BankCard> savedCards, Address address, int discountPercent, LocalDate birthday) {
        return new RegisteredUser(id, firstname, lastname, contactNumber, email, savedCards, address, discountPercent,
                birthday);
    }

    @Override
    public synchronized RegisteredUser update(RegisteredUser newUser) {
        return new RegisteredUser(newUser.getId(), newUser.getFirstname(), newUser.getLastname(),
                newUser.getContactNumber(), newUser.getEmail(), newUser.getSavedCards(), newUser.getAddress(),
                newUser.getDiscount(), newUser.getBirthday());
    }

    @Override
    public RegisteredUser getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<RegisteredUser> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
