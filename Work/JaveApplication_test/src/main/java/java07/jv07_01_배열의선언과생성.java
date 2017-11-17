package java07;

public class jv07_01_배열의선언과생성 {
    
    public static void main (String[]args){
        
        int [] numbers = new int[6];
        
        int size = 6;
        int [] numbers1 = new int[size];
        numbers1[0] = 0;
        numbers1[1] = 1;
        numbers1[2] = 2;
        numbers1[3] = 3;
        numbers1[4] = 4;
        numbers1[5] = 5;
        
        for(int j = 0; j<numbers1.length; j++){
            System.out.println(numbers1[j]);
        }
        
        
    }
    
}
