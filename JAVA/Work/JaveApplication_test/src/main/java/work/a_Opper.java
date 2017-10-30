package work;

public class a_Opper {
    
    public int a   = 0;
    public int b   = 0;
    public int val = 0;
    
    public void Add() {
        
        val = a + b;
        System.out.println("Add : " + val);
    }
    
    public void Minus() {
        val = a - b;
        System.out.println("Minus : " + val);
    }
    
    public void Mul() {
        val = a * b;
        System.out.println("Mul : " + val);
        
    }
    
    public void Div() {
        
        double val = (double) a / b;
        System.out.printf("Div : %6f" , val);
        
    }
    
    public a_Opper() {
        super();
    }
    
    public a_Opper(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
}
