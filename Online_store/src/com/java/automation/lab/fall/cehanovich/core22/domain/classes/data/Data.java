package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

public abstract class Data {
    protected String information;

    public Data() {

    }

    public Data(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    @Override
    public String toString() {
        return "Data {\nInformation: " + information + "\n}";
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
        return information.equals(other.information);
    }

    @Override
    public int hashCode() {
        return (information.hashCode() * 17 -17);
    }
}
