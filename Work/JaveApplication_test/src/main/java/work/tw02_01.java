package work;

import java.util.Scanner;

public class tw02_01 {
    
    public static void main (String[] args) {
        
        int w = 6 ;
        int h = 2 ;
        int area = 0;
        int perimeter = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("가로를 입력하세요.> ");
        w = keyboard.nextInt();
        
        System.out.print("세로를 입력하세요.> ");
        h = keyboard.nextInt();
        
        area = w * h;
        perimeter = 2 * (w + h);
        

        System.out.println("면적은 " + area + "입니다.");
        System.out.println("둘레는 " + perimeter + "입니다.");
        System.out.printf("면적은 %d 입니다.\n",area);
        System.out.printf("둘레는 %d 입니다.", perimeter);
        
        
    }
    
}
