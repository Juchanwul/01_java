package java04;

import java.util.Scanner;

public class ex04_01_n1부터n2합계구하기 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int i = keyboard.nextInt();
        
        
        System.out.print("정수를 입력하세요 : ");
        int j = keyboard.nextInt();
        
        int sum = 0;
        
        for (i = i; i <= j; i++) {
            if (i == j) {
                System.out.print(i);
                
            } else {
                System.out.print(i + "+");
                
            }
            sum = sum + i;
            
        }
        System.out.print(" = " + sum);
    }
}
