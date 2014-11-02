package br.edu.ufsc.compilador.core;

public class Compilador {
	
	public ResultadoAnalise analizarLexica(String codigo){
		return new ResultadoAnalise(true);
	}

	public ResultadoAnalise analizarSintatico(String codigo) {
		ResultadoAnalise resultadoLexico = analizarLexica(codigo);
		return  resultadoLexico.isCorreto() ? new ResultadoAnalise(true) : resultadoLexico;
	}

	public ResultadoAnalise analizarSemantico(String codigo) {
		ResultadoAnalise resultadoSintatico = analizarSintatico(codigo);
		return  resultadoSintatico.isCorreto() ? new ResultadoAnalise(true) : resultadoSintatico;
	}
}
