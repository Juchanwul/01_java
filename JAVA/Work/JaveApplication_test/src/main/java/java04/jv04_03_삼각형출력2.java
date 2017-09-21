package java04;

public class jv04_03_삼각형출력2 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
