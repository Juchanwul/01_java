package 주찬울;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        for (; true;) {
            System.out.print("시작단수를 입력하세요 : ");
            int first = keyboard.nextInt();
            System.out.print("종료단수를 입력하세요 : ");
            int last = keyboard.nextInt();
            
            if (first > last) {
                int temp = first;
                first = last;
                last = temp;
            }
            
            if (first == 0 || last == 0) {
                System.out.println("\n잘못된 입력입니다.\n프로그램을 종료합니다.");
                break;
            }
            
            for (int i = first; i <= last; i++) {
                
                for (int j = 1; j <= 9; j++) {
                    Print(i, j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void Print(int i, int j) {
        int a = i * j;
        System.out.print(i + " * " + j + " = " + a + " | ");
    }
    
}
