package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.AddressDAO;

import java.util.List;

public class AddressDAOImpl implements AddressDAO {
    private static AddressDAOImpl instance;

    public static synchronized AddressDAOImpl getInstance() {
        if (instance==null) {
            instance = new AddressDAOImpl();
            System.out.println();
        }
        return instance;
    }

    private AddressDAOImpl() {

    }

    @Override
    public synchronized Address create(City city, String street, int house, int apartment) {
        return new Address(city, street, house, apartment);
    }

    @Override
    public synchronized Address update(Address newAddress) {
        return new Address(newAddress.getCity(), newAddress.getStreet(), newAddress.getHouse(),
                newAddress.getApartment());
    }

    @Override
    public Address getById(long id) {
        throw new NotImplementedException("Method 'getById' not implemented for " + this.getClass());
    }

    @Override
    public List<Address> get() {
        throw new NotImplementedException("Method 'get' not implemented for " + this.getClass());
    }

    @Override
    public void delete(long id) {
        throw new NotImplementedException("Method 'deleteById' not implemented for " + this.getClass());
    }
}
