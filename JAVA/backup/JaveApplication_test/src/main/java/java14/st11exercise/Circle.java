package java14.st11exercise;

public class Circle extends Shape{
    
    private int radious = 0;

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    @Override
    public String toString() {
        return "Circle [radious=" + radious + ", color=" + color + ", pt=" + pt
                + ", toString()=" + super.toString() + "]";
    }

    public Circle() {
        super();
        System.out.println("Circle()");
    }
    

    public Circle(int radious) {
        super();
        this.radious = radious;
        System.out.println("Circle(int radious)");
    }
    

    public Circle(String color, Point pt) {
        super(color, pt);
        System.out.println("Circle(String color, Point pt)");
    }

    public Circle(String color, Point pt, int radious) {
        super(color, pt);
        this.radious = radious;
        System.out.println("Circle(String color, Point pt, int radious)");
    }
    
    
    
    
    
}
