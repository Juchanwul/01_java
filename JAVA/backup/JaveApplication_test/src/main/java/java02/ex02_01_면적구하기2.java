package java02;

import java.util.Scanner;

public class ex02_01_면적구하기2 {
    

    public static void main (String [] args) {
        
        Scanner keyboard = new Scanner(System.in);  //입력창 위쪽에 있으면된다

        System.out.print("가로를 입력하십시오: ");
        int w = keyboard.nextInt();
        
        System.out.print("세로를 입력하십시오: ");
        int h = keyboard.nextInt();
        
        
        keyboard.close();  //키보드 닫아주기
        
        
        int area = w * h ;
        int perimeter = 2 * ( w + h ) ;

        System.out.println("사각형의 넓이: " + area);
        System.out.println("사각형의 둘레: " + perimeter);
        
        
        System.out.print("\n");
        
        String aaa = "사각형의 ";
        String bbb = "넓이: " ;
        String ccc = "둘레: " ;
        
        System.out.println(aaa + bbb + area);
        System.out.println(aaa + ccc + perimeter);
        

        
    }
    
}
