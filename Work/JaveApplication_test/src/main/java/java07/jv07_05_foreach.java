package java07;

public class jv07_05_foreach {
    
    public static void main(String[]args){
        
        //배열 선언과 초기화
        int [] numbers = {10,20,30};
        
        //for 문을 사용하여 배열의 값 출력
        for(int j= 0; j<=numbers.length-1; j++){
            System.out.println(numbers[j]);
        }
        
        //foreach를 이용하여 배열값을 출력
        for(int value : numbers){
            System.out.println(value);
        }
        
    }
    
}
