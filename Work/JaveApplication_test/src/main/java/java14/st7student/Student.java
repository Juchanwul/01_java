package java14.st7student;

public class Student {

    private int number = 2;
    public String name = "온정선";
    protected String phone = "011";
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Student [number=" + number + ", name=" + name + ", phone="
                + phone + "]";
    }
    public Student(int number, String name, String phone) {
        super();
        this.number = number;
        this.name = name;
        this.phone = phone;
    }
    public Student() {
        super();
    }

    
        
    
}
