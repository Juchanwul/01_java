package java17.st1shape;

public class Circle extends Shape {
    
    public int radius;
    
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void draw() {
        System.out.println("Circle Draw()");
        
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", x=" + x
                + ", y=" + y + ", toString()=" + super.toString() + "]";
    }

    public Circle() {
        super();
        
    }

    public Circle(String color, int x, int y) {
        super(color, x, y);
        System.out.println("Circle(String color, int x, int y)");
    }

    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
        System.out.println("Circle(String color, int x, int y, int radius)");
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
        System.out.println("Circle(int radius)");
    }
    
    
    
}
