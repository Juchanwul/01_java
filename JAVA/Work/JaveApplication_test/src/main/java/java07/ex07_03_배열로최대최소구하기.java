package java07;

import java.util.Scanner;

public class ex07_03_배열로최대최소구하기 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int[] array = new int[10];
        int temp = 0;
        
        System.out.print("INPUT : ");
        
        for (int i = 0; i <= array.length - 1; i++) {
            
            array[i] = keyboard.nextInt();
            
        }
        
        System.out.print("배열 전 정렬 : ");
        for (int i = 0; i <= array.length - 1; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
            
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            
            for (int j = 0; j <= i; j++) {
                
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
        
        
        System.out.print("배열 후 정렬 : ");
        for (int i = 0; i <= array.length - 1; i++) {
            
            if (i == array.length - 1) {
                System.out.println(array[array.length - 1]);
                break;
            }
            System.out.printf("%d, ", array[i]);
        }
        System.out.println("최소값 : " + array[0]);
        System.out.println("최대값 : " + array[array.length - 1]);
        
    }
    
}
