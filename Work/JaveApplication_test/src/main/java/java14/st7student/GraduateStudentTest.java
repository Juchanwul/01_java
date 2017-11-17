package java14.st7student;

public class GraduateStudentTest {

    public static void main (String[] args){
        
        GraduateStudent s1 = new GraduateStudent();
        s1.setNumber(1);
        s1.setName("이현수");
        s1.setPhone("010");
        s1.setLab("SBS");
        
        GraduateStudent s2 = new GraduateStudent();
        GraduateStudent s3 = new GraduateStudent(3,"박정우", "012","enter");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        
    }
}
