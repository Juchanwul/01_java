package java12.st3car;

public class CarTest {
    
    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        myCar.speedUp(100);
        myCar.speedPrint();
        
        System.out.print(myCar.toString());
        System.out.println(", numberOfCars = " + myCar.getNumberOfCars());
        
        Car yourCar = new Car();
        
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.print(yourCar.toString());
        System.out.println(", numberOfCars = " + yourCar.getNumberOfCars());
        
        Car otherCar = new Car("blue", 60, 3);
        System.out.print(otherCar.toString());
        System.out.println(", numberOfCars = " + otherCar.getNumberOfCars());
        
        // static이 있으면 값을 공유하게된다
        System.out.println("----------------------------------------");
        System.out.println("numberOfCars = " + myCar.getNumberOfCars());
        System.out.println("numberOfCars = " + yourCar.getNumberOfCars());
        System.out.println("numberOfCars = " + otherCar.getNumberOfCars());
    
        System.out.println("----------------------------------------");
        System.out.println(Car.getNumberOfCars());
        System.out.println(Car.numberOfCars);

    }
    
}
