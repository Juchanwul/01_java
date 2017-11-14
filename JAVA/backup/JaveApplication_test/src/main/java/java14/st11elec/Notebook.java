package java14.st11elec;

public class Notebook extends Com{
    
    private String notebook = "";

    public Notebook() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Notebook()");
    }

    public Notebook(String elec, String com) {
        super(elec, com);
        // TODO Auto-generated constructor stub
        System.out.println("Notebook(String elec, String com)");
    }

    public Notebook(String com) {
        super(com);
        // TODO Auto-generated constructor stub
        System.out.println("Notebook(String com)");
    }

    public Notebook(String elec, String com, String notebook) {
        super(elec, com);
        this.notebook = notebook;
        System.out.println("Notebook(String elec, String com, String notebook)");
    }
    
    
    
    
    
    
}
