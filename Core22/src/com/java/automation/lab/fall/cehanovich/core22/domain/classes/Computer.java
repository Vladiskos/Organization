package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;

public class Computer {
    private int id;
    private boolean isOn;
    private String model;

    public Computer(int id, boolean isOn, String model) {
        this.id = id;
        this.isOn = isOn;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean working(Employee employee) {
        if (this.id != employee.getId()) {
            System.out.println("Access error! You cannot use this computer");
            return false;
        } else {
            System.out.println("Welcome, " + employee.getFirstname() + ". Again.");
            return true;
        }
    }


    @Override
    public String toString() {
        return "Computer {\nID: " + id + "\nActive status: " + isOn +
                "\nModel: " + model + "\n}";
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
        Computer other = (Computer) that;
        return id == other.id && isOn == other.isOn && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode() + id;
    }


}
