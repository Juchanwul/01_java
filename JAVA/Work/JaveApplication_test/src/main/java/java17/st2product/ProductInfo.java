package java17.st2product;

import java.util.Scanner;

public class ProductInfo {
    
    private static int s1;
    private static int s2;
    private static int s3;
    static Scanner     keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Product[] p = new Product[10];
        
        System.out.print("상품추가<1>, 모든 상품 조회<2>, 끝내기<3>>>>  ");
        s1 = keyboard.nextInt();
        First(s1);
        
    }
    
    private static void First(int nextInt) {
        if (s1 == 1) {
            System.out.print("상품종류 책<1>, 음악CD<2>, 회화책<3>>>> ");
            s2 = keyboard.nextInt();
            if (s2 == 1) {
                for (int i = 0;;i++){
                bookInsert(i);}
            } else if (s2 == 2) {
                CDInsert();
            } else if (s2 == 3) {
                CBInsert();
            }
            
        }
        
    }
    public static void bookInsert(int i) {
        for (i = 0;;i++){
        Book b1 = new Book();
        System.out.print("ISBN번호 : ");
        b1.setisbn(keyboard.nextInt());
        System.out.print("저자 : ");
        b1.setwriter(keyboard.next());
        System.out.print("책 제목 : ");
        b1.setTitle(keyboard.next());
        }
    }
    private static void CDInsert() {
        CompackDisc c1 = new CompackDisc();
        System.out.print("앨범제목 : ");
        c1.setAtitle(keyboard.next());
        System.out.print("가수 : ");
        c1.setSinger(keyboard.next());
    }
        
    private static void CBInsert() {
                 
            ConversationBook cb = new ConversationBook();
            System.out.print("언어 : ");
            cb.setLanguage(keyboard.next());

        }
    
    

}


