package aula;

import java.util.ArrayList;
import java.util.List;

public class ErroValidacao {

	
	private List<String> erro = new ArrayList<String>();

	public void adicionarError(String error) {
		this.erro.add(error);
	}
	
	public List<String> getErro() {
		return erro;
	}

	public boolean temError() {
		return erro.size() > 0;
	}
	
	
}
