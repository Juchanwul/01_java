package java11.st4;

import java.util.Scanner;

public class OperTest {
    
    public static void main(String[] args) {
      
        Oper myOper = new Oper();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First num : ");
        myOper.setN1(keyboard.nextInt());
        System.out.print("Second num : ");
        myOper.setN2(keyboard.nextInt());
        
        myOper.printResult();
        
    }
    
}
