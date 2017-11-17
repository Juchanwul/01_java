package java19.st4phonenumber;

public class PhoneUniv extends Phone {
    
    public String major = "";
    public int    year  = 0;
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "PhoneUniv [major=" + major + ", year=" + year + ", toString()="
                + super.toString() + "]";
    }
    
    public PhoneUniv() {
        super();
    }
    
    public PhoneUniv(String name, String phonenumber, String birthday) {
        super(name, phonenumber, birthday);
    }
    
}
