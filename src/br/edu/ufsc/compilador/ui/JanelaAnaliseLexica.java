package br.edu.ufsc.compilador.ui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.edu.ufsc.compilador.analisadores.Token;

/**
 * @author André Matias
 * Última atualização 16/11/2014
 */
public class JanelaAnaliseLexica extends JFrame {

	private static final long serialVersionUID = 5598244523554610915L;
	private List<Token> tokens;
	private JTable table;
	private static JanelaAnaliseLexica janelaLexico;
	
	
	private JanelaAnaliseLexica(List<Token> tokens) {
		setTitle("Análise Léxica");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.tokens = tokens;
		
		buildList();

		setSize(300, 400);
		
		setLocationRelativeTo(null);
	}

	private void buildList() {
		this.table = new JTable(new TokenTableModel(tokens));
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

	public static void showTokens(List<Token> tokens) {
		if(janelaLexico == null)
			janelaLexico = new JanelaAnaliseLexica(tokens);
		else
			janelaLexico.refresh(tokens);
		
		janelaLexico.setVisible(true);
	}

	private void refresh(List<Token> tokens) {
		this.tokens = tokens;
		table.setModel(new TokenTableModel(tokens));
		table.repaint();
	}

}
