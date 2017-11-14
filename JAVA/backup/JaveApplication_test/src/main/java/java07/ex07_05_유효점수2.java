package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05_유효점수2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("심사 위원의 수를 입력하세요 : ");
        int ref = keyboard.nextInt();
        int[] score = new int[ref];
        double avr = 0;
        
        System.out.print("5명의 심사 위원의 점수 입력 : ");
        
        for (int i = 0; i <= score.length - 1; i++) {
            
            score[i] = keyboard.nextInt();
            
        }
        
        Arrays.sort(score);
        SigNumber(score);
        SigSum(score);
        SigAverage(score);
        
    }
    
    private static void SigAverage(int[] x) {
        System.out.print("평균 : ");
        int sum = 0;
        double avr = 0;
        for (int i = 1; i <= x.length - 2; i++) {
            sum = sum + x[i];
            
        }
        avr = (double) sum / (x.length - 2);
        System.out.print(avr);
        
    }
    
    private static void SigNumber(int[] x) {
        System.out.print("유효점수 : ");
        for (int i = 1; i <= x.length - 2; i++) {
            if (i == x.length - 2) {
                System.out.println(x[i]);
            } else {
                System.out.print(x[i] + ", ");
                
            }
            
        }
        
    }
    
    private static void SigSum(int[] x) {
        int sum = 0;
        for (int i = 1; i <= x.length - 2; i++) {
            sum = sum + x[i];
            
        }
        
        System.out.println("합계 : " + sum);
        
    }
    
}
