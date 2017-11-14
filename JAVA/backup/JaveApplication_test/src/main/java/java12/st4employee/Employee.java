package java12.st4employee;

public class Employee {
    
    private String     name;
    private double     salary      = 0;
    private static int count       = 0;
    private static int employcount = 0;
    
    public Employee(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
        employcount = count++;
    }
    
    public static int Count = 0;
    
    public static int getCount() {
        return count;
    }
    
}
