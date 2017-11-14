package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    private static Oper op = new Oper(3, 5);
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @Test
    public void testAdd() {
        int rs = op.add();
        assertEquals(8, rs);
        assertNotEquals(6, rs);
        assertTrue(rs==8);
        assertFalse(rs==6);
    }
    
    @Test
    public void testMinus() {
        int rs = op.minus();
        assertEquals(-2, rs);
        assertNotEquals(6, rs);
        assertTrue(rs==-2);
        assertFalse(rs==6);
    }
    
    @Test
    public void testMul() {
        int rs = op.mul();
        assertEquals(15, rs);
        assertNotEquals(6, rs);
        assertTrue(rs==15);
        assertFalse(rs==6);
    }
    
    @Test
    public void testDiv() {
        double rs = op.div();
        assertEquals(0.6, rs, 0.00001);
        assertNotEquals(6, rs, 0.00001);
        assertTrue(rs==0.6);
        assertFalse(rs==6);
    }
    
}
