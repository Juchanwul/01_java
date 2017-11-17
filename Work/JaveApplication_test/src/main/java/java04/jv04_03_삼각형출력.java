package java04;

public class jv04_03_삼각형출력 {
    
    public static void main (String [] args) {
        
        for (int i = 1; i<=5; i++) {
            for(int j = 1; j<=10; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
     
      
        
        for (int i = 0; i<=9; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i<=5 ;i++) {
            for(int j = 5; j>=1; j--) {
                
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
