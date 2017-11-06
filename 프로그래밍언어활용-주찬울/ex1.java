package 주찬울;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값을 입력하세요.  ");
        int first = keyboard.nextInt();
        System.out.print("종료값을 입력하세요.  ");
        int last = keyboard.nextInt();
        int sum = 0;
        
        if (first > last) {
            int temp = first;
            first = last;
            last = temp;
            
        }
        
        for (int i = first; i <= last; i++) {
            sum = sum + i;
            System.out.print(i);
            if (i == last) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
        }
        System.out.print(sum);
        
    }
    
}
