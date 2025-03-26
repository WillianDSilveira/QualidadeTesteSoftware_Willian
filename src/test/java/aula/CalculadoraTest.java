package aula;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	@DisplayName("Deve somar valores")
	@Test
	void testSomarDoisValores() {
		// Arrange
		Calculadora calc = new Calculadora();
		Double entrada1 = 5d;
		Double entrada2 = 3d;
		Double resultadoEsperado = 8d;
		
		// Ack
		Double resultado = calc.somar(entrada1, entrada2);
		
		// Assertion
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	
	@DisplayName("Não deve somar valores null")
	@Test
	void testSomarTratarParametrosNull() {
		// Arrange
		Calculadora calc = new Calculadora();
		Double entrada1 = null;
		Double entrada2 = null;
		
		
		// Ack
		Double resultado = calc.somar(entrada1, entrada2);
		
		// Assertion
		Assert.assertNull(resultado);
	}
	
	@DisplayName("Não deve somar valores null")
	@Test
	void testSomarVetorVazio() {
		// Arrange
		Calculadora calc = new Calculadora();
		Double[] entrada1 = {1d,2d,5d,8d};
		Double resultadoEsperado = 16d;
		
		
		// Ack
		Double resultado = calc.somar(entrada1);
		
		// Assertion
		Assert.assertEquals(resultadoEsperado,resultado);
	}
	
	
	@DisplayName("Deve gera um exception null")
	@Test
	void testSomarComVetorNull() {
		// Arrange
		Calculadora calc = new Calculadora();
		Double[] entrada1 = null;

		
		// Ack and Assertion
		try {
			Double resultado = calc.somar(entrada1);
			Assertions.fail("deveria ter gerado excessao");			
		}catch(Exception e) {
			System.out.println("Passou na excessão");
		}
			
	}	
	
	@DisplayName("Deve retornar mensagem de erro = 'lista null' quando tem uma lista NULL")
	@Test
	public void testMultiplicacao() {
		// Arrange
		Calculadora calc = new Calculadora();
		ArrayList<Double> entrada1 = null;
		
		// Ack 
		ResultadoCalculoVO resultado = calc.multiplicacao(entrada1);
							
		// Assertion
		
		Assertions.assertEquals("lista nula", resultado.mensagemError());		
			
	}	
	
	@DisplayName("Deve retornar erro quando exceder o numero de elementos ")
	@Test
	public void testMultiplicacao1() {
		// Arrange
		Calculadora calc = new Calculadora();
		ArrayList<Double> entrada = new ArrayList<Double>();
		entrada.add(1d);
		entrada.add(1d);
		entrada.add(1d);
		entrada.add(1d);
		entrada.add(1d);	
		entrada.add(1d);
		
		
		// Ack 
		ResultadoCalculoVO resultado = calc.multiplicacao(entrada);
							
		// Assertion
		
		Assertions.assertEquals("Tamanho maximo de elementos [5]", resultado.mensagemError());
		
		
			
	}	
	
	@DisplayName("Deve calcular a multiplicacao")
	@Test
	public void testMultiplicacao2() {
		// Arrange
		Calculadora calc = new Calculadora();
		ArrayList<Double> entrada1 = new ArrayList<Double>();
		entrada1.add(1d);
		entrada1.add(2d);
		entrada1.add(3d);
		entrada1.add(4d);
		entrada1.add(5d);
		Double resultadoEsperado = 120d;
		
		// Ack 
		ResultadoCalculoVO resultado = calc.multiplicacao(entrada1);
							
		// Assertion
		
		Assertions.assertEquals(resultadoEsperado, resultado.resultado());		
			
	}	
	
	@DisplayName("Deve retornar o valor 0 pois a lista e vazia.")
	@Test
	public void testMultiplicacao3() {
		// arrange
		Calculadora calc = new Calculadora();
		ArrayList<Double> entrada1 =  new ArrayList<Double>();		
		Double resultadoEsperado = 0d;
				
		// ack					
		ResultadoCalculoVO resultado = calc.multiplicacao(entrada1);
		
		// assertion
		Assertions.assertEquals(resultadoEsperado, resultado.resultado());

	}

}
