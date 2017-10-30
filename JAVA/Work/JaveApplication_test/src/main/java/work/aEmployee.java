package work;

public class aEmployee {
    
    String name = "";
    String address = "";
    int salary = 0;
    String rrn = "";
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getRrn() {
        return rrn;
    }
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    @Override
    public String toString() {
        return "a_Employee [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    public aEmployee(String name, String address, int salary, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }
    public aEmployee() {
        super();
    }
    
    
    
}
