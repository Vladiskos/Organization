package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;


public class EmployeesData extends Data {
    private Employee[] employees;

    public EmployeesData(String information, AccessLevel accessLevel, Employee[] employees) {
        super(information, accessLevel);
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Data cars {\nInformation: " + information + "\nAccess level: " + accessLevel + "\nCards: " +
                employees.toString() + "\n}";
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
        EmployeesData other = (EmployeesData) that;
        return information.equals(other.information) && accessLevel == other.accessLevel &&
                employees.equals(other.employees);
    }

    @Override
    public int hashCode() {
        return (accessLevel.hashCode() + information.hashCode()) / 2 + employees.hashCode();
    }
}
