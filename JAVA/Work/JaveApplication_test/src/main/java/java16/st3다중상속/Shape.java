package java16.st3다중상속;

public class Shape {
    
    protected int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape [x=" + x + ", y=" + y + "]";
    }

    public Shape(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Shape() {
        super();
    }
    
    
    
}
