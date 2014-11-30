/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Identificador de variável
 * @author André
 */
public abstract class IdentificadorVariavel extends Identificador {
	
	private int deslocamento;
	
	protected IdentificadorVariavel(String nome, int deslocamento) {
		super(nome);
		this.deslocamento = deslocamento;
	}

	public int getDeslocamento() {
		return deslocamento;
	}
}
