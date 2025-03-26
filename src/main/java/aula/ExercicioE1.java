package aula;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ExercicioE1 {
	private String name;
	private int idade;
	private int mes;
	private int anoNascimento;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isEmpty()) {
			return "erro";		
		}
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	

}
