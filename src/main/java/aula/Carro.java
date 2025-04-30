package aula;

public class Carro {
	private int id;
	private String modelo;
	private String marca;
	private String placa; 
	private int anoFabricacao;
	private float precoFabricacao;
	
	public Carro(int id, String modelo, String marca, String placa, int anoFabricacao, float precoFabricacao) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.precoFabricacao = precoFabricacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {

		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public float getPrecoFabricacao() {
		return precoFabricacao;
	}

	public void setPrecoFabricacao(float precoFabricacao) {
		this.precoFabricacao = precoFabricacao;
	}
	
	
	

}
