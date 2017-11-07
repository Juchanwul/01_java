package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    private static List<String> list = null;
    
    @BeforeClass
    public static void setUpClass() {
        list = new ArrayList<String>();
        list.add("0");
        list.add("2");
        list.add("1");
        list.add("3");
        list.add("4");
    }
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @Test
    public void test01() {
        assertNotNull(list);
    }
    @Test
    public void test02() {
        assertEquals(5, list.size());
    }
    
    @Test
    public void test03() {
        for(int i = 0; i<=list.size()-1;i++){
            assertNotEquals(10, list.get(i));
        }
        assertFalse(list.contains("10"));
        int result = list.indexOf("10");
        assertEquals(-1, result);
    }
    @Test
    public void test04() {
        String names[] = {"y2kpooh", "hwang"};
        String names2[] = {"y2kpooh", "hwang"};
        assertArrayEquals(names, names2);
    }
    
    
    
}
