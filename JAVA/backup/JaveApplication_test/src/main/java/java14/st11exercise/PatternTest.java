package java14.st11exercise;

import org.hamcrest.core.SubstringMatcher;

public class PatternTest {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle("yellow", null, 5,6);
        System.out.println(r1.toString());
        
        Circle c1 = new Circle(15);
        Point center = new Point(32, 15);
        c1.setPt(center);
        c1.color = "red";
        System.out.println(c1.toString());
        
        
        
        String prov = "abc defg ijklm nop qrs wx yz";
        System.out.println(prov.length());
        System.out.println(prov.substring(4, 8));
        System.out.println(prov.replace("ijk", "*#$%^"));
    }
    
    
    
}
