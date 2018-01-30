package com.spring99.exam2.inf;

import java.util.List;

import com.spring99.exam2.model.ModelPhone;

public interface IDaoPhone {
    
    ModelPhone  getPhoneOne(String name);
    List<ModelPhone>  getPhoneList();
    int insertPhone( ModelPhone phone );
    int insertPhoneList( List<ModelPhone> phones );

}
