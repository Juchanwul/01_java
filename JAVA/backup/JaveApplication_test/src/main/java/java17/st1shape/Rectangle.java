package java17.st1shape;

public class Rectangle extends Shape {
    
    public int width;
    public int height;
    
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void draw() {
        System.out.println("Rectangle Draw()");
        
    }
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + ", toString()="
                + super.toString() + "]";
    }
    public Rectangle() {
        super();
        
    }
    public Rectangle(String color, int x, int y) {
        super(color, x, y);
        System.out.println("Rectangle(String color, int x, int y)");
    }
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(int width, int height)");
    }
    public Rectangle(String color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(String color, int x, int y, int width, int height)");
    }
    
    
    
    
    
}
