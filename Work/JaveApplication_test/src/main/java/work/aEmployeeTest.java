package work;

import java.util.Scanner;

public class aEmployeeTest {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        aEmployee[] employees = new aEmployee[3];
        
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println((i+1)+"번 직원의 정보를 입력하시오");
            employees[i] = new aEmployee();
            System.out.print("name : ");
            String name = keyboard.next();
            System.out.print("address : ");
            String address = keyboard.next();
            System.out.print("salary : ");
            int salary = keyboard.nextInt();
            System.out.print("rrn : ");
            String rrn = keyboard.next();
            
            employees[i].setName(name);;
            employees[i].setAddress(address);
            employees[i].setSalary(salary);
            employees[i].setRrn(rrn);
            
        }
        for (int i = 0; i <= employees.length - 1; i++) {
        System.out.println(employees[i].toString());
        }
    }
    
}
