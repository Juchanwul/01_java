package java07;

import java.util.Scanner;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("심사 위원의 수를 입력하세요 : ");
        int ref = keyboard.nextInt();
        int[] score = new int[ref];
        int temp = 0;
        int sum = 0;
        double avr = 0;
        
        System.out.print("5명의 심사 위원의 점수 입력 : ");
        for (int i = 0; i <= score.length - 1; i++) {
            
            score[i] = keyboard.nextInt();
           
            
        }
        
        for (int i = score.length - 1; i >= 0; i--) {
            
            for (int j = 0; j <= i; j++) {
                
                if (score[i] < score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
                
            }
            
        }
        
        System.out.print("유효점수 : ");
        for (int i = 1; i <= score.length - 2; i++) {
            
            System.out.printf("%d ", score[i]);
            sum = sum + score[i];
            
            if (i == score.length - 2) {
                avr = (double) sum / (ref - 2);
                System.out.println();

            }
            
        }
        System.out.println("합계 : " + sum);
        
        System.out.println("평균 : " + avr);
        
    }
    
}
