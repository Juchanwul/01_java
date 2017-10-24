package java17.st1shape;

public class Triangle extends Shape {
    
    public int base;
    public int height;
    
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void draw() {
        System.out.println("Triangle Draw()");
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + ", toString()="
                + super.toString() + "]";
    }

    public Triangle() {
        super();
        
    }

    public Triangle(String color, int x, int y) {
        super(color, x, y);
        System.out.println("Triangle(String color, int x, int y)");
    }

    public Triangle(String color, int x, int y, int base, int height) {
        super(color, x, y);
        this.base = base;
        this.height = height;
        System.out.println("Triangle(String color, int x, int y, int base, int height)");
    }

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;
        System.out.println("Triangle(int base, int height)");
    }
    
    
    
}
