package java06;

import java.util.Scanner;

public class ex06_04_사칙연산메서드 {
    
    public static void main(String[] args) {
        
        // 두개의 정수를 입력 받는다. x,y에 저장
        int x = 0, y = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("First num : ");
        x = keyboard.nextInt();
        
        System.out.print("Second num : ");
        y = keyboard.nextInt();
        
        int add = Add(x, y);
        int minus = Minus(x, y);
        int mul = Mul(x, y);
        double div = Div(x, y);
        
        System.out.println("Add : " + add);
        System.out.println("Minus : " + minus);
        System.out.println("Mul : " + mul);
        System.out.println("Div : " + div);
        // 소수점 자리 늘리기 System.out.printf("Div : %.6f"+div)
        
    }
    
    private static int Add(int x, int y) {
        int result = x + y;
        return result;
    }
    
    private static int Minus(int x, int y) {
        int result = x - y;
        return result;
        
    }
    
    private static int Mul(int x, int y) {
        int result = x * y;
        return result;
    }
    
    private static double Div(int x, int y) {
        double result = (double) x / y;
        return result;
    }
    
}
