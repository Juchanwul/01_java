package work;

import java.util.Arrays;

public class 시험2 {
    
    public static void main(String[] args) {

        String arr = "74 874 9883 73 9 73646 774";
        String arr2[] = arr.split(" ");
        
        int x[] =  new int[arr2.length];
        
        for (int i = 0; i<=arr2.length-1; i++){
            x[i] = Integer.valueOf(arr2[i]);  
        }
        
        Arrays.sort(x);
        
        //가장큰 수
        System.out.println(x[x.length-1]);
        
        //합계
        int sum = 0;
        for(int i = 0; i<= x.length-1; i++){
            sum = sum + x[i];
        }
        System.out.println(sum);
        
        //평균
        System.out.println(sum/x.length);
        
        
        
    }
    
}
