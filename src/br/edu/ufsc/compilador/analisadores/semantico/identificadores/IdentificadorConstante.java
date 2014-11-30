/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Identificador de constante
 * @author André
 */
public class IdentificadorConstante extends Identificador {

	private Object valor;
	private TipoPredefinido tipo;
	
	/**
	 * @param nome Nome da constante
	 * @param valor Valor da constante
	 * @param tipo Tipo da constante
	 */
	public IdentificadorConstante(String nome, Object valor, TipoPredefinido tipo) {
		super(nome);
		this.valor = valor;
		this.tipo = tipo;
	}

	public Object getValor() {
		return valor;
	}

	public TipoPredefinido getTipo() {
		return tipo;
	}
}
