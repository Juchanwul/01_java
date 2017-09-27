package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하시오 : ");
        
        int size = keyboard.nextInt();
        int[] array = new int[size];
        
        // 입력받기
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print("숫자를 입력하시오 : ");
            array[i] = keyboard.nextInt();
            
        }
        
        // 배열 값을 출력
        System.out.print("배열의 값은 : ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
            
            if (i == array.length - 1) {
                
            } else {
                System.out.print(", ");
            }
        }
        // System.out.printf("배열의 값은 : %d, %d, %d",array[0],array[1],array[2]);
    }
}
