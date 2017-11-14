package java14.st11elec;

public class Tv extends Elec {
    
    private String tv = "";
    
    public Tv() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Tv()");
    }
    
    public Tv(String elec) {
        super(elec);
        // TODO Auto-generated constructor stub
        System.out.println("Tv(String elec)");
    }
    
    public Tv(String elec, String tv) {
        super(elec);
        this.tv = tv;
        System.out.println("Tv(String elec, String tv)");
    }
    
}
