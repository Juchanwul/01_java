package java05;

public class ex05_01_369게임 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            
            String a = Integer.toString(i);
            int b = a.length();
            
            for (int j = 0; j < (a.length()); j++) {
                
                if (a.charAt(j) == '3' || a.charAt(j) == '6'
                        || a.charAt(j) == '9') {
                    
                    sum = sum + 1;
                }
            }
            
            if (sum > 0) {
                
                System.out.println(i + " 박수" + sum + '번');
                sum = 0;
            }
            
        }
        
    }
}
