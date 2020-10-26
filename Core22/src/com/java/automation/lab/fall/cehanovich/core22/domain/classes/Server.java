package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.data.CardData;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.data.EmployeesData;

public class Server {
    private CardData cardData;
    private EmployeesData employeesData;

    public Server(CardData cardData, EmployeesData employeesData) {
        this.cardData = cardData;
        this.employeesData = employeesData;
    }

    public CardData getCardData() {
        return cardData;
    }

    public void setCardData(CardData cardData) {
        this.cardData = cardData;
    }

    public EmployeesData getEmployeesData() {
        return employeesData;
    }

    public void setEmployeesData(EmployeesData employeesData) {
        this.employeesData = employeesData;
    }

    @Override
    public String toString() {
        return "Server {\nCard data: " + cardData.toString() + "\nEmployees data: " + employeesData.toString() + "\n}";
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
        Server other = (Server) that;
        return cardData.equals(other.cardData) && employeesData.equals(other.employeesData);
    }

    @Override
    public int hashCode() {
        return (cardData.hashCode() + employeesData.hashCode() * 13) / 2;
    }
}
