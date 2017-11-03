package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper2 {
   
    @Test
    public void testadd() {
        Oper op = new Oper(5,5);
        int r = op.add();
        assertEquals(10, r);
        
    }
    
    @Test
    public void testMinus() {
        Oper op = new Oper(5,5);
        int  rs = op.minus();
        assertEquals(0, rs);
    }
    
    @Test
    public void testMul(){
        Oper op = new Oper(5,5);
        int rs = op.mul();
        assertEquals(25, rs);
    }
    
    
    
    @Test
    public void testDiv(){
        Oper op = new Oper(5,5);
        double rs = op.div();
        assertEquals(1, rs);
    }
    
}
