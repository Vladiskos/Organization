package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

import java.util.Arrays;

public class Room {
    private int number;
    private AccessLevel requiredAccessLevel;
    private int roomLimit;
    private Employee[] employees = new Employee[roomLimit];
    private int index = 0;

    public Room(int number, AccessLevel accessLevel, int roomLimit) {
        this.number = number;
        accessLevel = accessLevel;
        this.roomLimit = roomLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AccessLevel getRequiredAccessLevel() {
        return requiredAccessLevel;
    }

    public void setRequiredAccessLevel(AccessLevel requiredAccessLevel) {
        this.requiredAccessLevel = requiredAccessLevel;
    }

    public void addEmployee(Employee employee) {
        employees[index] = employee;
        this.index++;
    }

    public void deleteEmployee(int index) {
        for (int i = index; i < employees.length; i++) {
            employees[i] = employees[++i];
        }
        employees[this.index - 1] = null;
        this.index--;
    }


    @Override
    public String toString() {
        return "Room {\nNumber: " + number + "\nRequired Access Level: " + requiredAccessLevel + "\nRoom limit: " +
                roomLimit + "\nEmployees: " + employees.toString() + "\nIndex: " + index + "\n}";
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
        Room other = (Room) that;
        return number == other.number && requiredAccessLevel.equals(other.requiredAccessLevel) &&
                roomLimit == other.roomLimit && Arrays.equals(employees, other.employees) && index == other.index;
    }

    @Override
    public int hashCode() {
        return (requiredAccessLevel.hashCode() + employees.hashCode() + index * roomLimit) / 2 + number;
    }

}
