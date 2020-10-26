package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.HeadOfDepartment;

import java.util.Arrays;

public class Department {
    private String name;
    private HeadOfDepartment headOfDepartment;
    private Employee[] employees;

    public Department(String name, HeadOfDepartment headOfDepartment, Employee[] employees) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeadOfDepartment getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Department {\nName: " + name + "\nHead : " + headOfDepartment.toString() + "\nEmployees: " +
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
        Department other = (Department) that;
        return name.equals(other.name) && headOfDepartment.equals(other.headOfDepartment) &&
                Arrays.equals(employees, other.employees);
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + headOfDepartment.hashCode()) / 2 + employees.hashCode();
    }
}
