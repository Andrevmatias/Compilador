/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

import br.edu.ufsc.compilador.analisadores.SemanticError;

/**
 * Identificador de constante
 * @author André
 */
public class IdentificadorConstante extends Identificador {

	private String valor;
	private Tipo tipo;

	/**
	 * @param nome Nome da constante
	 * @param valor Valor da constante
	 * @param tipo Tipo da constante
	 * @throws SemanticError Se tipo não é pré-definido
	 */
	public IdentificadorConstante(String nome, String valor, Tipo tipo) throws SemanticError {
		super(nome);
		this.valor = valor;
		if(tipo != null && !Tipo.isPreDefinido(tipo))
			throw new SemanticError("Contantes só podem possuim valor de tipo pré-definido");
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public Tipo getTipo() {
		return tipo;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setTipo(Tipo tipo) throws SemanticError {
		if(!Tipo.isPreDefinido(tipo))
			throw new SemanticError("Contantes só podem possuim valor de tipo pré-definido");
		
		this.tipo = tipo;
	}
}
