package java16.st3다중상속;

public class Rectangle extends Shape implements Drawable {
    
    public int w, h;
    
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle [w=" + w + ", h=" + h + ", x=" + x + ", y=" + y
                + ", toString()=" + super.toString() + "]";
    }

    public Rectangle() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

    public Rectangle(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }
    
    
    
    
}
