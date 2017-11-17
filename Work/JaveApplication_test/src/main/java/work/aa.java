package work;

import java.util.Scanner;

public class aa {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        for (; true;) {
            System.out.print("문자 하나를 입력하세요 : ");
            String a = keyboard.next();
            char c = a.charAt(0);
            if (c >= '0' && c <= '9') {
                System.out.println("입력하신 문자는 숫자입니다.\n");
            }
            
            else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                System.out.println("입력하신 문자는 영문자입니다.\n");
            } else {
                System.out.println("잘못된 입력입니다.");
                break;
            }
        }
    }
}
