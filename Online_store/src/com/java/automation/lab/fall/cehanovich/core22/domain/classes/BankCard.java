package com.java.automation.lab.fall.cehanovich.core22.domain.classes;


import java.util.Arrays;

public class BankCard {
    private String number;
    private String validity;
    private String cvc;

    public BankCard(String number, String validity, String cvc) {
        this.number = number;
        this.validity = validity;
        this.cvc = cvc;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    @Override
    public String toString() {
        return "BankCard {\nNumber: " + number + "Validity: " + validity + "CVC: " + cvc + "\n}";
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
        BankCard other = (BankCard) that;
        return number.equals(other.number) && validity.equals(other.validity) && cvc.equals(other.cvc);
    }

    @Override
    public int hashCode() {
        return number.hashCode() + validity.hashCode() + cvc.hashCode();
    }
}
