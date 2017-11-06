package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMyUnit {
    
    private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
    }
    
    @Test
    public void testConcate() {
        String result = myUnit.concate("ab", "12");
        assertEquals("ab12", result);
    }
    
    @Test
    public void textGetBoolean() {
        boolean b = myUnit.getBoolean();
        assertFalse(b);
        assertFalse(myUnit.getBoolean());
        assertSame(b, false);
        assertEquals(b, false);
    }
    
    @Test
    public void testGetSameObject() {
        Object o = myUnit.getSameObject(); 
        assertNull(o);
        assertEquals(null, o);
    }
    
    @Test
    public void testGetObject() {
        Object o = myUnit.getSameObject();
        assertNull(o);
        assertEquals(null, o);
    }
    
    @Test
    public void testGetStringArray() {
        String[] s = myUnit.getStringArray();
        String[] e = {"one","two","three"};
        assertArrayEquals(e, s);  //배열의 값으로 동일여부를 비교
    }
    
    @Ignore // 테스트를 생략
    @Test(expected = ArithmeticException.class) //    Exception 처리하는 방법
    public void testGetException() {
        double d = myUnit.getException();      //  ArithmeticException이 발생
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        ArrayList<String> list = myUnit.getEmptyList();
        list.get(0);
    }
}
