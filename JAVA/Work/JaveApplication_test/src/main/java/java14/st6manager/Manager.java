package java14.st6manager;

public class Manager extends Employee {
    
    private int bounus = 0;
    
    public void test() {
        String info = "name " + super.getName();
        info = info + ", address " + super.getAddress();
        info = info + ", salary " + super.salary;
        info = info + ", rrn" + super.getRrn();
        System.out.println(info);
        
    }
    
    public int getBounus() {
        return bounus;
    }
    
    public void setBounus(int bounus) {
        this.bounus = bounus;
    }
    
    @Override
    public String toString() {
        return "Manager [bounus=" + bounus + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }
    
    public Manager() {
        super();
    }
    
    public Manager(int bounus) {
        super();
        this.bounus = bounus;
    }

    public Manager(String name, String address, int salary, String rrn) {
        super(name, address, salary, rrn);
        // TODO Auto-generated constructor stub
    }

    
}
