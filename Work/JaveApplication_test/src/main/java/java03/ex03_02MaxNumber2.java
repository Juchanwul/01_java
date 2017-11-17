package java03;

import java.util.Scanner;

public class ex03_02MaxNumber2 {
    
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("첫번째수를 입력하세요.> ");
        x = keyboard.nextInt();
        
        System.out.print("두번째수를 입력하세요.> ");
        y = keyboard.nextInt();
        
        System.out.print("세번째수를 입력하세요.> ");
        z = keyboard.nextInt();
        

        
        if (x > y) {
            if (x > z) {
                System.out.printf("입력 받은 수중 가장 큰 수는 %d입니다.", x);
            } else {
                System.out.printf("입력 받은 수중 가장 큰 수는 %d입니다.", z);
            }
        } else {
            if (y > z) {
                System.out.printf("입력 받은 수중 가장 큰 수는 %d입니다.", y);
            } else {
                System.out.printf("입력 받은 수중 가장 큰 수는 %d입니다.", z);
            }
            
        }
    }
    
}
