/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

import java.util.ArrayList;
import java.util.List;

/**
 * Identificador de método
 * @author André
 */
public class IdentificadorMetodo extends Identificador {

	private int enderecoPrimeiraInstrucao;
	private Tipo tipo;
	private List<IdentificadorParametro> parametros;
	
	/**
	 * Cria um método com tipo de retorno (função)
	 * @param nome Nome da constante
	 * @param enderecoPrimeiraInstrucao Endereço da primeira instrução do método
	 * @param tipo Tipo da constante
	 */
	public IdentificadorMetodo(String nome, int enderecoPrimeiraInstrucao,
			List<IdentificadorParametro> parametros, Tipo tipo) {
		super(nome);
		this.enderecoPrimeiraInstrucao = enderecoPrimeiraInstrucao;
		this.tipo = tipo;
		this.parametros = parametros == null ? 
				new ArrayList<IdentificadorParametro>(0) : parametros;
	}
	
	/**
	 * Cria um método sem tipo de retorno (procedimento)
	 * @param nome Nome da constante
	 * @param enderecoPrimeiraInstrucao Endereço da primeira instrução do método
	 */
	public IdentificadorMetodo(String nome, int enderecoPrimeiraInstrucao,
			List<IdentificadorParametro> parametros) {
		this(nome, enderecoPrimeiraInstrucao, parametros, null);
	}

	public int getEnderecoPrimeiraInstrucao() {
		return enderecoPrimeiraInstrucao;
	}

	public Tipo getTipo() {
		return tipo;
	}
	
	public boolean hasTipoRetorno(){
		return this.tipo != null;
	}

	public List<IdentificadorParametro> getParametros() {
		return parametros;
	}
	
	public void setEnderecoPrimeiraInstrucao(int enderecoPrimeiraInstrucao) {
		this.enderecoPrimeiraInstrucao = enderecoPrimeiraInstrucao;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
