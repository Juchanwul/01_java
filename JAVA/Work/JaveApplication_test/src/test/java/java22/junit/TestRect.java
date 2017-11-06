package java22.junit;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    
    private static Rect r = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
        r = new Rect();
        r.setWidth(2);
        r.setHeight(30);
        
    }
    
    @Test
    public void test_area() {
        int a = r.area();
        assertEquals(60, a);
        assertNotEquals(80, a);
        
        
    }
    
    @Test
    public void test_perimeter() {
        int p = r.perimeter();
        assertNotEquals(120, p);
        assertEquals(64, p);
        assertTrue(64 == p);
        assertFalse(120 == p);
    }
    @Test
    public void test_assertTrue() {
        int a = r.area();
        assertTrue(60 == a);
    }
    @Test
    public void test_assertFalse() {
        int a = r.area();
        assertFalse(80 == a);
    }
    @Test
    public void test_gettype(){
        Object o = r.gettype();
        assertNull(o);
        
    }
    
}
