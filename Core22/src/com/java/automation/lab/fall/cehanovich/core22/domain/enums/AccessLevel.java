package com.java.automation.lab.fall.cehanovich.core22.domain.enums;

public enum AccessLevel {
    LEVEL_1("Has a minimum level of access to information and offices"),
    LEVEL_2("Has access to work information"),
    LEVEL_3("Has access to all information in the department"),
    LEVEL_4("Has access to all information in about all departments фтв classified information"),
    LEVEL_5("Has access to all information about all departments," +
            "classified information, as well as about the external affairs of the company");
    private String description;
    AccessLevel(String description) {
        this.description = description;
    }
}
