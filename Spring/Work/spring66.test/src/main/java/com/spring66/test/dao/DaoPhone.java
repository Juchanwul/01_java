package com.spring66.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring66.test.inf.IDaoPhone;
import com.spring66.test.model.ModelPhone;

@Repository
public class DaoPhone implements IDaoPhone {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SqlSession session;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        return session.selectOne("mapper.mysql.mapperPhone.getPhoneOne", name);
    }

    @Override
    public List<ModelPhone> getPhoneList() {
        return session.selectList("mapper.mysql.mapperPhone.getPhoneList");
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        return session.selectOne("mapper.mysql.mapperPhone.insertPhone", phone);
    }

    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        return session.selectOne("mapper.mysql.mapperPhone.insertPhoneList", phones);
    }
}
