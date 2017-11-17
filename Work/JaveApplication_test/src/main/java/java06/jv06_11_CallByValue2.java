package java06;

public class jv06_11_CallByValue2 {
    
    public static void main (String[] args){
        
        String a = "5";
        String b = "3";
        
        System.out.println("swap 전: a =" + a + ", b = "+b);
        swap(a,b);
        System.out.println("swap 후: a =" + a + ", b = "+b);

                
    }

    private static void swap(String a, String b) {

        String temp = b;
        
        b = a;
        a = temp;
        System.out.println("swap 안: a =" + a + ", b = "+b);
        
        
        
        
    }
    
    

   
}
