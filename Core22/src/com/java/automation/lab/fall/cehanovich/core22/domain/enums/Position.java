package com.java.automation.lab.fall.cehanovich.core22.domain.enums;

public enum Position {
    THE_PRESIDENT("The head of organization"),
    VICE_PRESIDENT("Has some powers of the head of the organization"),
    HEAD_OF_DEPARTMENT("An official managing the work of departments"),
    WORKER("Person employed under an employment contract"),
    NEWBIE("An employee on an internship at a company");
    private String description;

    Position(String description) {
        this.description = description;
    }
}
