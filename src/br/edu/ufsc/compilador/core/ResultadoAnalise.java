package br.edu.ufsc.compilador.core;

import java.awt.Point;

public class ResultadoAnalise {
	public String mensagem;
	public boolean correto;
	public Point localErro;
	
	
	ResultadoAnalise(boolean compilado, String mensagem, Point localErro) {
		this.mensagem = mensagem;
		this.correto = compilado;
		this.localErro = localErro;
	}
	
	ResultadoAnalise(boolean compilado) {
		this(compilado, null, null);
	}
	
	public String getMensagem() {
		return mensagem;
	}
	public boolean isCorreto() {
		return correto;
	}
	public Point getLocalErro() {
		return localErro;
	}
}
