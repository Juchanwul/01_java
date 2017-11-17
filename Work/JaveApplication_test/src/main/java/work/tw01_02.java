package work;

import java.util.Scanner;

public class tw01_02 {
    

    
    public static void main ( String [] args) {
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요.> ");
        int x = keyboard.nextInt();
        System.out.println(x);
        
        
        System.out.print("문자를 입력하세요.> ");
        String y = keyboard.next();
        System.out.println(y);
        
        
    }
}    