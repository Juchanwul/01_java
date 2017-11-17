package work;

import java.util.Scanner;

public class a_ex04_22 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("시작단을 입력하세요. : ");
        a = keyboard.nextInt();
        System.out.print("종료단을 입력하세요. : ");
        b = keyboard.nextInt();
        
        Gugu(a, b);
        
    }
    
    private static void Gugu(int a, int b) {
        
        int c = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        for (int i = a; i <= b; i++) {
            if (a == 0 || b == 0) {
                break;
            }
            for (int j = 1; j <= 9; j++) {
                c = i * j;
                System.out.printf("%2d * %2d = %4d ||", i, j, c);
            }
            System.out.println();
        }
    }
    
}
