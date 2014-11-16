package br.edu.ufsc.compilador.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.ufsc.compilador.analisadores.Token;

/**
 * @author André Matias
 * Última atualização 16/11/2014
 * 
 * @author Gabriel
 * Última atualização 16/11/2014
 * 
 * Modelo de tabela para exibir tokens na análise léxica
 */
public class TokenTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 6616245723082918187L;
	
	private List<Token> tokens;

	public TokenTableModel(List<Token> tokens) {
		this.tokens = tokens;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return tokens.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		switch (coluna) {
			//Reconhece o tipo de token encontrado pelo ID
			case 0: 
				int x =  tokens.get(linha).getId();
				if(x == 0){
					return "EPSLON";
				}else if(x == 1){
					return "DOLLAR";
				}else if(x == 2){
					return "Identificador";
				}else if(x == 3 || x == 4){
					return "Constante Numérica";
				}else if(x == 5){
					return "Constante Literal";
				}else if(x > 33){
					return "Simbolo especial"; 
				}else if(x > 5){
					return "Palavra Reservada";
				}else{
					return "ERRO LÉXICO";
				}
			case 1:
				return tokens.get(linha).getLexeme();
			case 2:
				return tokens.get(linha).getPosition();
			default:
				return "";
		}
	}
	
	@Override
	public String getColumnName(int coluna) {
		switch (coluna) {
			case 0:
				return "Tipo";
			case 1:
				return "Lexema";
			case 2:
				return "Posi��o";
			default:
				return "";
		}
	}

}
