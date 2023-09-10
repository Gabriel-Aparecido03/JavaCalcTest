package javaTestCacl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JavaCalcTestUnit {
	
	
	// Ao somar dois numeros positivos esperar outro numero positivo
	@Test
    public void SomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,1);
        
        assertEquals(2,soma);
    }
    
	// Ao somar um numero positivo com um numero negativo ,igual espera 0 
    @Test
    public void SomarUmNumeroPositivoEOutroNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,-1);
        
        assertEquals(0,soma);
    }
    
 // Ao somar um numero negativo com um numero negativo ,espera um numero negativo
    @Test
    public void SomarDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-1,-1);
        
        assertEquals(-2,soma);
    }
    
 // Ao somar um numero positivo com zero ,espera o numero positivo
    @Test
    public void SomarNumeroPositivoComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,0);
        
        assertEquals(1,soma);
    }
    
    // Ao somar um numero negativo com zero ,espera o numero negativo
    @Test
    public void SomarNumeroNegativosComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-1,0);
        
        assertEquals(-1,soma);
    }
    
    // SUBTRAÇÃO
    
 // Ao subtrair um numero positivo com outro positivo ,espera o numero positivo
    @Test
    public void SubtrairDoisNumeroPositivos() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(2,1);
        
        assertEquals(1,sub);
    }
    
    // Ao subtrair um numero negativo com outro negativo ,espera o numero negativo
    @Test
    public void SubtrairDoisNumeroNegativos() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,-1);
        
        assertEquals(-1,sub);
    }
    
    // Ao subtrair um numero negativo com outro postivo ,espera o numero negativo
    @Test
    public void SubtrairNumeroNegativoComNumeroPositivo() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,1);
        
        assertEquals(-3,sub);
    }
    
    // Ao subtrair um numero negativo com zero ,espera o mesmo numero negativo
    @Test
    public void SubtrairUmNumeroNegativoComZero() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,0);
        
        assertEquals(-2,sub);
    }
    
    // Ao subtrair um numero negativo com outro postivo ,espera o numero negativo
    @Test
    public void SubtrairUmNumeroPositivoComZero() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(2,0);
        
        assertEquals(2,sub);
    }
    
    
    // MULTIPLICACAO
    
    // Ao multiplicar um numero positivo com outro postivo ,espera o numero positivo
    @Test
    public void MultiplicarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,2);
        
        assertEquals(4,mult);
    }
    
    // Ao multiplicar um numero positivo com outro negativo ,espera o numero negativo
    @Test
    public void MultiplicarNumeroPositivoComNumeroNegativo() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,-2);
        
        assertEquals(-4,mult);
    }
    
    // Ao multiplicar um numero positivo com outro postivo ,espera o numero positivo
    @Test
    public void MultiplicarDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(-2,-2);
        
        assertEquals(4,mult);
    }
    
    // Ao multiplicar um numero positivo com zero ,espera zero
    @Test
    public void MultiplicarNumeroPorZero() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,0);
        
        assertEquals(0,mult);
    }
    
    
    // Divisão
    
    
    // Ao dividir um numero positivo com outro postivo ,espera o numero positivo
    @Test
    public void DividirDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(2,2);
        
        assertEquals(1,div,2);
    }
    
    // Ao dividir um numero positivo com outro negativo ,espera o numero negativo
    @Test
    public void DividirComUmNumeroPositivoUmNumeroNegativo() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(2,-2);
        
        assertEquals(-1,div,2);
    }
    
    // Ao dividir um numero negativo com outro negativo ,espera o numero positivo
    @Test
    public void DividirDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(-2,-2);
        
        assertEquals(1,div, 0.0f);
    }

}
