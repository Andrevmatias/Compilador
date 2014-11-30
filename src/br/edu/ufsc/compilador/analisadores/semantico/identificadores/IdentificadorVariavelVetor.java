/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Variável de vetor
 * @author André
 */
public class IdentificadorVariavelVetor extends IdentificadorVariavel {

	private TipoPredefinido tipoElementos;
	private int limiteInferior;
	private int limiteSuperior;
	
	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tipoElementos Tipo dos elementos do vetor
	 * @param limiteInferior Limite inferior de índice do vetor. Caso seja definido como char, o caractere deve ser convertido para int.
	 * @param limiteSuperior Limite superior de índice do vetor. Caso seja definido como char, o caractere deve ser convertido para int.
	 */
	public IdentificadorVariavelVetor(String nome, int deslocamento, 
			TipoPredefinido tipoElementos, int limiteInferior,
			int limiteSuperior) {
		super(nome, deslocamento);
		this.tipoElementos = tipoElementos;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
	}

	public TipoPredefinido getTipoElementos() {
		return tipoElementos;
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}
}
