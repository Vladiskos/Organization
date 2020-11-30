package com.java.automation.lab.fall.cehanovich.core22.domain.dao.impl.xml;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Address;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Category;
import com.java.automation.lab.fall.cehanovich.core22.domain.constant.IOConstant;
import com.java.automation.lab.fall.cehanovich.core22.domain.dao.CategoryDAO;
import com.java.automation.lab.fall.cehanovich.core22.domain.exception.NotImplementedException;
import com.java.automation.lab.fall.cehanovich.core22.domain.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {
    private static CategoryDAOImpl instance;

    public synchronized static CategoryDAOImpl getInstance() {
        if (instance==null) {
            instance = new CategoryDAOImpl();
        }
        return instance;
    }

    private CategoryDAOImpl() {

    }

    @Override
    public Category create(Category o) {
        try {
            new XMLIO<>(Category.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Category getById(Long id) {
        try {
            return new XMLIO<>(Category.class).read(String.format(IOConstant.XML_OBJ_PATH, Category.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Category> get() {
        return null;
    }

    @Override
    public Category update(Category o) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
