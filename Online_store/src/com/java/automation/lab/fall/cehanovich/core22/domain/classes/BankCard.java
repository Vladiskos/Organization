package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Arrays;

public class BankCard {
    private String number;
    private String validity;
    private String cvc;

    public BankCard(String number, String validity, String cvc) throws Exception {
        setNumber(number);
        this.validity = validity;
        setCvc(cvc);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws Exception {
        if (number.length() != 19)
            for (int i = 0; i < number.length(); i++) {
                if (!(number.charAt(i) > '0' && number.charAt(i) < '9' || number.charAt(i) ==' ')) {
                    throw new IllegalArgumentException("Illegal card number!");
                }

            }
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

    public void setCvc(String cvc) throws Exception{
        if (cvc.length() != 19)
            for (int i = 0; i < cvc.length(); i++) {
                if (!(cvc.charAt(i) > '0' && cvc.charAt(i) < '9')) {
                    throw new IllegalArgumentException("Illegal cvc code!");
                }
            }
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
