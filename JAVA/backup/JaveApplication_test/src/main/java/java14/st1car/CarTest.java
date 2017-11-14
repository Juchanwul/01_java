package java14.st1car;

public class CarTest {
    
    public static void main (String[]args){
        
        Car car1 = new Car();
        
        car1.setSpeed(60);
        car1.setGear(6);
        car1.setColor("pink");
        
        System.out.println(car1.toString());
        
    }
    
}
