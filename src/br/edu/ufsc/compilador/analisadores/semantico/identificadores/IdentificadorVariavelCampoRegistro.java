/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Variável de campo de registro
 * @author André
 */
public class IdentificadorVariavelCampoRegistro extends IdentificadorVariavel {

	private TipoPredefinido tipo;
	
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tipo Tipo do campo
	 */
	public IdentificadorVariavelCampoRegistro(String nome, int deslocamento, 
			TipoPredefinido tipo) {
		super(nome, deslocamento);
		this.tipo = tipo;
	}

	public TipoPredefinido getTipo() {
		return tipo;
	}
}
