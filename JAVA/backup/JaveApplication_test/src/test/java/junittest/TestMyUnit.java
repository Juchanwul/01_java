package junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyUnit {
    
    private static MyUnit m = null;
     
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    m = new MyUnit();
    }
    
    @Test
    public void testConcate() {
        
        String s = m.concate("a", "b");
        assertEquals("ab", s);        
        
    }
    
    @Test
    public void testGetBoolean() {
        assertFalse(m.getBoolean());
        assertEquals(false, m.getBoolean());
        assertTrue(false==m.getBoolean());
    }
    
    @Test
    public void testGetSameObject() {
        assertSame(null,m.getObject());
    }
    
    @Test
    public void testGetObject() {
        assertNull(m.getObject());
    }
    
    @Test
    public void testGetStringArray() {
        String[] a = {"one","two","three"};
        assertArrayEquals(a, m.getStringArray());
        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetException() {
        
        double d = m.getException();
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        ArrayList<String> list = m.getEmptyList();
        list.get(0);
    }
    
}
