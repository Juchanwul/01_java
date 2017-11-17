package java04;

import java.util.Scanner;

public class ex04_21_무한입력 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int i = 0;
        
        for (; true;) {
            System.out.print("정수를 입력하세요 : ");
            i = keyboard.nextInt();
            
            if (i < 0) {
                System.out.println("정상 종료합니다.");
                break;
            } else {
                System.out.printf("입력한 값은 %d입니다\n", i);
                
            }
            
        }
    }
}
