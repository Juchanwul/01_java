package java03;

import java.util.Scanner;

public class ex03_01_LargeSmall {
    
    public static void main (String [] args) {
        
        int n = 0 ;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        n = keyboard.nextInt();
        
        keyboard.close();
        
        if ( n >= 100) {
            System.out.println("large");
        }
        
        
        else {
            System.out.println("small");
        }
    }
    
}
