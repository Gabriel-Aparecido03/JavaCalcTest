package javaTestCacl;

public class Calculadora {
	public int somar(int a,int b) {
        return a + b;
    }
    
    public int subtrair(int a ,int b) {
        return a - b;
    }
    
    public int multiplicar(int a ,int b) {
        return a * b;
    }
    
    public float  divisao(int a ,int b) {
        if(b == 0) {
            throw new IllegalArgumentException("O denominador não pode ser igual a zero.");
        }
        float div = a / b;
        return div;
        
    }
}
