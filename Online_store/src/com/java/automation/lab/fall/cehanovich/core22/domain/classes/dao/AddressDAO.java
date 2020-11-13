package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;

import java.util.List;


public interface AddressDAO {
    Address create(City city, String street, int house, int apartment);
    Address update(Address address);
    Address getById(long id);
    List<Address> get();
    void delete(long id);
}
