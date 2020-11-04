package com.java.automation.lab.fall.cehanovich.core22.domain;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.BankCard;

public class Main {

    public static void main(String[] args) {
        try {
            BankCard a = new BankCard("0000 0000 0000 0000","","123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
