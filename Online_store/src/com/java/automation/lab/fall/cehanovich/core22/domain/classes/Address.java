package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;

public class Address {
    private City city;
    private String street;
    private int house;
    private int apartment;

    public Address(City city, String street, int house, int apartment) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }


    @Override
    public String toString() {
        return "Address {\nCity: " + city + "Street: " + street + "House: " + house + "Apartment: " + apartment +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        Address other = (Address) that;
        return city.equals(other.city) && street.equals(other.street) && house == other.house &&
                apartment == other.apartment;
    }

    @Override
    public int hashCode() {
        return city.hashCode() + street.hashCode() + house * apartment + 13;
    }
}
