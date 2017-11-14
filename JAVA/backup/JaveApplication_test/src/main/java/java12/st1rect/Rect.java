package java12.st1rect;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Rect {
    
    private int w = 0;
    private int h = 0;
    
    public double getArea() {        
        double area = w * h;        
        return area;
    }
    
    public double getParameter() {
        double parameter = (double) 2 * (w + h);
        return parameter;
    }
    
    public void getResult() {
        double area = getArea();
        double parameter = getParameter();
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + parameter);
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
    
    public Rect() {
        super();
    }
    
    
    
    @Override
    public String toString() {
        return "Rect [w=" + w + ", h=" + h + "]";
    }
    
}
