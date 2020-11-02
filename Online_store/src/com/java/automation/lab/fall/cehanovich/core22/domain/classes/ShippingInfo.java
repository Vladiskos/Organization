package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Date;

public class ShippingInfo {
    private Date date;
    private String address;
    private PaymentMethod paymentMethod;

    public ShippingInfo(Date date, String address, PaymentMethod paymentMethod) {
        this.date = date;
        this.address = address;
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    @Override
    public String toString() {
        return "Shipping info {\nDate: " + date.toString() + "Address: " + address + "paymentMethod: " +
                paymentMethod.toString() + "\n}";
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
        ShippingInfo other = (ShippingInfo) that;
        return date.equals(other.date) && address.equals(other.address) && paymentMethod.equals(other.paymentMethod);
    }

    @Override
    public int hashCode() {
        return paymentMethod.hashCode() + address.hashCode() + date.hashCode();
    }
}
