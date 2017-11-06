package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    @Test
    public void testAdd() {
        Oper op = new Oper(2, 4);
        int rs = op.add();
        assertEquals(6, rs);
        assertNotEquals(5, rs);
        assertSame(6, rs);
        assertNotSame(0, rs);
        
    }
    
    @Test
    public void testMinus() {
        Oper op = new Oper(2, 4);
        int rs = op.minus();
        assertEquals(-2, rs);
        assertSame(-2, rs);
        assertNotEquals(2, rs);
        assertNotSame(2, rs);
    
    }
    
    @Test
    public void testMul() {
        Oper op = new Oper(2, 4);
        int rs = op.mul();
        assertEquals(8, rs);
        assertSame(8, rs);
        assertNotEquals(5, rs);
        assertNotSame(2, rs);
    }
    
    @Test
    public void testDiv() {
        Oper op = new Oper(2, 4);
        double rs = op.div();
        assertEquals(0.5, rs, 0.00001);
        // assertSame(0.5, rs);;
        assertNotEquals(1, rs, 0.00001);
    }
    
}
