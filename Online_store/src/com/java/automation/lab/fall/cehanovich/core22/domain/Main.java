package com.java.automation.lab.fall.cehanovich.core22.domain;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.util.FileUtil;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.City;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) {

        BankCard card = new BankCard();

        try {
            card = new BankCard("0000 0000 0000 0000", "03/12","135", new BigDecimal(1000));

        } catch (Exception e) {
            e.printStackTrace();
        }
        FileUtil a = new FileUtil();
        String path = "src/resources/addresses.dict";
        Set<String> streets = Arrays.stream(a.readFile(path)
                .split("; "))
                .collect(Collectors.toSet());
        String street = "Street: Ivanova";
        if (streets.contains(street)) {
            System.out.println("Street was found!");
        } else {
            System.out.println("No street");
        }

/*
        System.out.println("main thread");
        List<Variation> variations = new LinkedList<>();
        variations.add(new Variation(1, Size.L, Color.BLACK,
                new Product(1,"sdfg","sdfg","sdfg"),5));
        variations.add(new Variation(1, Size.L, Color.BLACK,
                new Product(2,"sdfg","sdfg","sdfg"),5));
        variations.add(new Variation(1, Size.L, Color.BLACK,
                new Product(3,"sdfg","sdfg","sdfg"),5));
        BigDecimal totalPrice = new BigDecimal("100.05");
        Map<Variation, BigDecimal> priceAndProduct = new HashMap<>();
        priceAndProduct.put(new Variation(1, Size.L, Color.BLACK,
                new Product(2,"sdfg","sdfg","sdfg"),5), new BigDecimal("100.05"));
        priceAndProduct.put(new Variation(1, Size.L, Color.BLACK,
                new Product(2,"sdfg","sdfg","sdfg"),5), new BigDecimal("100.05"));
        priceAndProduct.put(new Variation(1, Size.L, Color.BLACK,
                new Product(2,"sdfg","sdfg","sdfg"),5), new BigDecimal("100.05"));
        PriceBook priceBook = new PriceBook(Currency.EUR,true, OffsetDateTime.now(),OffsetDateTime.of(2024,
                6,3,13,0,0,1, ZoneOffset.MIN),priceAndProduct);
        Coupon coupon = new Coupon(1, true,5);
        Set<BankCard> b = new HashSet<>();
        Address address = new Address(City.MINSK,"df",2,2);
        User user = new RegisteredUser(4,"Vladislav","q", "qwe","qwer",b,address,
                5, LocalDate.of(2000,3,3));
        BillingInfo billingInfo;
        ShippingInfo shippingInfo;
        Basket basket = new Basket(variations,totalPrice,card,priceBook,coupon);
        basket.start();
 */


    }
}
