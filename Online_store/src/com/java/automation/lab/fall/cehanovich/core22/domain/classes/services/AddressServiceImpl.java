package com.java.automation.lab.fall.cehanovich.core22.domain.classes.services;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;
import com.java.automation.lab.fall.cehanovich.core22.domain.interfaces.AddressService;

import java.math.BigDecimal;
import java.util.List;

public class AddressServiceImpl implements AddressService {
    private static AddressServiceImpl inst;

    public synchronized AddressServiceImpl getInst() {
        if (inst==null) {
            inst = new AddressServiceImpl();
            System.out.println();
        }
        return inst;
    }

    private AddressServiceImpl () {

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
}
