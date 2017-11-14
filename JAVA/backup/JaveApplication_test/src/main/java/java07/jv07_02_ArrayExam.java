package java07;

public class jv07_02_ArrayExam {
    
    public static void main(String[]args){
        
        int size = 6;
        int [] numbers = new int[size];
        
        for(int i = 0; i<=numbers.length-1 ; i++){
            numbers[i] = i;
            
            
        }
        
        for (int i = 0; i<=numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        
    }
    
}
