package com.java.automation.lab.fall.cehanovich.core22.domain.service;

import com.java.automation.lab.fall.cehanovich.core22.domain.dao.*;
import com.java.automation.lab.fall.cehanovich.core22.domain.io.PropertyReader;

import java.util.Map;

public class BaseService {
    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, AddressDAO> ADDRESS_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.AddressDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.AddressDAOImpl.getInstance()
    );
    protected static final Map<String, BankCardDAO> BANK_CARD_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.BankCardDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.BankCardDAOImpl.getInstance()
    );
    protected static final Map<String, BasketDAO> BASKET_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.BasketDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.BasketDAOImpl.getInstance()
    );
    protected static final Map<String, BillingInfoDAO> BILLING_INFO_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.BillingInfoDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.BillingInfoDAOImpl.getInstance()
    );
    protected static final Map<String, CategoryDAO> CATEGORY_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.CategoryDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.CategoryDAOImpl.getInstance()
    );
    protected static final Map<String, CouponDAO> COUPON_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.CouponDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.CouponDAOImpl.getInstance()
    );
    protected static final Map<String, OrderDAO> ORDER_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.OrderDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.OrderDAOImpl.getInstance()
    );
    protected static final Map<String, PriceBookDAO> PRICE_BOOK_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.PriceBookDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.PriceBookDAOImpl.getInstance()
    );
    protected static final Map<String, ProductDAO> PRODUCT_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.ProductDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.ProductDAOImpl.getInstance()
    );
    protected static final Map<String, RegisteredUserDAO> REGISTERED_USER_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.RegisteredUserDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.RegisteredUserDAOImpl.getInstance()
    );
    protected static final Map<String, RGBDAO> RGBDAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.RGBDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.RGBDAOImpl.getInstance()
    );
    protected static final Map<String, ShippingInfoDAO> SHIPPING_INFO_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.ShippingInfoDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.ShippingInfoDAOImpl.getInstance()
    );

    protected static final Map<String, SubcategoryDAO> SUBCATEGORY_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.SubcategoryDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.SubcategoryDAOImpl.getInstance()
    );

    protected static final Map<String, UserDAO> USER_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.UserDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.UserDAOImpl.getInstance()
    );

    protected static final Map<String, VariationDAO> VARIATION_DAO_MAP = Map.of(
            "MOCK", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.mock.VariationDAOImpl.getInstance(),
            "OBJ", com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.clazz.VariationDAOImpl.getInstance()
    );


}
