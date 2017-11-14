package java13.st5emp;

import java.util.Scanner;

public class EmployeeTest2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        String name = "";
        String address = "";
        int salary = 0;
        String rrn = "";
        
        System.out.println("정보를 입력하세요.");
        
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println("employees [" + (i + 1) + "]");
            
            System.out.print("name : ");
            name = keyboard.next();
            
            System.out.print("address : ");
            address = keyboard.next();
            
            System.out.print("salary : ");
            salary = keyboard.nextInt();
            
            System.out.print("rrn : ");
            rrn = keyboard.next();
            
            System.out.println();
            
            employees[i] = new Employee(name, address, salary, rrn);
        }
        
        for ( Employee emp : employees) {
            System.out.println(emp.toString());
        }
        
    }
    
}
