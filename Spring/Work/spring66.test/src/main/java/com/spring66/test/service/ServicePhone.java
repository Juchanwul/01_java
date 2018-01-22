package com.spring66.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring66.test.inf.IDaoPhone;
import com.spring66.test.inf.IServicePhone;
import com.spring66.test.model.ModelPhone;

@Service
public class ServicePhone implements IServicePhone {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IDaoPhone dao;

    @Override
    public ModelPhone getPhoneOne(String name) {
        ModelPhone result = null;
        try {
            result = dao.getPhoneOne(name);
        } catch (Exception e) {
            logger.error("getPhoneOne" + e.getMessage());
            throw e;
        }
        return result;
    }

    @Override
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;

        try {
            result = dao.getPhoneList();
        } catch (Exception e) {
            logger.error("getPhoneList" + e.getMessage());
            throw e;
        }
        return result;
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        int result = -1;
        try {
            result = dao.insertPhone(phone);
        } catch (Exception e) {
            logger.error("insertPhone" + e.getMessage());
            throw e;
        }
        return result;
    }

    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        int result = -1;
        try {
            dao.insertPhoneList(phones);
        } catch (Exception e) {
            logger.error("insertPhoneList" + e.getMessage());
            throw e;
        }

        return result;
    }

}
