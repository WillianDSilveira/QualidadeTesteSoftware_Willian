package aula;

public class ExercicioE2 {
	private int cod;
	private String nome;
	private float preco;

	public ExercicioE2(String fraseEntrada) {
		
		Object[] dados = validaString(fraseEntrada);
		
		int cod = (int) dados[0];
	    String nome = (String) dados[1];
	    float preco = (float) dados[2];

		setCod(cod);
		setNome(nome);
		setPreco(preco);
	}

	public ExercicioE2(int cod, String nome, float preco) {
		setCod(cod);
		setNome(nome);
		setPreco(preco);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		validaCod(cod);
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		validaNome(nome);
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		validaPreco(preco);
		this.preco = preco;
	}
	
	public Object[] validaString(String fraseEntrada) {
	    String[] frase = fraseEntrada.split(";");

	    int cod = Integer.parseInt(frase[0]);
	    String nome = frase[1];
	    float preco = Float.parseFloat(frase[2]);

	    return new Object[] { cod, nome, preco };
	}
	

	public void validaCod(int cod) {
	    if (cod <= 0) {
	        System.out.println("Código inválido: deve ser maior que zero.");
	    }
	}

	public void validaNome(String nome) {
	    if (nome == null || nome.trim().isEmpty()) {
	        System.out.println("Nome inválido: não pode estar vazio.");
	    }
	}

	public void validaPreco(float preco) {
	    if (preco <= 0) {
	        System.out.println("Preço inválido: deve ser maior que zero.");
	    }
	}

}
