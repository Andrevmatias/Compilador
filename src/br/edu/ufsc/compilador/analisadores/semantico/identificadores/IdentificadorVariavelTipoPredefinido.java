/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Variável de tipo pré-definido
 * @author André
 */
public class IdentificadorVariavelTipoPredefinido extends IdentificadorVariavel {

	private TipoPredefinido tipo;
	
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tipo Tipo da variável
	 */
	public IdentificadorVariavelTipoPredefinido(String nome, int deslocamento, 
			TipoPredefinido tipo) {
		super(nome, deslocamento);
		this.tipo = tipo;
	}

	public TipoPredefinido getTipo() {
		return tipo;
	}
}
