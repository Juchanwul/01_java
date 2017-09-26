package java07;

public class jv07_01_array {
    
    public static void main (String[]args){
        
        //변수 5개 선언
        int score1 = 1, score2 = 2, score3 = 3, score4 = 4, score5 = 5;
        
        
        //배열을 이용한 변수 5개 선언
        int [] score = new int[5];   //아파트 만들었다.
        score[0] = 0;  //score 아파트 0층에 0을 넣는다.
        score[1] = 1;  //           ''
        score[2] = 2;
        score[3] = 3;
        score[4] = 4;
        
        
        //score 1의 값을 출력
        System.out.println("score 1 : "+score1);
        
        //score 0층의 값을 출력
        System.out.println("score[0] : "+score[0]);
        
        
        
    }
    
}
