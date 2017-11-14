package java03;

import java.util.Scanner;

public class ex03_02MaxNumber {
    
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("첫번째수를를 입력하세요.> ");
        x = keyboard.nextInt();
        
        System.out.print("두번째수를 입력하세요.> ");
        y = keyboard.nextInt();
        
        System.out.print("세번째수를 입력하세요.> ");
        z = keyboard.nextInt();
        
        if (x > y) {
            System.out.println("x : " + x);
        } else if (x < y) {
            System.out.println("y : " + y);
        } else {
            System.out.println("x=y : " + x);
            
        }
        
       
            
        
    }
    
}
