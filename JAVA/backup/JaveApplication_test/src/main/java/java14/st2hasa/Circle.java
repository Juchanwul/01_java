package java14.st2hasa;

public class Circle {
    
    private int radious = 0;
    private Point center ;
    
    
    
    
    
    public int getRadious() {
        return radious;
    }
    public void setRadious(int radious) {
        this.radious = radious;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public Circle(int radious, Point center) {
        super();
        this.radious = radious;
        this.center = center;
    }
    public Circle() {
        super();
    }
    @Override
    public String toString() {
        return "Circle [radious=" + radious + ", center=" + center + "]";
    }
    
    
    
     
        
    
    
}
