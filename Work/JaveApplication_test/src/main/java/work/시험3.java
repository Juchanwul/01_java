package work;

import java.util.*;

public class 시험3 {
    
    public static void main(String[] args) {
        
        List<Integer> list = null;
        list = new ArrayList<>();
        int sum = 0;
        
        Scanner keyboard = new Scanner(System.in);
        int temp = 0;
        
        System.out.print("학생수를 입력하시오 : ");
        int num = keyboard.nextInt();
        
        for (int i = 0; i <= num - 1; i++) {
            System.out.print("성적을 입력하시오 : ");
            temp = keyboard.nextInt();
            list.add(temp);
        }
        
        for (int i = 0; i <= list.size() - 1; i++) {
            sum = list.get(i) + sum;
            
        }
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + sum / list.size());
        
    }
    
}
