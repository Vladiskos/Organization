package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.AddressDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.AddressDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;

import java.util.List;

public class AddressService {
    private static final AddressDAO DAO = AddressDAOImpl.getInstance();


    public static Address createAddress(City city, String street, int house, int apartment) {
        return DAO.create(city, street, house, apartment);
    }

    public static Address getAddressById(Long id) {
        return DAO.getById(id);
    }

    public static List<Address> get() {
        return DAO.get();
    }

    public static Address update(Address o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }

}
