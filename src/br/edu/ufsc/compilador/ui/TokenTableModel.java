package br.edu.ufsc.compilador.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.ufsc.compilador.analisadores.Token;

/**
 * @author André Matias
 * @version %G%
 */
public class TokenTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 6616245723082918187L;
	
	private List<Token> tokens;

	public TokenTableModel(List<Token> tokens) {
		this.tokens = tokens;
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return tokens.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		switch (coluna) {
			case 0:
				return tokens.get(linha).getLexeme();
			case 1:
				return tokens.get(linha).getPosition();
			default:
				return "";
		}
	}
	
	@Override
	public String getColumnName(int coluna) {
		switch (coluna) {
			case 0:
				return "Lexema";
			case 1:
				return "Posição";
			default:
				return "";
		}
	}

}
