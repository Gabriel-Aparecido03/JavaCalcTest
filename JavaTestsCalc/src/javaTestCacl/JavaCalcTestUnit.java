package javaTestCacl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JavaCalcTestUnit {

	@Test
    public void SomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,1);
        
        assertEquals(2,soma);
    }
    
    @Test
    public void SomarUmNumeroPositivoEOutroNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,-1);
        
        assertEquals(0,soma);
    }
    
    @Test
    public void SomarDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-1,-1);
        
        assertEquals(-2,soma);
    }
    
    @Test
    public void SomarNumeroPositivoComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(1,0);
        
        assertEquals(1,soma);
    }
    
    @Test
    public void SomarNumeroNegativosComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-1,0);
        
        assertEquals(-1,soma);
    }
    
    // SUBTRAÇÃO
    
    @Test
    public void SubtrairDoisNumeroPositivos() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(2,1);
        
        assertEquals(1,sub);
    }
    
    @Test
    public void SubtrairDoisNumeroNegativos() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,-1);
        
        assertEquals(-1,sub);
    }
    
    @Test
    public void SubtrairNumeroNegativoComNumeroPositivo() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,1);
        
        assertEquals(-3,sub);
    }
    
    @Test
    public void SubtrairUmNumeroNegativoComZero() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(-2,0);
        
        assertEquals(-2,sub);
    }
    
    @Test
    public void SubtrairUmNumeroPositivoComZero() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(2,0);
        
        assertEquals(2,sub);
    }
    
    
    // Multiplicação
    
    @Test
    public void MultiplicarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,2);
        
        assertEquals(4,mult);
    }
    
    
    @Test
    public void MultiplicarNumeroPositivoComNumeroNegativo() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,-2);
        
        assertEquals(-4,mult);
    }
    
    @Test
    public void MultiplicarDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(-2,-2);
        
        assertEquals(4,mult);
    }
    
    @Test
    public void MultiplicarNumeroPorZero() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(2,0);
        
        assertEquals(0,mult);
    }
    
    
    // Divisão
    
    @Test
    public void DividirDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(2,2);
        
        assertEquals(1,div,2);
    }
    
    @Test
    public void DividirComUmNumeroPositivoUmNumeroNegativo() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(2,-2);
        
        assertEquals(-1,div,2);
    }
    
    @Test
    public void DividirDoisNumerosNegativos() {
        Calculadora calc = new Calculadora();
        float div = calc.divisao(-2,-2);
        
        assertEquals(1,div, 0.0f);
    }

}
