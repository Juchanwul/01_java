package java12.st3car;

public class Car {
    
    // 필드
    private String     color        = "빨강";
    private int        speed        = 100;
    private int        gear         = 4;
    private int        carid        = 0;
    
    // static 필드 선언
    public static int numberOfCars = 0;
    
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    
    // 동작 : 메서드
    public void speedUp(int s) {
        this.speed = speed + s;
        
    }
    
    public void speedDown(int s) {
        speed = speed - s;
        
    }
    
    public void speedPrint() {
        System.out.println("속도 " + speed + "km");
    }
    
    // getter & setter
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getGear() {
        return gear;
    }
    
    public void setGear(int gear) {
        this.gear = gear;
    }
    
    // constructor
    
    public Car() {
        super();
        carid = ++numberOfCars;
    }
    
    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        carid = ++numberOfCars;
    }
    
    // toString()
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }
    
}