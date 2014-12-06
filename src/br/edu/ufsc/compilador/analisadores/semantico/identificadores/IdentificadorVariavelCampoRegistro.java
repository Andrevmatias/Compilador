/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

import br.edu.ufsc.compilador.analisadores.SemanticError;

/**
 * Variável de campo de registro
 * @author André
 */
public class IdentificadorVariavelCampoRegistro extends IdentificadorVariavel {
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tipo Tipo do campo
	 * @throws SemanticError Caso o tipo não seja pré-definido
	 */
	public IdentificadorVariavelCampoRegistro(String nome, int deslocamento, 
			Tipo tipo) throws SemanticError {
		super(nome, deslocamento, tipo);
		if(!Tipo.isPreDefinido(tipo))
			throw new SemanticError("Este tipo de variável exige um tipo pré-definido");
	}
}
