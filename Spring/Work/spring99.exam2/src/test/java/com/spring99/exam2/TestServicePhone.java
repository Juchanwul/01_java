package com.spring99.exam2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring99.exam2.inf.IServicePhone;
import com.spring99.exam2.model.ModelPhone;

public class TestServicePhone {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static ClassPathXmlApplicationContext context;
    private static IServicePhone service;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext(
                "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service = context.getBean("servicePhone", IServicePhone.class);
    }

    @Test
    public void testInsertPhone() {
        int result = -1;
        ModelPhone phone = new ModelPhone("name1", "fac1", 1000);

        result = service.insertPhone(phone);
        assertEquals(1, result);
    }

    @Test
    public void testGetPhoneList() {
        List<ModelPhone> result = service.getPhoneList();
        System.out.println("size = " + result.size());

        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetPhoneOne() {
        ModelPhone result = service.getPhoneOne("name1");
        ModelPhone aaa = new ModelPhone("name1", "manu1", 1000);
        assertNotNull(result);
        assertEquals(aaa.getPhname(), result.getPhname());
        
    }

    @Test
    public void testInsertPhoneList() {
        
        List<ModelPhone> phones = new ArrayList<>();
        
        phones.add(new ModelPhone("name1", "fac1", 1000));
        phones.add(new ModelPhone("name2", "fac2", 1000));
        phones.add(new ModelPhone("name3", "fac3", 1000));
        phones.add(new ModelPhone("name4", "fac4", 1000));
        phones.add(new ModelPhone("name5", "fac5", 1000));
        
        int result = -1;
        result = service.insertPhoneList(phones);
        
        assertEquals(5, result);
        
        
        
    }
}
