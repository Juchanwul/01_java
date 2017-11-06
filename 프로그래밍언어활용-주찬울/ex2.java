package 주찬울;

import java.util.Arrays;

public class ex2 {
    
    public static void main(String[] args) {
        
        int[] array = { 23, 96, 35, 42, 81, 19, 8, 77, 50 };
        
        System.out.print("정렬전 : ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        
        System.out.print("정렬후 : ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
    
}
