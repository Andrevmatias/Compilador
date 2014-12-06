/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

import br.edu.ufsc.compilador.analisadores.SemanticError;

/**
 * Variável de vetor
 * @author André
 */
public class IdentificadorVariavelVetor extends IdentificadorVariavel {

	private Tipo tipoElementos;
	private Tipo tipoIndice;
	private int limiteInferior;
	private int limiteSuperior;
	
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tipoElementos Tipo dos elementos do vetor
	 * @param tipoIndice Tipo do índice do vetor. Pode ser CARACTER ou INTEIRO
	 * @param limiteInferior Limite inferior de índice do vetor. Caso seja definido como char, o caractere deve ser convertido para int.
	 * @param limiteSuperior Limite superior de índice do vetor. Caso seja definido como char, o caractere deve ser convertido para int.
	 * @throws SemanticError Caso o tipo do índice seja diferente de inteiro e caracter
	 */
	public IdentificadorVariavelVetor(String nome, int deslocamento, 
			Tipo tipoElementos, Tipo tipoIndice, 
			int limiteInferior, int limiteSuperior) throws SemanticError {
		super(nome, deslocamento, Tipo.VETOR);
		if(tipoIndice != Tipo.INTEIRO && tipoIndice != Tipo.CARACTERE)
			throw new SemanticError("O tipo do índice deve ser Inteiro ou Caracter");
		
		this.tipoIndice = tipoIndice;
		this.tipoElementos = tipoElementos;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
	}

	public Tipo getTipoElementos() {
		return tipoElementos;
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setTipoElementos(Tipo tipoElementos) {
		this.tipoElementos = tipoElementos;
	}

	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	public Tipo getTipoIndice() {
		return tipoIndice;
	}

	public void setTipoIndice(Tipo tipoIndice) throws SemanticError {
		if(tipoIndice != Tipo.INTEIRO && tipoIndice != Tipo.CARACTERE)
			throw new SemanticError("O tipo do índice deve ser Inteiro ou Caracter");
		
		this.tipoIndice = tipoIndice;
	}
}
