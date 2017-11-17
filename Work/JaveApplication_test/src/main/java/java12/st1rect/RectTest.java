package java12.st1rect;

import java.util.Scanner;

public class RectTest {
    
    public static void main(String[] args) {
        
        Rect square = new Rect();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("가로 : ");
        square.setW(keyboard.nextInt());
        System.out.print("세로 : ");
        square.setH(keyboard.nextInt());
        
        square.getResult();
        
    }
    
}
