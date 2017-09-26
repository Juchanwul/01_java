package java06;

import java.util.Scanner;

public class ex06_03_inNumber {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 ");
        String str = keyboard.next();
        boolean a = isNumber(str);
        System.out.println(a);
        
    }
    
    public static boolean isNumber(String str1) {
        
        boolean b = true;
        if (str1 == "" || str1 == null) {
            b = false;
            
        }
        
        return b;
    }
    
}
