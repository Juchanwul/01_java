package java14.st11exercise;

public class Rectangle extends Shape {
    
    private int width = 0;
    private int height = 0;
    
    
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
                + color + ", pt=" + pt + ", toString()=" + super.toString()
                + "]";
    }
    public Rectangle() {
        super();
        System.out.println("Rectangle()");
    }
    
    
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(int width, int height)");
    }
    
    public Rectangle(String color, Point pt) {
        super(color, pt);
        System.out.println("Rectangle(String color, Point pt)");
    }
    public Rectangle(String color, Point pt, int width, int height) {
        super(color, pt);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(String color, Point pt, int width, int height)");
    }
    
    
    
    
}
