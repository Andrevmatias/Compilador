/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

import java.util.Collection;
import java.util.HashMap;

/**
 * Variável de registro
 * @author André
 */
public class IdentificadorVariavelRegistro extends IdentificadorVariavel {

	private HashMap<String, IdentificadorVariavelCampoRegistro> listaCampos;
	
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param listaCampos Lista de campos do registro
	 */
	public IdentificadorVariavelRegistro(String nome, int deslocamento, 
			Collection<IdentificadorVariavelCampoRegistro> listaCampos) {
		super(nome, deslocamento, Tipo.REGISTRO);
		this.listaCampos = new HashMap<String, IdentificadorVariavelCampoRegistro>();
		
		if(listaCampos != null)
			for(IdentificadorVariavelCampoRegistro campo : listaCampos)
				this.listaCampos.put(campo.getNome(), campo);
	}

	public Collection<IdentificadorVariavelCampoRegistro> getListaCampos() {
		return listaCampos.values();
	}
	
	public boolean containsCampo(String nome){
		return listaCampos.containsKey(nome);
	}
}
