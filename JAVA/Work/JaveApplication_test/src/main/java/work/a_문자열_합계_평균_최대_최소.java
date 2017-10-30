package work;

import java.util.Arrays;

public class a_문자열_합계_평균_최대_최소 {
    
    public static void main(String[] args) {
        
        String a = "74 874 73 9 73646 774";
        String[] b = a.split(" ");
        int sum = 0;
        int[] c = new int[b.length];
        double avg = 0;
        
        for (int i = 0; i <= b.length - 1; i++) {
            
            c[i] = Integer.valueOf(b[i]);
        }
        
        for (int i = 0; i <= c.length - 1; i++) {
            sum = c[i] + sum;
        }
        Arrays.sort(c);
        avg = (double) sum / c.length;
        
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최대값 : " + c[c.length-1]);
        System.out.println("최소값 : " + c[0]);
        
    }
    
}
