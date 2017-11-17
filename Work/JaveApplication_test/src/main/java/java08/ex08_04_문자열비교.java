package java08;

import java.util.Scanner;

public class ex08_04_문자열비교 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input first string : ");
        String x = keyboard.next();
        System.out.print("Please input second string : ");
        String y = keyboard.next();
        
        if (x.equals(y)) {
            System.out.println("x.equals(y) : same");
            
        } else {
            System.out.println("x.equals(y) : different");
            
        }
        
        if (x == y) {
            System.out.println("x == y : same");
            
        } else {
            System.out.println("x == y : different");
            
        }
        
    }
    
}
