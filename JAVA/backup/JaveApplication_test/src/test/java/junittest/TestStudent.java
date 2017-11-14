package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {
    
    private static Student s = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        s = new Student();
    }
    
   
    @Test
    public void testGetgrade() {
        
        assertEquals("A",s.getgrade(100));
        assertEquals("A",s.getgrade(90));
        
        assertEquals("B",s.getgrade(89));
        assertEquals("B",s.getgrade(80));
        
        assertEquals("C",s.getgrade(79));
        assertEquals("C",s.getgrade(70));
        
        assertEquals("D",s.getgrade(69));
        assertEquals("D",s.getgrade(60));
        
        assertEquals("F",s.getgrade(59));
        assertEquals("F",s.getgrade(0));
    }
    
}
