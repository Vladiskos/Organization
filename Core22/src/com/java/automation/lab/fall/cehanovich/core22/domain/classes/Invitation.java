package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

import java.util.Date;

public class Invitation {
    private String text;
    private AccessLevel accessLevel;
    private Date date;

    public Invitation(String text, AccessLevel accessLevel, Date date) {
        this.text = text;
        this.accessLevel = accessLevel;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Invitation {\nText: " + text + "\nAccess level: " + accessLevel + "\nDate: " + date.toString() + "\n}";
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
        Invitation other = (Invitation) that;
        return text == other.text && accessLevel == other.accessLevel && date == other.date;
    }

    @Override
    public int hashCode() {
        return (accessLevel.hashCode() + date.hashCode()) / 2;
    }

}
