package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.util.Date;

public class ShippingInfo {
    private Date date;
    private String address;
    private User customerInfo;

    public ShippingInfo(Date date, String address, User customerInfo) {
        this.date = date;
        this.address = address;
        this.customerInfo = customerInfo;
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

    public User getPaymentMethod() {
        return customerInfo;
    }

    public void setPaymentMethod(User customerInfo) {
        this.customerInfo = customerInfo;
    }


    @Override
    public String toString() {
        return "Shipping info {\nDate: " + date.toString() + "Address: " + address + "Customer info: " +
                customerInfo.toString() + "\n}";
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
        return date.equals(other.date) && address.equals(other.address) && customerInfo.equals(other.customerInfo);
    }

    @Override
    public int hashCode() {
        return customerInfo.hashCode() + address.hashCode() + date.hashCode();
    }
}
