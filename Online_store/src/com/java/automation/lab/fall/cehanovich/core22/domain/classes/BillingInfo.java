package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Payment;

import java.math.BigDecimal;

public class BillingInfo {
    private BigDecimal totalPrice;
    private Payment payment;
    private String information;

    public BillingInfo(BigDecimal totalPrice, Payment payment, String information) {
        this.totalPrice = totalPrice;
        this.payment = payment;
        this.information = information;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    @Override
    public String toString() {
        return "Billing info{\nTotal price " + totalPrice.toString() + "Payment: " + payment + "information: " +
                information + "\n}";
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
        BillingInfo other = (BillingInfo) that;
        return totalPrice.equals(other.totalPrice) && payment.equals(other.payment) &&
                information.equals(other.information);
    }

    @Override
    public int hashCode() {
        return information.hashCode() + totalPrice.hashCode() + payment.hashCode();
    }
}
