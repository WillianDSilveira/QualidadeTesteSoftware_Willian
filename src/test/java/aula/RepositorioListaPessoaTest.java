package aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RepositorioListaPessoaTest {
	RepositorioListaPessoa repositorio = new RepositorioListaPessoa();
	
	@DisplayName("Deve salvar na lista e retornar verdadeiro")
	@Test
	public void testSalvar1() {
		// Arrange
		RepositorioListaPessoa repositorio = new RepositorioListaPessoa();
		Pessoa pessoa = new Pessoa();
		
		//Ack
		boolean resultado = repositorio.salvarPessoa(pessoa);
		//Assertion
		Assertions.assertTrue(resultado);
		Assertions.assertTrue(repositorio.lista.size() > 0);
		
	}
	
	@DisplayName("nao deve salvar e retornar false")
	@Test
	public void testSalvar2() {
		// Arrange
		Pessoa pessoa = null;
		
		//Ack
		boolean resultado = repositorio.salvarPessoa(pessoa);
		//Assertion
		Assertions.assertTrue(resultado);
		Assertions.assertTrue(repositorio.lista.size() == 0);
		
	}

}
