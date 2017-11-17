package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class a_유효점수2 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Integer> score = null;
        int val = 0;
        
        score = new ArrayList<Integer>();
        System.out.print("심사위원의 수 : ");
        int a = keyboard.nextInt();
        
        for (int i = 0; i <= a - 1; i++) {
            System.out.print("심사위원의 점수 입력 : ");
            val = keyboard.nextInt();
            score.add(val);
        }
        Collections.sort(score);
        System.out.print("유효점수 : ");
        for (int i = 1; i <= score.size() - 2; i++){
            System.out.print(score.get(i)+"  ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= score.size() - 2; i++) {
            sum = getsum(score);
        }
        
        System.out.println("합계 : " + sum);
        
        double avg = getavg(sum, score.size() - 2);
        System.out.printf("평균 : %2f", avg);
    }
    
    
    
    
    
    
    public static int getsum(List<Integer> score) {
        int getsum = 0;
        for (int i = 1; i <= score.size() - 2; i++) {
            getsum = getsum + score.get(i);
        }
        
        return getsum;
    }
    
    public static double getavg(int sum, int size) {
        
        return (double) sum / size;
    }
    
}
