package java14.st11elec;

public class Com extends Elec {
    
    private String com = "";
    
    public Com() {
        super();
        System.out.println("Com()");
    }
    
    public Com(String com) {
        super();
        this.com = com;
        System.out.println("Com(String com)");
    }
    
    public Com(String elec, String com) {
        super(elec);
        this.com = com;
        System.out.println("Com(String elec, String com)");
    }
    
}
