package br.edu.ufsc.compilador.analisadores.semantico;

/**
 * Exceção de identificador não definido em um certo nível
 * @author André
 */
public class IdentificadorNaoDefinidoException extends Exception {

	private static final long serialVersionUID = -6193707501808691536L;

	public IdentificadorNaoDefinidoException(String nome, int nivel){
		super("O identificador " 
					+ nome 
					+ " não foi definido no nível " 
					+ nivel);
	}
}
