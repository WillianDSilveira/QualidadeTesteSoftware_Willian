package aula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *  @author marcelo.soares
 *  Exemplo de teste de integração
 */
public class BancoDadosIntegracaoTest {

	private static BancoDados banco;
    
    @BeforeAll
    public static void init(){
        banco = new BancoDados();
    }
    
    @BeforeEach
    public void antesCadaTest() {
    	banco.deleteTodasPessoa();
    }
    
    @Test
    public void testInsert(){
    	// Arrange
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // Ack
        banco.insertPessoa(pessoa);
        int id = pessoa.getId();
        
        // Assert
        assertNotNull(banco.buscaPessoa(id));
    }
    
    
    @Test
    public void testRemover() {
    	// arrange
    	Pessoa p1 = new Pessoa();
    	p1.setIdade(18);
    	p1.setNome("maria");
    	p1.setSalario(50f);
    	int id = banco.insertPessoa(p1);
    	
    	// ack
    	banco.deletePessoa(id);
    	
    	// assert
    	assertNull(banco.buscaPessoa(id));
    }
    
    @Test
    public void testListar() {
    	// arrange
    	Pessoa p1 = new Pessoa();
    	p1.setIdade(18);
    	p1.setNome("maria");
    	p1.setSalario(50f);
    	int id = banco.insertPessoa(p1);
    	// ack 
    	List<Pessoa>  lista = banco.listPessoa(); 
    	System.out.println("TAM LISTA: " + lista.size());
    	// assert
    	assertNotNull(lista);
    	assertTrue(lista.size() == 1);
    	
    }
    
    @Test
    public void testUpdate() {
    	
    	// arrange
    	Pessoa p1 = new Pessoa();
    	p1.setIdade(30);
    	p1.setNome("Joao");
    	p1.setSalario(50f);
    	banco.insertPessoa(p1);
    	p1.setIdade(60);
    	p1.setNome("Joao_Alterado");
    	p1.setSalario(10);
    	
    	// ack 
        banco.updatePessoa(p1);
        int id = p1.getId();
        
    	// assert
        
        Pessoa pessoaAtualizada = banco.buscaPessoa(id);
        assertEquals("Joao_Alterado", pessoaAtualizada.getNome());
        assertEquals(60, pessoaAtualizada.getIdade());
        assertEquals(10, pessoaAtualizada.getSalario());
        
        
    }
    
    
    
}
