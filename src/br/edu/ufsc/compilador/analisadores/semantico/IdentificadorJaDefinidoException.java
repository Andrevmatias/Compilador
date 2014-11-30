package br.edu.ufsc.compilador.analisadores.semantico;

/**
 * Exceção de identificador já definido em um certo nível
 * @author André
 */
public class IdentificadorJaDefinidoException extends Exception {

	private static final long serialVersionUID = -5020904425647061286L;

	public IdentificadorJaDefinidoException(String nome, int nivel){
		super("O identificador " 
					+ nome 
					+ " já foi definido no nível " 
					+ nivel);
	}
}
