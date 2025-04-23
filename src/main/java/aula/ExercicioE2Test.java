package aula;

import java.util.Scanner;

public class ExercicioE2Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do produto no seguinte formato");
		System.out.println("COD_PRODUTO; NOME_PRODUTO; PRECO_PRODUTO Ex:(0;tv samsung;1200)");
		System.out.println("Ex:(0;tv samsung;1200):  ");
		String entrada = sc.nextLine();

		ExercicioE2 produto = new ExercicioE2(entrada);
		
		
	}

}
