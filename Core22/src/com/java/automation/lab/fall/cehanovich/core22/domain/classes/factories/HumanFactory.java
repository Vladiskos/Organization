package com.java.automation.lab.fall.cehanovich.core22.domain.classes.factories;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Card;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Invitation;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers.RSA;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Position;

public class HumanFactory {
    public Human createPresident(String firstname, String lastname, String gender, int age, int experience) {
        return new President(1, firstname, lastname, gender, age, experience, Position.THE_PRESIDENT,
                new Card(1, AccessLevel.LEVEL_5, true, new RSA()));

    }

    public Human createVicePresident(String firstname, String lastname, String gender, int age, int experience) {
        return new VicePresident(2, firstname, lastname, gender, age, experience, Position.VICE_PRESIDENT,
                new Card(2, AccessLevel.LEVEL_4, true, new RSA()));

    }

    public Human createHeadOfDepartment(int id, String firstname, String lastname, String gender, int age,
                                        int experience) {
        return new VicePresident(id, firstname, lastname, gender, age, experience, Position.HEAD_OF_DEPARTMENT,
                new Card(id, AccessLevel.LEVEL_3, true, new RSA()));

    }

    public Human createWorker(int id, String firstname, String lastname, String gender, int age,
                                        int experience) {
        return new VicePresident(id, firstname, lastname, gender, age, experience, Position.WORKER,
                new Card(id, AccessLevel.LEVEL_2, true, new RSA()));

    }

    public Human createNewbie(int id, String firstname, String lastname, String gender, int age,
                                        int experience) {
        return new VicePresident(id, firstname, lastname, gender, age, experience, Position.NEWBIE,
                new Card(id, AccessLevel.LEVEL_1, true, new RSA()));

    }

    public Human createUser(String firstname, String lastname, String gender, int age, Invitation invitation) {
        return new User(firstname, lastname, gender, age, invitation);
    }

}
