package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BankCard;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.RegisteredUser;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.RegisteredUserDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class RegisteredUserDAOImpl implements RegisteredUserDAO {
    private static RegisteredUserDAOImpl instance;

    public synchronized static RegisteredUserDAOImpl getInstance() {
        if (instance==null) {
            instance = new RegisteredUserDAOImpl();
        }
        return instance;
    }

    private RegisteredUserDAOImpl() {

    }

    @Override
    public synchronized RegisteredUser create(int id, String firstname, String lastname, String contactNumber,
                                              String email, Set<BankCard> savedCards, Address address,
                                              int discountPercent, LocalDate birthday) {
        return new RegisteredUser(id, firstname, lastname, contactNumber, email, savedCards, address, discountPercent,
                birthday);
    }

    @Override
    public synchronized RegisteredUser update(RegisteredUser newRegisteredUser) {
        return new RegisteredUser(newRegisteredUser.getId(), newRegisteredUser.getFirstname(),
                newRegisteredUser.getLastname(), newRegisteredUser.getContactNumber(), newRegisteredUser.getEmail(),
                newRegisteredUser.getSavedCards(), newRegisteredUser.getAddress(), newRegisteredUser.getDiscount(),
                newRegisteredUser.getBirthday());
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
