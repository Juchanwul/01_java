package com.spring99.exam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoPhone implements IDaoPhone {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SqlSession session;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        return session.selectOne("mapperPhone.getPhoneOne", name);
    }

    @Override
    public List<ModelPhone> getPhoneList() {
   
        return session.selectList("mapper.getPhoneList");
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        return session.insert("mapperPhone.insertPhone", phone);
    }
}
