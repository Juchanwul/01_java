package java14.st8animal;

public class Dog extends Animal {
    
    public void bark() {
        System.out.println("bark()");
    }
    
    @Override
    public void eat() {
        System.out.println("코로 먹는다.");
    }
    
    public void eat(String food) {
        System.out.println("코로 먹는다.");
    }
    //public int eat() { -----변수타입은 메서드 구분하지못함 
    //                        Strint eat() == int eat()
    //    return 0;
    //}
    
}
