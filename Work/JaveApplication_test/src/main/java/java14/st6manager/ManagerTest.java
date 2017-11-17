package java14.st6manager;

public class ManagerTest {
    
    public static void main(String[] args) {
      
        //Manager 인스턴스 m1을 생성하고 test() 메서드를 호출.
        
        Manager m1 = new Manager("강다니엘", "압구정", 100000000, "940101");
        
        //protected를 사용하면
        //m1.setSalary (1000000);
        //m1.salary  = 1000000; ---- 가능

        m1.test();
        
    }
    
}
