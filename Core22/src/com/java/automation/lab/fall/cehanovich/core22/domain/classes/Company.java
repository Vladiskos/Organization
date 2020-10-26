package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;

import java.util.Arrays;

public class Company {
    private Department[] departments;
    private Employee[] employees;
    private Server server;
    private int employeeIndex;

    public Company(Employee[] employees, Server server, Department[] departments) {
        this.departments = departments;
        this.employees = employees;
        this.employeeIndex = employees.length;
        this.server = server;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public void addEmployee(Employee employee) {
        employees[employeeIndex] = employee;
        this.employeeIndex++;
    }

    public void deleteEmployee(int index) {
        for (int i = index; i < employees.length; i++) {
            employees[i] = employees[++i];
        }
        employees[this.employeeIndex - 1] = null;
        employeeIndex--;
    }


    @Override
    public String toString() {
        return "Company {\nDepartments: " + departments.toString() + "\nEmployees: " + employees.toString() +
                "\nServer: " + server + "\nEmployee index: " + employeeIndex + "\n}";
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
        Company other = (Company) that;
        return Arrays.equals(departments, other.departments) && Arrays.equals(employees, other.employees) &&
                server.equals(other.server) && employeeIndex == other.employeeIndex;
    }

    @Override
    public int hashCode() {
        return (departments.hashCode() + employees.hashCode()) / 2 + server.hashCode() + employeeIndex;
    }

}
