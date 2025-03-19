package aula;

import static org.junit.jupiter.api.Assertions.*;

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

}
