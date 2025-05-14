package aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

	private ContaBancaria contaBancariaMock;
	
	@BeforeEach
    public void init(){
    	contaBancariaMock = Mockito.mock(ContaBancaria.class);
    	
    }
	
	@Test
    public void testeDepositar() {
        // arrange
        when(contaBancariaMock.depositaDinheiro(20f)).thenReturn(20f);

        // act
        float resultado = contaBancariaMock.depositaDinheiro(20f);

        // assert
        assertEquals(20f, resultado);
    }
	
	public void testeSacar() {
        // arrange
        when(contaBancariaMock.sacarDinheiro(20f)).thenReturn(10f);

        // act
        float resultado = contaBancariaMock.sacarDinheiro(20f);

        // assert
        assertEquals(10f, resultado);
    }
	
	public void testegetNomeCorrentista() {
        // arrange
		String resultadoEsperado = "João";
        when(contaBancariaMock.getNomeCorrentista()).thenReturn("João");

        // act
        String resultado = contaBancariaMock.getNomeCorrentista();

        // assert
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

}
