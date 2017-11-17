package java04;

import java.util.Scanner;

public class ex04_14_무한구구단 {
    
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        
        for (; true;) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("시작 단수를 입력하세요. ");
            n1 = keyboard.nextInt();
            
            System.out.print("종료 단수를 입력하세요. ");
            n2 = keyboard.nextInt();
            
            if (n1 > n2) {
                n3 = n1;
                n1 = n2;
                n2 = n3;
                
            }
            if (n1 == 0 || n2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
                
            } else {
                
                for (int i = n1; i <= n2; i++) {
                    for (int j = 1; j <= 9; j++) {
                        int r = i * j;
                        System.out.printf("%2d * %2d = %3d", i, j, r);
                        if (j < 9) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println(".");
                }
                
            }
        }
    }
    
}
