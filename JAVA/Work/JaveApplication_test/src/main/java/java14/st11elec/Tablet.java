package java14.st11elec;

public class Tablet extends Com{
    
    private String tablet = "";

    public Tablet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Tablet()");
    }

    public Tablet(String elec, String com) {
        super(elec, com);
        // TODO Auto-generated constructor stub
        System.out.println("Tablet(String elec, String com)");
    }

    public Tablet(String com) {
        super(com);
        // TODO Auto-generated constructor stub
        System.out.println("Tablet(String com)");
    }

    public Tablet(String elec, String com, String tablet) {
        super(elec, com);
        this.tablet = tablet;
        System.out.println("Tablet(String elec, String com, String tablet)");
    }
    
    
    
}
