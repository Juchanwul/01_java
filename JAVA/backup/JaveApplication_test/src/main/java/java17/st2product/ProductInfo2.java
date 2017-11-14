package java17.st2product;

import java.util.Scanner;

public class ProductInfo2 {
    static Scanner keyboard = new Scanner(System.in);
    static int     roomid   = 0;
    
    public static void main(String[] args) {
        
        Product[] prods = new Product[10];
        
        for (; true;) {            
            // 상품 추가 메뉴 출력
            System.out.print("상품추가(1), 상품조회(2), 종료(3) : ");
            int action = keyboard.nextInt();
            if (action == 1) { // 상품입력
                상품입력(prods);                
            } else if (action == 2) { // 상품출력
                상품출력(prods);                
            } else if (action == 3) {
                break;
            } else {
                System.out.println("잘못된 입력");                
            }
            
        }
        // 출력
        
        
    }
    
    private static void 상품출력(Product[] prods) {
        for (int i = 0; i <= prods.length - 1; i++) {
            System.out.println(prods[i].toString());
        }
        
    }
    
    private static void 상품입력(Product[] prods) {
        // 상품종류 입력 받는 코드 추가.
        System.out.print("책(1), 음악CD(2), 회화책(3) : ");
        int menu2 = keyboard.nextInt();
        
        if (menu2 == 1) {
            Book b1 = new Book();
            System.out.print("상품 설명 : ");
            b1.setProd(keyboard.next());
            System.out.print("생산자 : ");
            b1.setProducer(keyboard.next());
            System.out.print("가격 : ");
            b1.setPrice(keyboard.nextInt());
            System.out.print("ISBN번호 : ");
            b1.setisbn(keyboard.nextInt());
            System.out.print("저자 : ");
            b1.setwriter(keyboard.next());
            System.out.print("책 제목 : ");
            b1.setTitle(keyboard.next());
            
            prods[roomid] = b1;
            roomid = roomid+1;
            
        } else if (menu2 == 2) {
            
            CompackDisc cd = new CompackDisc();
            System.out.print("상품 설명 : ");
            cd.setProd(keyboard.next());
            System.out.print("생산자 : ");
            cd.setProducer(keyboard.next());
            System.out.print("가격 : ");
            cd.setPrice(keyboard.nextInt());
            System.out.print("앨범제목 : ");
            cd.setAtitle(keyboard.next());
            System.out.print("가수 : ");
            cd.setSinger(keyboard.next());
            
            prods[roomid] = cd;
            roomid = roomid+1;
            
        } else if (menu2 == 3) {
            
            ConversationBook cb = new ConversationBook();
            System.out.print("상품 설명 : ");
            cb.setProd(keyboard.next());
            System.out.print("생산자 : ");
            cb.setProducer(keyboard.next());
            System.out.print("가격 : ");
            cb.setPrice(keyboard.nextInt());
            System.out.print("ISBN번호 : ");
            cb.setisbn(keyboard.nextInt());
            System.out.print("저자 : ");
            cb.setwriter(keyboard.next());
            System.out.print("책 제목 : ");
            cb.setTitle(keyboard.next());
            System.out.print("언어 : ");
            cb.setLanguage(keyboard.next());
            
            prods[roomid] = cb;
            roomid =roomid+1;
            
        } else {
            System.out.println("잘못된 입력");
            
        }
        
    }
}
