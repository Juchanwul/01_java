package 주찬울;

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        Employee[] employees = new Employee[3];
        for (int i = 0; i <= employees.length - 1; i++) {
            employees[i] = new Employee();
            System.out.print("이름을 입력하세요 : ");
            String name = keyboard.next();
            employees[i].setName(name);
            System.out.print("주소를 입력하세요 : ");
            String addr = keyboard.next();
            employees[i].setAddr(addr);
            System.out.print("월급을 입력하세요 : ");
            int salary = keyboard.nextInt();
            employees[i].setSalary(salary);
            System.out.print("주민번호를 입력하세요 : ");
            String rrn = keyboard.next();
            employees[i].setRrn(rrn);            
        }
        
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(employees[i].toString());
        }
    }
    
}
