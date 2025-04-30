package aula;

public class CarroMain {

	public static void main(String[] args) {
		

		Carro carro = new Carro(1, "Gol", "VW", "565s6sss", 1000, 50);
		ValidaCarro validaCarro = new ValidaCarro();
		RepositorioCarros repositorioCarros = new RepositorioCarros();
		ErroValidacao erro = new ErroValidacao();
		
		String resultado = validaCarro.validar(carro);
		if(resultado.equals("")) {
			System.out.println("carro cadastro com sucesso");
		}else {
			System.out.println("ERRROR: " + resultado);
		}
		
		ErroValidacao error = validaCarro.validarCarro(carro);
		if(error.temError()) {
			System.out.println("OCORREU OS SEGUINTES ERRO DE VALIDACAO DO CARRO");
			for(String er : error.getErro()) {
				System.out.println(er);
			}
		}
		
		validaCarro.validaMarcaCarro(carro.getMarca());
		repositorioCarros.adicionarCarro(carro);
		
	}

}

//if(validaCarro.validaAnoFabricacao(carro.getAnoFabricacao()) == false) {
//	System.out.println("erro na validacao do ano de fabricacao");
//}