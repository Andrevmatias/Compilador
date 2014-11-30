/**
 * 
 */
package br.edu.ufsc.compilador.analisadores.semantico.identificadores;


/**
 * Identificador de parâmetro
 * @author André
 */
public class IdentificadorParametro extends Identificador {

	private int deslocamento;
	private TipoPredefinido tipo;
	private TipoPassagemParametro tipoPassagem;
	
	public IdentificadorParametro(String nome, int deslocamento,
			TipoPredefinido tipo, TipoPassagemParametro tipoPassagem) {
		super(nome);
		this.deslocamento = deslocamento;
		this.tipo = tipo;
		this.tipoPassagem = tipoPassagem;
	}

	public int getDeslocamento() {
		return deslocamento;
	}

	public TipoPredefinido getTipo() {
		return tipo;
	}

	public TipoPassagemParametro getTipoPassagem() {
		return tipoPassagem;
	}
}
