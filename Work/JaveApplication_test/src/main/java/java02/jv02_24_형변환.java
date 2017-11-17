package java02;

public class jv02_24_형변환 {
    
    public static void main(String [] args) {
        
        int result = 1 + '2';
        System.out.println(result);
        
        int i = (true)? 1 : 0;
        int result1 = '2' + i;
        System.out.println(result1);   
        
        int i2 = Integer.parseInt("15");
        int result2 = i2 - 5;
        System.out.println(result2);   
        
        
        int result3 = Integer.parseInt("1") + '2';
        System.out.println(result3);   
        
        int result4 = ((false)?1:0) + ((true)?1:0) ;
        System.out.println(result4);   
        
        
        
        

    

        
    }
    
}
