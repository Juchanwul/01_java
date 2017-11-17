package java13.st5emp;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        
        System.out.println("정보를 입력하세요.");
        
        for (int i = 0; i <= employees.length - 1; i++) {
            employees[i] = new Employee();
            System.out.println("employees [" + (i + 1) + "]");
            System.out.print("name : ");
            employees[i].setName(keyboard.next());
            System.out.print("address : ");
            employees[i].setAddress(keyboard.next());
            System.out.print("salary : ");
            employees[i].setSalary(keyboard.nextInt());
            System.out.print("rrn : ");
            employees[i].setRrn(keyboard.next());
            System.out.println();
        }
        
        for (int i = 0; i <= employees.length - 1; i++) {            
            System.out.println(employees[i].toString());
        }
        
    }
    
}
