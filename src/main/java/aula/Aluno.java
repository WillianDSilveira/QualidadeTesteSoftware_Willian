package aula;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Aluno {
	private String name;
	private int idade;
	private int mes;
	private int anoNascimento;
	
	
	public Aluno(String name, int idade, int mes, int anoNascimento) {
		setName(name);
		setIdade(idade);
		setMes(mes);
		setAnoNascimento(anoNascimento);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			System.out.println("Você precisa digitar um nome");
			return; 
		}
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 18) {
			System.out.println("A idade deve ser 18 anos ou mais.");
            return;
        }
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
