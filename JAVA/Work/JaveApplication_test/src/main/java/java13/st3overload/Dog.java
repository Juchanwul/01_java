package java13.st3overload;

public class Dog {
    
    
    //오버로딩 : 하나의 클래스에서 같은 이름의 메서드를 사용
    //매개 변수의 개수, 타입, 순서로 구별
    
    public void sound() {
        System.out.println("sound");
    }
    
    public void sleep() {
        System.out.println("sleep");
    }
    
    public void sleep(int x) {
        System.out.println("sleep(int x)");
        
        
    }    
}
