package com.java.automation.lab.fall.cehanovich.core22.domain.classes.dao;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;

public interface ShippingInfoDAO {
    ShippingInfo create(OffsetDateTime date, Address address, User customerInfo);
    ShippingInfo update(ShippingInfo shippingInfo);
    ShippingInfo getById(long id);
    List<ShippingInfo> get();
    void delete(long id);
}
