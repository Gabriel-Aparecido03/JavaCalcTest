package javaTestCacl;

public class JavaTestMain {
	
	public static void main(String [] args) {
		Calculadora calc = new Calculadora();
        
        // TESTE DE ADIÇÃO
        
        // Cénario 1: Somando dois números inteiros positivos
        int result = calc.somar(1,2);
        System.out.println(result);
        
        // Cénario 2: Somando um número positivo e outro negativo
        result = calc.somar(-1,2);
        System.out.println(result);
        
        // Cénario 3: Somando dois números inteiros negativos
        result = calc.somar(-1,-2);
        System.out.println(result);
        
        // Cénario 4: Somando um número positivo com zero
        result = calc.somar(1,0);
        System.out.println(result);
        
        // Cénario 5: Somando um número negativo com zero
        result = calc.somar(-1,0);
        System.out.println(result);
        
        // TESTE DE SUBTRAÇÃO
        
        // Cénario 1: Subtraindo dois números inteiros positivos
        int resultSubtracao = calc.subtrair(1,2);
        System.out.println(resultSubtracao);
        
        // Cénario 2: Subtraindo um número positivo e outro negativo
        resultSubtracao = calc.subtrair(1,-2);
        System.out.println(resultSubtracao);
        
        // Cénario 3: Subtraindo dois números inteiros negativos
        resultSubtracao = calc.subtrair(-1,-2);
        System.out.println(resultSubtracao);
        
        // Cénario 4: Subtraindo um número positivo com zero
        resultSubtracao = calc.subtrair(1,0);
        System.out.println(resultSubtracao);
        
        // Cénario 5: Subtraindo um número negativo com zero
        resultSubtracao = calc.subtrair(-1,0);
        System.out.println(resultSubtracao);
        
        // TESTE DE MULTIPLICAÇÃO
        
        // Cénario 1: Multiplicando dois números inteiros positivos
        int resultMult = calc.multiplicar(1,2);
        System.out.println(resultMult);
        
        // Cénario 2: Muliplicando um número positivo e outro negativo
        resultMult = calc.multiplicar(1,-2);
        System.out.println(resultMult);
        
        // Cénario 3: Multiplicando dois números inteiros negativos
        resultMult = calc.multiplicar(-1,-2);
        System.out.println(resultMult);
        
        // Cénario 4: Multiplicando um número positivo com zero
        resultMult = calc.multiplicar(1,0);
        System.out.println(resultMult);
        
        // TESTE DE DIVISÃO
        
        // Cénario 1: Dividindo dois números inteiros positivos
        float resultDiv = calc.divisao(4,2);
        System.out.println(resultDiv);
        
        // Cénario 2: Dividindo um número positivo e outro negativo
        resultDiv = calc.divisao(4,-2);
        System.out.println(resultDiv);
        
        // Cénario 3: Dividindo dois números inteiros negativos
        resultDiv = calc.divisao(-4,-2);
        System.out.println(resultDiv);
        
        // Cénario 4: Dividindo um número com zero -> Irá boltar um erro - O denominador n�o pode ser igual a zero.
        resultDiv = calc.divisao(4,0);
        System.out.println(resultDiv);

	}
}
