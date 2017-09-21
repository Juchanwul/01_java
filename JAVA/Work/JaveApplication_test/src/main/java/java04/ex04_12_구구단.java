package java04;

import java.util.Scanner;

public class ex04_12_구구단 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        int i = keyboard.nextInt();
        System.out.print("종료 단수를 입력하세요 : ");
        int k = keyboard.nextInt();
    
        int r = 0;
        
        
        
        for (i = i; i <= k; i++) {
            
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
