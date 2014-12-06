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
	private Tipo tipo;
	private TipoPassagemParametro tipoPassagem;
	
	public IdentificadorParametro(String nome, int deslocamento,
			Tipo tipo, TipoPassagemParametro tipoPassagem) {
		super(nome);
		this.deslocamento = deslocamento;
		this.tipo = tipo;
		this.tipoPassagem = tipoPassagem;
	}

	public int getDeslocamento() {
		return deslocamento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public TipoPassagemParametro getTipoPassagem() {
		return tipoPassagem;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento = deslocamento;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void setTipoPassagem(TipoPassagemParametro tipoPassagem) {
		this.tipoPassagem = tipoPassagem;
	}
}
