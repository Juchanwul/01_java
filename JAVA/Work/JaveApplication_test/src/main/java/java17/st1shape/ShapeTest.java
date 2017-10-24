package java17.st1shape;

public class ShapeTest {
    
    public static void main(String[] args) {
                
        Circle c = new Circle();
        c.draw();
        
        Rectangle r = new Rectangle();
        r.draw();
        
        Triangle t = new Triangle();
        t.draw();
        
        //질문
        Shape s = new Rectangle();
        s.draw(); // Shape Draw()?? 아니면 Rectangle Draw??
        
        
        
    }
    
}
