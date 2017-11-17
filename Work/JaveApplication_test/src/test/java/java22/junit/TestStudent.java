package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {
    static Student s = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        s = new Student();
    }
    
    @Test
    public void test1() { // 임계값으로 검정
        assertEquals("A", s.getgrade(100));
        assertEquals("A", s.getgrade(99));
        assertEquals("A", s.getgrade(90));
        
        assertEquals("B", s.getgrade(89));
        assertEquals("B", s.getgrade(80));
        
        assertEquals("C", s.getgrade(79));
        assertEquals("C", s.getgrade(70));
        
        assertEquals("D", s.getgrade(69));
        assertEquals("D", s.getgrade(60));
        
        assertEquals("F", s.getgrade(59));
        assertEquals("F", s.getgrade(0));
    }
    
}
