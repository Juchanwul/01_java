package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    
    public static void main(String[] args) {
        
        // 난수 만들기
        // new Random().nextDouble()는 0부터 1사이의 실수값
        Random rand = new Random();
        double rand1 = rand.nextDouble();
        System.out.println(rand1);
        
        // 난수를 이용해서 0부터 2사이의 값을 만드시오.
        double rand3 = rand.nextDouble() * 2;
        System.out.println(rand3);
        
        // 문제. 난수를 이용해서 1부터 3사이의 값을 만드시오.
        double rand4 = (rand.nextDouble() * 2) + 1;
        System.out.println(rand4);
        System.out.println("------------------------------");
        
        // 문제. 0이상 10미만의 난수 5개를 생성해서 출력하시오.
        double[] temp = new double[5];
        for (int i = 0; i <= 4; i++) {
            temp[i] = (rand.nextDouble() * 10);
            System.out.println(temp[i]);
        }
        
        // 문제. 사용자로부터 최대 정수A와 최소 정수 B를 입력받는다.
        // 그리고 A와 B사이에 존재하는 난수 10개를 생성해서 출력하시오
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("시작숫자 : ");
        int first = keyboard.nextInt();
        
        System.out.print(" 끝 숫자 : ");
        int last = keyboard.nextInt();
        if (first >= last) {
            int[] random = new int[10];
            for (int i = 0; i <= random.length - 1; i++) {
                random[i] = (rand.nextInt(last - first)) + first;
                System.out.println(random[i]);
            }
                        
        }else {
            System.out.println("잘못된 입력입니다.");
        }
        
    }
    
}
