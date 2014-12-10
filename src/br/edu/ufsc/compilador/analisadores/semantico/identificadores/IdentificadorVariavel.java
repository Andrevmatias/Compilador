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
	private Tipo tipo;
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	protected IdentificadorVariavel(String nome, int deslocamento, Tipo tipo) {
		super(nome);
		this.deslocamento = deslocamento;
		this.tipo = tipo;
	}

	public int getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento = deslocamento;
	}
}
