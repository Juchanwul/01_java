package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_08_Array메서드 {
    
    public static void main(String[] args) {
        
        Scanner keyboard =new Scanner(System.in);
        
        // 배열만들기
        int size = 6;
        int[] arr = new int[size];
        
        // for문을 이용한 배열 초기화
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr.length  - i;
            
        }
        printArray(arr);
        
        // Arrays 정렬
        Arrays.sort(arr);
        printArray(arr);
        
        
        // Arrays 검색
        int val = java.util.Arrays.binarySearch(arr, 3);
        System.out.println("3값의 위치 : "+val);
        
        // Arrays 초기화
        Arrays.fill(arr, -1);
        printArray(arr);
        
        
    }
    
    // void printArray (int[] a)메서드 만들기
    
    public static void printArray(int[] x) {
        
        for (int i = 0; i <= x.length - 1; i++) {
            
            if (i == x.length - 1) {
                System.out.print(x[i]+"\n");
            }
            
            else{
                System.out.print(x[i] + ", ");
            }
            
        }
    }
    
}
