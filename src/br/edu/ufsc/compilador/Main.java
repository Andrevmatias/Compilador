package br.edu.ufsc.compilador;

import br.edu.ufsc.compilador.core.Compilador;
import br.edu.ufsc.compilador.ui.JanelaEditor;

public class Main {

	public static void main(String[] args) {
		new JanelaEditor(new Compilador());
	}

}
