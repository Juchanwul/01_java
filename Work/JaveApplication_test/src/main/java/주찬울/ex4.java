package 주찬울;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Oper o = new Oper();
        System.out.print("First num : ");
        int x = keyboard.nextInt();
        o.setFirstNum(x);
        System.out.print("Second num : ");
        int y = keyboard.nextInt();
        o.setSecondNum(y);
        
        System.out.println("Add : " + o.add());
        System.out.println("Minus : " + o.minus());
        System.out.println("Mul : " + o.mul());
        System.out.printf("Div : %.6f", o.div());
    }
    
}
