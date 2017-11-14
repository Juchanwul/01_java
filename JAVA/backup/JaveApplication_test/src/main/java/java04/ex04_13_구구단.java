package java04;

import java.util.Scanner;

public class ex04_13_구구단 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        int a = keyboard.nextInt();
        System.out.print("종료 단수를 입력하세요 : ");
        int b = keyboard.nextInt();
        
        int i = 0;
        int r = 0;
        
        if (a > b) {
            i = b;
            b = a;
            a = i;
        }
        
        for (i = a; i <= b; i++) {
            
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
