package aula;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CorreiosAPITest {

	private CorreiosAPI correiosApiMock;
	private CorreiosAPIServico correiosApiServico;

	@BeforeEach
    public void init(){
		correiosApiMock = Mockito.mock(CorreiosAPI.class);
		correiosApiServico = new CorreiosAPIServico(correiosApiMock);
    }
	
	@Test
	public void testInserirCepValido() {
		// arrange
		String Cep = "94853742";
		Endereco endereco = new Endereco();
		
		// configura o mock
		when(correiosApiServico.buscar(Cep)).thenReturn(endereco);
		// act
		Endereco resultado = correiosApiServico.buscar(Cep);
		
		// assert
		assertEquals(endereco, resultado);
	}
//	@Test
//	public void testInserirCepInvalido() {
//		// arrange
//		String Cep = "000000000";
//		Endereco enderecoNaoEncontrado = new Endereco();
//		enderecoNaoEncontrado.se
//		
//		// configura o mock
//		when(correiosApiServico.buscar(Cep)).thenReturn(enderecoNaoEncontrado);
//		// act
//		Endereco resultado = correiosApiServico.buscar(Cep);
//		
//		// assert
//		assertEquals(enderecoNaoEncontrado, resultado);
//		
//	}
}
