package com.lucas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import com.lucas.model.Endereco;

/*
 * 
 * Classe que atua como um conversor de dados do tipo Endereco
 * 
 * */

@FacesConverter(forClass = Endereco.class)
public class EnderecoConverter implements Converter<Endereco>{

	/*
	 * 
	 * Método que pega os valores digitados na tela como uma String e
	 * retorna um Object, que, no caso, será do tipo Endereco.
	 * 
	 * */
	@Override
	public Endereco getAsObject(FacesContext context, UIComponent ui, String value) {
		if(value == null) {
			return null;	
		}
		
		String[] tokens = value.split(","); //Rua de um lado e numero de outro da vírgula
		
		Endereco endereco = new Endereco();
		endereco.setRua(tokens[0].trim());
		endereco.setNumero(tokens[1].trim());
		
		return endereco;
	}

	
	/*
	 * 
	 * Método que pega os objeto do tipo Object, no caso, Endereco, e 
	 * converte em uma String para ser apresentado na tela.
	 * 
	 * */
	@Override
	public String getAsString(FacesContext context, UIComponent ui, Endereco value) {
		return value.getRua() + ", " + value.getNumero();
	}

}
