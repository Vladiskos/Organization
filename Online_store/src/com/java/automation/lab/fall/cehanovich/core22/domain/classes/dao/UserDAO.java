package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Color;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Size;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface UserDAO {
    User create(int id, String firstname, String lastname, String contactNumber, String email);
    User update(User user);
    User getById(long id);
    List<User> get();
    void delete(long id);
}
