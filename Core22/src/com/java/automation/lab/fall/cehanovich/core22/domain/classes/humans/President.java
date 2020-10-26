package com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Card;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Position;

public class President extends Employee {
    private Position position;

    public President(int id, String firstname, String lastname, String gender, int age, int experience,
                     Position position, Card card) {
        super(id, firstname, lastname, gender, age, experience, card);
        this.position = position;

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "President {\nID: " + id + "Firstname: " + firstname + "Lastname: " + lastname + "Gender: " + gender +
                "Age: " + age + "\nExperience: " + experience + "\nCard: " + card.toString() + "\n}";
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
        President other = (President) that;
        return id == other.id && firstname.equals(other.firstname) && lastname.equals(other.lastname) &&
                gender.equals(other.gender) && age == other.age && experience == other.experience &&
                card.equals(other.card) && position == other.position;
    }

    @Override
    public int hashCode() {
        return (card.hashCode() + id * 17 + position.hashCode()) / 2 + experience;
    }
}
