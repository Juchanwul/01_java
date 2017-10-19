package java14.st11elec;

public class Desktop extends Com{
    
    private String desktop = "";

    public Desktop() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Desktop()");
    }

    public Desktop(String elec, String com) {
        super(elec, com);
        // TODO Auto-generated constructor stub
        System.out.println("Desktop(String elec, String com)");
    }

    public Desktop(String com) {
        super(com);
        // TODO Auto-generated constructor stub
        System.out.println("Desktop(String com)");
    }

    public Desktop(String elec, String com, String desktop) {
        super(elec, com);
        this.desktop = desktop;
        System.out.println("Desktop(String elec, String com, String desktop)");
    }


    
}
