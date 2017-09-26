package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("만들고자 하는 배열 크기를 입력하세요 : ");
        int size = keyboard.nextInt();
        
        int[] numbers = new int[size];
        
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i;
            
            System.out.println("numbers[" + i + "]" + " = " + numbers[i]);
            
        }
        
    }
    
}
