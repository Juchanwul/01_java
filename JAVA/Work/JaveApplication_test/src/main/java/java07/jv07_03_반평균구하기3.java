package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("학생수를 입력하시오 : ");
        
        int size = keyboard.nextInt();
        int[] array = new int[size];
        int sum = 0;
        double avr = 0;
        
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print("성적을 입력하시오 : ");
            array[i] = keyboard.nextInt();
            
        }
       
        for (int i = 0 ; i<= array.length-1; i++){
            sum = sum + array[i];
            if(i==array.length-1){
                avr = sum/size;
            }
        }
        
        System.out.println("합계는 : " +sum);
        System.out.println("평균은 : " +avr);
        // System.out.printf("배열의 값은 : %d, %d, %d",array[0],array[1],array[2]);
    }
}
