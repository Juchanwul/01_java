package java15.st2enum;

import java.util.Scanner;

public class PhoneHeaderTest {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("폰번호를 입력하시오 : ");
        String num = keyboard.next();
        
        String header = num.substring(0, 3);
        
        if (header.equals(PhoneHeaderClass.P010)) {
            System.out.println("general");
        } 
        
        else if (header.equals(PhoneHeaderClass.P011)) {
            System.out.println("sk");
        } 
        
        else if (header.equals(PhoneHeaderClass.P017)) {
            System.out.println("kt");
        } 
        
        else if (header.equals(PhoneHeaderClass.P019)) {
            System.out.println("lg");
        } 
        
        else {
            System.out.println();
            
        }
        if (header.equals(PhoneHeaderEnum.P010.getValue())) {
            System.out.println("general");
        } 
        else if (header.equals(PhoneHeaderEnum.P011.getValue())) {
            System.out.println("sk");
        } 
        else if (header.equals(PhoneHeaderEnum.P016.getValue())) {
            System.out.println("kt");
        } 
        else if (header.equals(PhoneHeaderEnum.P019.getValue())) {
            System.out.println("lg");
        } 
        
        
        
    }
}
