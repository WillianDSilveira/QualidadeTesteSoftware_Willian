package aula;

import java.util.Scanner;

public class DataMatrix {
	

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o código DataMatrix (31 caracteres):");
	        String entrada = sc.nextLine();

	        validaDataMatrix dm = new validaDataMatrix(entrada);
	        dm.validarTudo(); // Executa todas as validações com saída no console

	        sc.close();
	    }
	}
    
    
    
}
