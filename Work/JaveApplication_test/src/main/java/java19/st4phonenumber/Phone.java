package java19.st4phonenumber;

public class Phone {
    
    private String name        = "";
    private String phonenumber = "";
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    @Override
    public String toString() {
        String s = ("name : "+name+"\n"+"phone : "+phonenumber);
        return s;
    }
    public Phone(String name, String phonenumber, String birthday) {
        super();
        this.name = name;
        this.phonenumber = phonenumber;
        
    }
    public Phone() {
        super();
    }
    
    
}
