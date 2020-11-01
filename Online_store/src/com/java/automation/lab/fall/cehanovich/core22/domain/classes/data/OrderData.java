package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Order;

import java.util.Arrays;

public class OrderData extends Data {
    private Order[] orders;

    public OrderData(String information, Order[] orders) {
        this.information = information;
        this.orders = orders;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "Order Data {\nInformation: " + information + "Orders: " + Arrays.toString(orders) + "\n}";
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
        OrderData other = (OrderData) that;
        return information.equals(other.information) && Arrays.equals(orders,other.orders);
    }

    @Override
    public int hashCode() {
        return information.hashCode() + Arrays.hashCode(orders);
    }
}
