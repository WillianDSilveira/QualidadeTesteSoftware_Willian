package aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class validaDataMatrixTest {

	@Test
    public void testCodigo() {
		// Arrange
        String codigo = "17898XY0660559260124ABCDE123459";
        // Ack
        validaDataMatrix dm = new validaDataMatrix(codigo);
        // Assert
        assertTrue(dm.validarTudo(), "Código válido.");
    }

    @Test
    public void testLetra() {
    	// Arrange
        String codigo = "17A98560660559260124ABCDE12345A";
        // Ack
        validaDataMatrix dm = new validaDataMatrix(codigo);
        // Assert
        assertFalse(dm.validarTudo(), "Código invalido letra no final.");
    }

    @Test
    public void testData() {
    	// Arrange
        String codigo = "1789X560660559AB0124ABCDE123459";
        // Ack
        validaDataMatrix dm = new validaDataMatrix(codigo);
        // Assert
        assertFalse(dm.validarTudo(), "Código data inválida.");
    }

    @Test
    public void testTamanho() {
    	// Arrange
        String codigo = "1789Y560660559AB0124ABCDE1234598"; // 32 caracteres
        // Ack
        validaDataMatrix dm = new validaDataMatrix(codigo);
        // Assert
        assertFalse(dm.validarTudo(), "Código com tamanho inválido.");
    }
	
}
