package work;

import java.util.Scanner;

public class a_ex04 {
    
    private static int a   = 0;
    private static int b   = 0;
    private static int sum = 0;
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값을 입력하세요. : ");
        a = keyboard.nextInt();
        System.out.print("종료값을 입력하세요. : ");
        b = keyboard.nextInt();
        
        sum = Sum(a, b);
        Print(sum);
        
    }
    
    private static void Print(int sum) {
        
        System.out.printf("%d부터 %d까지의 합계는 %d입니다.", a, b, sum);
        
    }
    
    private static int Sum(int a, int b) {
        int sum = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        for (int i = a; i <= b; i++) {
            sum = i + sum;
        }
        
        return sum;
    }
    
}
