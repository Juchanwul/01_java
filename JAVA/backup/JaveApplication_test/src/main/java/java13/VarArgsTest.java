package java13;

public class VarArgsTest {
    
    public static void main (String[]args){
        
        VarArgs c = new VarArgs();
        
        c.sub(1);
        c.sub(2,3,4,5,6);
        c.sub();
        
        
    }
    
}
