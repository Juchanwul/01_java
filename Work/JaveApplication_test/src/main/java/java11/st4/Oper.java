package java11.st4;

import java.util.Scanner;

public class Oper {
    
    private int n1 = 0;
    private int n2 = 0;
    
    public int Add() {
        int add = n1 + n2;
        
        return add;
        
    }
    
    public int Minus() {
        int minus = n1 - n2;
        
        return minus;
        
    }
    
    public int Mul() {
        int mul = n1 * n2;
        return mul;
    }
    
    public double Div() {
        double div = (double) n1 / n2;
        return div;
    }
    
    public int getN1() {
        return n1;
    }
    
    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public int getN2() {
        return n2;
    }
    
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public Oper(int n1, int n2) {
        super();
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public Oper() {
        super();
    }
    
    @Override
    public String toString() {
        return "Oper [n1=" + n1 + ", n2=" + n2 + "]";
    }
    
    public void printResult() {
        int a = Add();
        int m1 = Minus();
        int m2 = Mul();
        double d = Div();
        System.out.println("Add : " + a);
        System.out.println("Minus : " + m1);
        System.out.println("Mul : " + m2);
        System.out.printf("Div : %.6f",d);
    }
    
}
