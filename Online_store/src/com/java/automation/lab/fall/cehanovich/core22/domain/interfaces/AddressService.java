package com.java.automation.lab.fall.cehanovich.core22.domain.interfaces;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;


public interface AddressService {
    Address create(City city, String street, int house, int apartment);
    Address update(Address address);
}
