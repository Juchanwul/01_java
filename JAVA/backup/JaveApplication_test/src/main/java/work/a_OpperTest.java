package work;

import java.util.Scanner;

public class a_OpperTest {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First num : ");
        int a = keyboard.nextInt();
        System.out.print("Second num : ");
        int b = keyboard.nextInt();
        
        a_Opper o = new a_Opper();
        o.setA(a);
        o.setB(b);
        
        o.Add();
        o.Minus();
        o.Mul();
        o.Div();
        
    }
    
}
