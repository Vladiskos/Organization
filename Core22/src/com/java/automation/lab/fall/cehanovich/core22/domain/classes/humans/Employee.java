package com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Card;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Invitation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

import java.util.Date;

public abstract class Employee extends Human {
    protected int id;
    protected int experience;
    protected Card card;

    public Employee() {

    }

    public Employee(int id, String firstname, String lastname, String gender, int age, int experience, Card card) {
        super(firstname, lastname, gender, age);
        this.experience = experience;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Invitation createInvitation(String text, Date date) {
        return new Invitation(text, this.card.getAccessLevel(), date);
    }

    @Override
    public String toString() {
        return "Employee {\nID: " + id + "\nExperience: " + experience + "\nCard: " +
                card.toString() + "\n}";
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
        Employee other = (Employee) that;
        return id == other.id && experience == other.experience && card.equals(other.card);
    }

    @Override
    public int hashCode() {
        return (card.hashCode() + id * 17) / 2 + experience;
    }
}
