package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers.Cipher;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

public class Card {
    private int id;
    private AccessLevel accessLevel;
    private boolean isActive;
    private Cipher cipher;

    public Card(int id, AccessLevel accessLevel,
                boolean isActive, Cipher cipher) {
        this.id = id;
        this.accessLevel = accessLevel;
        this.isActive = isActive;
        this.cipher = cipher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Card {\nID: " + id + "\nAccess level: " + accessLevel + "\nActive status: " + isActive +
                "\nCipher: " + cipher.toString() + "\n}";
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
        Card other = (Card) that;
        return id == other.id && accessLevel == other.accessLevel && isActive == other.isActive &&
               cipher == other.cipher;
    }

    @Override
    public int hashCode() {
        return (accessLevel.hashCode() + cipher.hashCode()) / 2 + id;
    }
}
