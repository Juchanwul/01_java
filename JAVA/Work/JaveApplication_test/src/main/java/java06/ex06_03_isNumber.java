package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
    
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. ");
        String str = keyboard.next();  
        isNumber(str);
        System.out.println(isNumber(str));

    }
    
    
    
    public static boolean isNumber (String str2) {
        
        boolean b = true;
        
        if(str2==null || str2==""){
            b = false;
            
        }
       
        
        return b;
        
        
    }
    
    
        
    
    
    
    
    
    
}
