/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Variável de cadeia de caracteres
 * @author André
 */
public class IdentificadorVariavelCadeia extends IdentificadorVariavel {

	private int tamanho;

	/**
	 * @param nome Nome do identificador
	 * @param deslocamento Deslocamento de memória da variável
	 * @param tamanho Tamanho da cadeia
	 */
	public IdentificadorVariavelCadeia(String nome, int deslocamento, 
			int tamanho) {
		super(nome, deslocamento, Tipo.CADEIA);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
