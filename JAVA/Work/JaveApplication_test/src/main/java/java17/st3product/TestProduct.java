package java17.st3product;

import java.util.Scanner;

public class TestProduct {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        Product[] p = new Product[10];
        
        for (; true;) {
            System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >>>> ");
            int m1 = keyboard.nextInt();
            if (m1 == 1) {
                상품입력(p);
            }
            else if(m1==2){
                상품조회(p);
            }
            else if(m1==3){
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
                    
                
            }
            
        }
    }

    private static void 상품조회(Product[] p) {
        for(int i = 0; i<= p.length-1;i++){
            System.out.println(p[i].toString());
        }
        
    }

    private static void 상품입력(Product[] p) {
        System.out.print("상품 종류 : 책<1>, 음악CD<2>, 회화책<3> >>>> ");
        int m2 = keyboard.nextInt();
        if(m2==1){
            Book b1 = new Book();
            System.out.print("상품 설명 >> ");
            
            System.out.print("생산자 >> ");
            
            System.out.print("가격정보 >> ");
            
            System.out.print("ISBN 번호 >> ");
            
            System.out.print("저자 >> ");
            
            System.out.print("책제목 정보 >> ");
            
            
        }
        
    }
    
}
