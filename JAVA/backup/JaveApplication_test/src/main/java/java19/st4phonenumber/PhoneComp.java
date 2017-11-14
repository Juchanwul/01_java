package java19.st4phonenumber;

public class PhoneComp extends Phone {
    
    public String company = "";

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "PhoneComp [company=" + company + ", toString()="
                + super.toString() + "]";
    }

    public PhoneComp() {
        super();
    }

    public PhoneComp(String name, String phonenumber, String birthday) {
        super(name, phonenumber, birthday);
    }
    
}
