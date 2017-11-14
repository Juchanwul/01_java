package java04;

public class ex04_09 {
    
    public static void main(String[] args) {
        
        int a = 0;
        int sum = 0;
        
        for (int i = a; i <= 10; i++) {
            
            for (int j = 0; j<=i; j++){
                sum = sum + j;
                
            }
            
        }
        System.out.println(sum);
        
    }
    
}
