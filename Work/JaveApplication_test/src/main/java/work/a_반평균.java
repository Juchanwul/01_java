package work;

import java.util.Scanner;

public class a_반평균 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("학생수를 입력하시오 : ");
        int a = keyboard.nextInt();        
        int[] score = new int[a];
        int sum = 0;
        
        for (int i = 0; i <= score.length-1; i++){
            System.out.print("성적을 입력하시오 : ");
            score[i] = keyboard.nextInt();
            
            sum = score[i] + sum;
            
        }
        
        System.out.println("합계는 : "+ sum);
        System.out.println("평균은 : " + sum/a);
        
    }
    
}
