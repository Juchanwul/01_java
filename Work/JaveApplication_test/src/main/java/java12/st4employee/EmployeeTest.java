package java12.st4employee;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee("1", 100);
        Employee e2 = new Employee("2", 100);
        Employee e3 = new Employee("3", 100);
        
        System.out.println("현재 직원수 : " + Employee.getCount());
    }
    
}
