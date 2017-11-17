package work;

import java.util.Arrays;

public class 시험 {
    
    public static void main(String[] args) {
        
        String prov = "abc defg ijkm nop qrs wx yz";
        prov.substring(4, 8);
        System.out.println(prov.substring(4, 8));
        prov = prov.replace("ijk", "*#$%^");
        System.out.println(prov);
        
        
        String arr = "74 874 9883 73 9 73646 774";
        String arr2[] = arr.split(" ");
        
        int x[] =  new int[arr2.length];
        
        for (int i = 0; i<=arr2.length-1; i++){
            x[i] = Integer.valueOf(arr2[i]);  
        }
        
        Arrays.sort(x);
        System.out.println(x[x.length-1]);
        
    }
    
}
