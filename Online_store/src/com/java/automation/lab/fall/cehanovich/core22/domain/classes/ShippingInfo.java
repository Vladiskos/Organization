package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import java.time.OffsetDateTime;
import java.util.Date;

public class ShippingInfo {
    private OffsetDateTime date;
    private Address address;
    private User customerInfo;

    public ShippingInfo(OffsetDateTime date, Address address, User customerInfo) {
        this.date = date;
        this.address = address;
        this.customerInfo = customerInfo;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
