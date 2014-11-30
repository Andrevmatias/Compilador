package br.edu.ufsc.compilador.analisadores.semantico.identificadores;

/**
 * Classe base para identificadores
 * @author André
 */
public abstract class Identificador {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected Identificador(String nome){
		this.nome = nome;
	}
}
