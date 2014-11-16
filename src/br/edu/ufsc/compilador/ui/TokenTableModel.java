package br.edu.ufsc.compilador.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.ufsc.compilador.analisadores.Token;

/**
 * @author André Matias
 * Última atualização 16/11/2014
 */
//Gabriel fez alterações.
public class TokenTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 6616245723082918187L;
	
	private List<Token> tokens;

	public TokenTableModel(List<Token> tokens) {
		this.tokens = tokens;
	}

	@Override
	public int getColumnCount() {
		return 3;//Adicionado +1
	}

	@Override
	public int getRowCount() {
		return tokens.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		switch (coluna) {
			case 0: //Acredito que deva existir algo mais bonito do que essa gambiarra, mas está funcionando assim Att.Gabriel
				int x =  tokens.get(linha).getId();
				if(x == 0){
					return "EPSLON";
				}else if(x == 1){
					return "DOLLAR";
				}else if(x == 2){
					return "id";
				}else if(x == 3 || x == 4){
					return "Constante Numérica";
				}else if(x == 5){
					return "Constante Literal";
				}else if(x > 33){
					return "Símbolo Especial"; 
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
				return "Token";//Reavaliar: Coloquei "Token", mas pode ser "Tipo Token", não sei..
			case 1:
				return "Lexema";
			case 2:
				return "Posição";
			default:
				return "";
		}
	}

}
