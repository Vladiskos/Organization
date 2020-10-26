package com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Card;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Invitation;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Position;

public class User extends Human {
    private Invitation invitation;
    public User() {

    }

    public User(String firstname, String lastname, String gender, int age, Invitation invitation) {
        super(firstname, lastname, gender, age);
        this.invitation = invitation;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    @Override
    public String toString() {
        return "User {\nFirstname: " + firstname + "Lastname: " + lastname + "Gender: " +
                gender + "Age: " + age + "Invitation level: " + invitation.toString() + "\n}";
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
        User other = (User) that;
        return firstname.equals(other.firstname) && lastname.equals(other.lastname) &&
                gender.equals(other.gender) && age == other.age && invitation.equals(other.invitation);
    }

    @Override
    public int hashCode() {
        return (firstname.hashCode() * 17 + lastname.hashCode()) / 2 + age / invitation.hashCode();
    }

}
