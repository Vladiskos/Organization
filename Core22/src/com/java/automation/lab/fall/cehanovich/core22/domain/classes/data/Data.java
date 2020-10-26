package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

public abstract class Data {
    protected String information;
    protected AccessLevel accessLevel;

    public Data() {

    }

    public Data(String information, AccessLevel accessLevel) {
        this.information = information;
        this.accessLevel = accessLevel;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    @Override
    public String toString() {
        return "Data {\nInformation: " + information + "\nAccess level: " + accessLevel + "\n}";
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
        Data other = (Data) that;
        return information.equals(other.information) && accessLevel == other.accessLevel;
    }

    @Override
    public int hashCode() {
        return (information.hashCode() + accessLevel.hashCode());
    }
}
