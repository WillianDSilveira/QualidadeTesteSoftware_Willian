package aula;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCarros{
	public static List<Carro> carros = new ArrayList<>();
	
	public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public static void listarCarros() {
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}
