package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

public class PaymentMethod {
    private BankCard bankCard;
    private String name;
    private String description;

    public PaymentMethod(BankCard bankCard, String name, String description) {
        this.bankCard = bankCard;
        this.name = name;
        this.description = description;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Payment method {\nBank card: " + bankCard.toString() + "Name: " + name + "Description: " +
                description + "\n}";
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
        PaymentMethod other = (PaymentMethod) that;
        return bankCard.equals(other.bankCard) && name.equals(other.name) && description.equals(other.description);
    }

    @Override
    public int hashCode() {
        return bankCard.hashCode() + name.hashCode() + description.hashCode();
    }
}
