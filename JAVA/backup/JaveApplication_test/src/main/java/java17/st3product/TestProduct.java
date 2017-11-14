package java17.st3product;

import java.util.Scanner;

public class TestProduct {
    
    static Scanner keyboard = new Scanner(System.in);
    static int     prod     = 0;
    
    public static void main(String[] args) {
        
        Product[] p = new Product[10];
        
        for (; true;) {
            System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >>>> ");
            int m1 = keyboard.nextInt();
            if (m1 == 1) {
                상품입력(p);
            } else if (m1 == 2) {
                상품조회(p);
            } else if (m1 == 3) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
                
            }
            
        }
    }
    
    private static void 상품조회(Product[] p) {
        for (int i = 0; i <= p.length - 1; i++) {
            System.out.println(p[i].toString());
        }
        
    }
    
    private static void 상품입력(Product[] p) {
        System.out.print("상품 종류 : 책<1>, 음악CD<2>, 회화책<3> >>>> ");
        int m2 = keyboard.nextInt();
        if (prod == p.length) {
            System.out.println("더이상 상품을 추가할 수 없습니다.");
        } else if (m2 == 1) {
            Book b1 = new Book();
            System.out.print("상품 설명 >> ");
            String i1 = keyboard.next();
            b1.setInfo(i1);
            System.out.print("생산자 >> ");
            String i2 = keyboard.next();
            b1.setProducer(i2);
            System.out.print("가격정보 >> ");
            int i3 = keyboard.nextInt();
            b1.setPrice(i3);
            System.out.print("ISBN 번호 >> ");
            int i4 = keyboard.nextInt();
            b1.setIsbn(i4);
            System.out.print("저자 >> ");
            String i5 = keyboard.next();
            b1.setAuth(i5);
            System.out.print("책제목 정보 >> ");
            String i6 = keyboard.next();
            b1.setBtitle(i6);
            p[prod] = b1;
            prod += 1;
            
        } else if (m2 == 2) {
            CompackDisk c1 = new CompackDisk();
            System.out.print("상품 설명 >> ");
            String i1 = keyboard.next();
            c1.setInfo(i1);
            System.out.print("생산자 >> ");
            String i2 = keyboard.next();
            c1.setProducer(i2);
            System.out.print("가격정보 >> ");
            int i3 = keyboard.nextInt();
            c1.setPrice(i3);
            System.out.print("앨범 제목 >> ");
            String i4 = keyboard.next();
            c1.setAtitle(i4);
            System.out.print("가수 >> ");
            String i5 = keyboard.next();
            c1.setSinger(i5);
            p[prod] = c1;
            prod += 1;
            
        } else if (m2 == 3) {
            ConversationBook cb1 = new ConversationBook();
            System.out.print("상품 설명 >> ");
            String i1 = keyboard.next();
            cb1.setInfo(i1);
            System.out.print("생산자 >> ");
            String i2 = keyboard.next();
            cb1.setProducer(i2);
            System.out.print("가격정보 >> ");
            int i3 = keyboard.nextInt();
            cb1.setPrice(i3);
            System.out.print("언어 >> ");
            String i4 = keyboard.next();
            cb1.setLang(i4);
            p[prod] = cb1;
            prod += 1;
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        
    }
    
}
