package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class RegisteredUser extends User {
    private Set<BankCard> savedCards;
    private String address;
    private int discount;
    private Date birthday;

    public RegisteredUser(int id, String firstname, String lastname, String contactNumber, String email,
                          HashSet<BankCard> savedCards, String address, int discount, Date birthday) {
        super(id, firstname, lastname, contactNumber, email);
        this.savedCards = savedCards;
        this.address = address;
        this.discount = discount;
        this.birthday = birthday;
    }

    public Set<BankCard> getSavedCards() {
        return savedCards;
    }

    public void setSavedCards(Set<BankCard> savedCards) {
        this.savedCards = savedCards;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "RegisteredUser {\nID: " + id + "Firstname: " + firstname + "Lastname: " + lastname + "contactNumber: " +
                contactNumber + "Email: " + email + "Saved cards: " + savedCards.toString() + "Address: " +
                address + "Discount: " + discount + "Birthday: " + birthday + "\n}";
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
        RegisteredUser other = (RegisteredUser) that;
        return id == other.id && firstname.equals(other.firstname) && lastname.equals(other.lastname) &&
                contactNumber.equals(other.contactNumber) && email.equals(other.email) &&
                savedCards.equals(other.savedCards) && address.equals(other.address) &&
                discount == other.discount && birthday.equals(other.birthday);
    }

    @Override
    public int hashCode() {
        return id + firstname.hashCode() + lastname.hashCode() + contactNumber.hashCode() + address.hashCode();
    }
}
