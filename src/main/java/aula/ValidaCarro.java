/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.security.PublicKey;

/**
 *
 * @author fatec.senai
 */
public class ValidaCarro {
	
	public ErroValidacao validarCarro(Carro carro) {
		ErroValidacao error = new ErroValidacao();
		
		if(validaIdCarro(carro.getId()) == false) {
			error.adicionarError("Erro na validação do Id");
		}
		if(validaModelCarro(carro.getModelo()) == false) {
			error.adicionarError("Erro na validação do modelo do carro");
		}
		if(validaMarcaCarro(carro.getMarca()) == false) {
			error.adicionarError("Erro na validação da Marca");
		}
		if(validaPlacaCarro(carro.getPlaca()) == false) {
			error.adicionarError("Erro na validação da Placa");
		}
		if(validaAnoFabricacao(carro.getAnoFabricacao()) == false) {
			error.adicionarError("Erro na validação do ano de fabricacao");
		}
		if(validaPrecoFabricacao(carro.getPrecoFabricacao()) == false) {
			error.adicionarError("Erro na validação do preço de fabricacão");
		}
		
		return error;
	}
	
	// se houver erro, retornar um string, senao tiver erro, retorna uma string vazia.
	public String validar(Carro carro) {
		if(validarCarro(carro).getErro().size() != 0) {
			return "ocorreu um erro";
		}
		
		return "";
	}
	
    public boolean validaIdCarro(int id){            	       
        if(id < 0 ){
          return false;
        }        
        return true;
        
    }
	
	 public boolean validaModelCarro(String modelo){            
       
        if(modelo.length() <= 20 ){
          return true;
        }        
        return false;
        
    }
	
	 public boolean validaMarcaCarro(String marca){            
       
        if(marca.equals("VW") || marca.equals("GM") ){
          return true;
        }        
        return false;
        
    }
	 
	 public boolean validaPlacaCarro(String placa){            
	       
	        if(placa.length() == 8) {
	          return true;
	        }	        
	        return false;
	        
	 }
	 
	 public boolean validaAnoFabricacao(int ano){            
	       
	        if(ano > 1980) {
	          return true;
	        }        
	        return false;	        
	    }
	 
	 public boolean validaPrecoFabricacao(float valor){            
	       
	        if(valor > 1 && valor < 50000) {
	          return true;
	        }	        
	        return false;	        
	    }

}
