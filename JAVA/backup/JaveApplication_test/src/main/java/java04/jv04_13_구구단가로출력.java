package java04;

public class jv04_13_구구단가로출력 {
    
    public static void main(String[] args) {
        
        int r = 0;
        
        for (int i = 2; i <= 19; i++) {
            for (int j = 1; j <= 9; j++) {
                
                // 줄바꿈을 넣을수있는곳
                
                r = j * i;
                // System.out.print(i + " * " + j + "=" + r+" ");
                System.out.printf("%2d * %2d = %3d", i, j, r);
                if (j < 9) {
                    System.out.print(", ");
                }
            }
            
            // 줄바꿈을 넣을수있는곳
            System.out.println(".");
            
        }
    }
    
}
