package java13.st2methodtype;

public abstract class MethodTypeTest {
    
    public static void main(String[] args) {
        
        MethodType m = new MethodType();
        
        //인스턴스 메서드 호출
        //인스턴스이름 . 메서드이름;
        
        m.instanceMethod();
        
        
        //static 메서드 호출
        //클래스이름 . 메서드이름
        
        MethodType.staticMethod();
        
        m.staticMethod(); //이방법은 사용하지 않는다
        
        
       
    }
    
}
