package java22.junit;

import java.util.ArrayList;

public class MyUnit {
    
    public String concate(String s, String s2) {        
        return s + s2;
        
    }
    
    public boolean getBoolean() {
        return false;
    }
    
    public Object getSameObject() {
        return null;
    }
    
    public Object getObject() {
        return null;
    }
    
    public String[] getStringArray() {
        return new String[] { "one", "two", "three" };
    }
    
    public double getException() throws ArithmeticException {
        throw new ArithmeticException("not Implemented Exception");
    }
    
    public ArrayList<String> getEmptyList() {
        return new ArrayList<String>();
    }
}
