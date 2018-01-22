package com.spring99.exam;

import java.util.List;

public interface IDaoPhone {

    ModelPhone getPhoneOne(String name);
    List<ModelPhone> getPhoneList();
    int insertPhone(ModelPhone phone);
    
}
