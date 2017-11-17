package java02;

public class jv02_16_논리연산자복합 {
    
    public static void main (String [] args) {
        
        //정수 변수 선언 & 초기화
        
        int x = 3 ;
        int y = 4 ;
        
        System.out.println((x ==y ) && (x !=y));
        
        System.out.println((x > y) || (x < y));
        
        System.out.println((x >= y) || (x <= y));
        
        System.out.println((x == y) && (x != y ) || (x < y ));
        
        
    }
}
