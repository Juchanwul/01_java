package work;

import java.util.Random;
import java.util.Scanner;

public class 낙서장 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("시작숫자 : ");
        int first = keyboard.nextInt();
        
        System.out.print(" 끝 숫자 : ");
        int last = keyboard.nextInt();
        
        int[] random = new int[10];
        for (int i = 0; i <= 9; i++) {
            random[i] = (rand.nextInt(last - first)) + first;
            System.out.println(random[i]);
            
        }
    }
    
}
