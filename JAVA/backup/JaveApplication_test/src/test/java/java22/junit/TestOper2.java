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
        int  r = op.minus();
        assertEquals(0, r);
    }
    
    @Test
    public void testMul(){
        Oper op = new Oper(5,5);
        int r = op.mul();
        assertEquals(25, r);
    }
    
    
    
    @Test
    public void testDiv(){
        Oper op = new Oper(5,5);
        double r = op.div();
        assertEquals(1.0, r, 0.01);
    }
    
}
