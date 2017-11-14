package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_09_maxarry2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        
        int size = keyboard.nextInt();
        int[] arr = new int[size];
        
        System.out.print("정수를 입력하세요 : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = keyboard.nextInt();
            
        }
        
        int temp = max(arr);
        System.out.println("가장 큰 값은 " + temp);

        
    }
    
    public static int max(int[] x) {
        
        Arrays.sort(x);
        
        return x[x.length-1];
    }
    
}
