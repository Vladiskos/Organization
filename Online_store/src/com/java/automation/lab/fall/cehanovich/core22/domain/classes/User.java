package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public abstract class User {
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String contactNumber;
    protected String email;

    public User() {

    }

    public User(int id, String firstname, String lastname, String contactNumber, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User {\nID: " + id + "Firstname: " + firstname + "Lastname: " + lastname + "contactNumber: "
                + contactNumber + "Email: " + email + "\n}";
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
        User other = (User) that;
        return id == other.id && firstname.equals(other.firstname) && lastname.equals(other.lastname) &&
                contactNumber.equals(other.contactNumber) && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return id + firstname.hashCode() + lastname.hashCode() + contactNumber.hashCode();
    }
}
