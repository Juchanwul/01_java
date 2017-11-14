package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기 {
    
    public static void main(String[] args) {
        
        int[] score = new int[3];
        
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i <= score.length - 1; i++) {
            
            System.out.print("숫자를 입력하시오 : ");
            score[i] = keyboard.nextInt();
            
         
        }
        
         System.out.print("배열의 값은 : ");
         for (int i = 0; i <= score.length - 1; i++) {
             System.out.print(score[i]);
         }
    }
}
