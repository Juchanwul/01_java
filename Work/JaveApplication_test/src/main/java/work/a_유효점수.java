package work;

import java.util.Arrays;
import java.util.Scanner;

public class a_유효점수 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("심사위원의 수를 입력하시오 : ");
        int a = keyboard.nextInt();
        int[] score = new int[a];
        int sum = 0;
        
        System.out.print("심사위원의 점수를 입력 : ");
        for (int i = 0; i <= score.length - 1; i++) {
            score[i] = keyboard.nextInt();
        }
        
        Arrays.sort(score);
        
        for (int i = 1; i <= score.length - 2; i++) {
            sum = score[i] + sum;
        }
        double avg =(double) sum / (a - 2);
        System.out.println("합계는 : " + sum);
        System.out.printf("평균은 : %.2f",avg);
        
    }
    
}
