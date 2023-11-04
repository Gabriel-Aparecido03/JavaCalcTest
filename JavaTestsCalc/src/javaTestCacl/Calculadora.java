package javaTestCacl;
/**
 * A simple class for basic arithmetic operations like addition, subtraction, multiplication, and division.
 */
public class Calculadora {
	 /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of the addition operation.
     */
	public int somar(int a,int b) {
        return a + b;
    }
	
	/**
     * Subtracts one integer from another.
     *
     * @param a The integer to subtract from.
     * @param b The integer to subtract.
     * @return The result of the subtraction operation.
     */
    public int subtrair(int a ,int b) {
        return a - b;
    }
    
    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of the multiplication operation.
     */
    public int multiplicar(int a ,int b) {
        return a * b;
    }
    
    /**
     * Divides one integer by another.
     *
     * @param a The numerator (dividend).
     * @param b The denominator (divisor).
     * @return The result of the division operation.
     * @throws IllegalArgumentException if the denominator is zero.
     */
    public float  divisao(int a ,int b) {
        if(b == 0) {
            throw new IllegalArgumentException("O denominador não pode ser igual a zero.");
        }
        float div = a / b;
        return div;
        
    }
}
