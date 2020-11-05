package com.java.automation.lab.fall.cehanovich.core22.domain;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BankCard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        try {
            BankCard a = new BankCard("4484 4444 4440 4444","03/12","123", BigDecimal.valueOf(55.50));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
