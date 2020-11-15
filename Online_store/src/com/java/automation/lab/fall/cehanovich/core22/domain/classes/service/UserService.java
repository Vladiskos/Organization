package com.java.automation.lab.fall.cehanovich.core22.domain.classes.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.PriceBookDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.UserDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.PriceBookDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao.impl.UserDAOImpl;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserService {
    private static final UserDAO DAO = UserDAOImpl.getInstance();


    public static User createUser(int id, String firstname, String lastname, String contactNumber, String email) {
        return DAO.create(id, firstname, lastname, contactNumber, email);
    }

    public static User getUserById(Long id) {
        return DAO.getById(id);
    }

    public static List<User> get() {
        return DAO.get();
    }

    public static User update(User o) {
        return DAO.update(o);
    }

    public static void deleteById(Long id) {
        DAO.delete(id);
    }
}
