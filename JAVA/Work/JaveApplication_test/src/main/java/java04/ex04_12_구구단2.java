package java04;

import java.util.Scanner;

public class ex04_12_구구단2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        int n1 = keyboard.nextInt();
        System.out.print("종료 단수를 입력하세요 : ");
        int n2 = keyboard.nextInt();
    
        int r = 0;
        
        
        
        
        for (int i = n1; i <= n2; i++) {
            
            for (int j = 1; j <= 9; j++) {
                r = i * j;
                System.out.printf("%2d *%2d =%3d", i, j, r);
                
                if (j < 9) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
                
            }
            
        }
    }
    
}
