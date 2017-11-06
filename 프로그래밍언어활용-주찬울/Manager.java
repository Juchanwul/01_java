package 주찬울;

public class Manager extends Employee {
    
    private int bounus = 0;
    
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
    
    public Manager(String name, String addr, int salary, String rrn,
            int bounus) {
        super(name, addr, salary, rrn);
        this.bounus = bounus;
    }
    
}
