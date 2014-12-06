/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

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
	 */
	public IdentificadorConstante(String nome, String valor, Tipo tipo) {
		super(nome);
		this.valor = valor;
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

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
