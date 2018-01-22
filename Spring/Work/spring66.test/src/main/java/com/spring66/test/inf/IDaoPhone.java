package com.spring66.test.inf;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring66.test.model.ModelPhone;

public interface IDaoPhone {
    
    ModelPhone getPhoneOne(String name);
    List<ModelPhone> getPhoneList();
    int insertPhone(ModelPhone phone);
    int insertPhoneList(List<ModelPhone> phones);

}
