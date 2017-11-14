package java19.st4phonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import java17.st2product.Product;

public class PhoneInfo {
    
    static Scanner             keyboard = new Scanner(System.in);
    static int                 num      = 1;
    static Map<Integer, Phone> p        = new HashMap<Integer, Phone>();
    
    public static void main(String[] args) {
        
        for (; true;) {
            System.out.println("선택하세요...");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.print("선택 : ");
            
            int s1 = keyboard.nextInt();
            if (s1 == 1) {
                System.out.println("1.일반, 2.대학, 3.회사");
                System.out.print("선택 >> ");
                
                int s2 = keyboard.nextInt();
                if (s2 == 1) {
                    데이터입력(p);
                } else if (s2 == 2) {
                    대학데이터입력(p);
                } else if (s2 == 3) {
                    회사데이터입력(p);
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else if (s1 == 2) {
                데이터검색(p);
            } else if (s1 == 3) {
                데이터삭제(p);
            } else if (s1 == 4) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        
    }
    
    private static void 회사데이터입력(Map<Integer, Phone> p) {
        
        PhoneUniv p2 = new PhoneUniv();
        
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        String i1 = keyboard.next();
        p2.setName(i1);
        System.out.print("전화번호 : ");
        String i2 = keyboard.next();
        p2.setPhonenumber(i2);
        System.out.print("전공 : ");
        String i3 = keyboard.next();
        p2.setMajor(i3);
        System.out.print("학년 : ");
        int i4 = keyboard.nextInt();
        p2.setYear(i4);
        
        p.put(num, p2);
        num += 1;
        System.out.println("데이터 입력이 완료되었습니다.");
        
    }
    
    private static void 대학데이터입력(Map<Integer, Phone> p2) {
        PhoneComp p3 = new PhoneComp();
        
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        String i1 = keyboard.next();
        p3.setName(i1);
        System.out.print("전화번호 : ");
        String i2 = keyboard.next();
        p3.setPhonenumber(i2);
        System.out.print("전화번호 : ");
        String i3 = keyboard.next();
        p3.setCompany(i3);
        
        p.put(num, p3);
        num += 1;
        System.out.println("데이터 입력이 완료되었습니다.");
        
    }
    
    private static void 데이터삭제(Map<Integer, Phone> p) {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("이름 : ");
        String remove = keyboard.next();
        for (Phone pp : p.values()) {
            if (pp.getName() == remove) {
                num = pp.hashCode();
                break;
            }
            
            p.remove(num);
        }
        
        System.out.println("데이터 삭제가 완료되었습니다.");
    }
    
    private static void 데이터검색(Map<Integer, Phone> p2) {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        String search = keyboard.next();
        for (Phone pp : p.values()) {
            if (pp.getName() == search) {
                num = pp.hashCode();
                break;
            }
            
        }
        if (p.containsKey(num)) {
            System.out.println(p.get(num));
        }
        
        System.out.println("데이터 검색을 완료되었습니다.");
    }
    
    private static void 데이터입력(Map<Integer, Phone> p2) {
        Phone p1 = new Phone();
        
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        String i1 = keyboard.next();
        p1.setName(i1);
        System.out.print("전화번호 : ");
        String i2 = keyboard.next();
        p1.setPhonenumber(i2);
        
        p.put(num, p1);
        num += 1;
        System.out.println("데이터 입력이 완료되었습니다.");
    }
    
}
