package java23;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junittest.Rect;

public class TestRect {
    
    private static Rect r = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        r = new Rect(5, 10);
    }
    
    @Test
    public void testArea() {
        int area = r.area();
        assertEquals(50, area);
        assertNotEquals(30, area);
        assertTrue(area == 50);
        assertFalse(30 == area);
    }
    
    @Test
    public void testPerimeter() {
        int per = r.perimeter();
        assertEquals(30, per);
        assertNotEquals(50, per);
        assertTrue(per == 30);
        assertFalse(50 == per);
    }
    
}
