package br.edu.ufsc.compilador.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import br.edu.ufsc.compilador.analisadores.LexicalError;
import br.edu.ufsc.compilador.analisadores.Lexico;
import br.edu.ufsc.compilador.analisadores.Token;

/**
 * @author André Victória Matias 
 * Última atualização 02/11/2014
 * 
 * ftp://ftp.awl.com/cseng/authors/gaddis/java/Control_Objects/3e/SOURCECODE/Case%20Studies/Simple%20Text%20Editor/TextEditor.java
 */
public class JanelaEditor extends JFrame {

	private static final long serialVersionUID = -7658841070484099447L;

	private JMenuBar menuBar;

	private JMenu fileMenu;
	private JMenu lexicoMenu;
	private JMenu sintaticoMenu;
	private JMenu semanticoMenu;
	
	
	private JMenuItem openItem;
	private JMenuItem saveItem;
	private JMenuItem saveAsItem;

	private String filename;
	private JTextArea editorText;
	private final int NUM_LINES = 20;
	private final int NUM_CHARS = 40;

	public JanelaEditor() {
		setTitle("Compilador");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		editorText = new JTextArea(NUM_LINES, NUM_CHARS);

		editorText.setLineWrap(true);
		editorText.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(editorText);

		add(scrollPane);

		buildMenuBar();

		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	private void buildMenuBar() {

		buildFileMenu();

		menuBar = new JMenuBar();

		menuBar.add(fileMenu);
		menuBar.add(lexicoMenu);
		menuBar.add(sintaticoMenu);
		menuBar.add(semanticoMenu);

		setJMenuBar(menuBar);
	}

	private void buildFileMenu() {

		openItem = new JMenuItem("Abrir...");
		openItem.setMnemonic(KeyEvent.VK_O);
		openItem.addActionListener(new OpenListener());

		saveItem = new JMenuItem("Salvar");
		saveItem.setMnemonic(KeyEvent.VK_S);
		saveItem.addActionListener(new SaveListener());

		saveAsItem = new JMenuItem("Salvar Como...");
		saveAsItem.setMnemonic(KeyEvent.VK_A);
		saveAsItem.addActionListener(new SaveListener());

		fileMenu = new JMenu("Arquivo");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		
		lexicoMenu = new JMenu("Léxico");
		lexicoMenu.setMnemonic(KeyEvent.VK_L);
		lexicoMenu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent ev) {
				String codigo = editorText.getText();
				Lexico analisadorLexico = new Lexico(codigo);
				Token currentToken;
				List<Token> tokens = new LinkedList<Token>();
				try {
					while((currentToken = analisadorLexico.nextToken()) != null)
						tokens.add(currentToken);
					
					JanelaAnaliseLexica.showTokens(tokens);
				} catch (LexicalError e) {
					JOptionPane.showMessageDialog(JanelaEditor.this, 
							e.getMessage(), "Erro Léxico", 
							JOptionPane.ERROR_MESSAGE);
					editorText.setCaretPosition(e.getPosition());
					tokens.add(new Token(-1, e.getMessage(), e.getPosition()));
					
					JanelaAnaliseLexica.showTokens(tokens);
				}
			}
		});
		
		sintaticoMenu = new JMenu("Sintático");
		sintaticoMenu.setEnabled(false);
		sintaticoMenu.setMnemonic(KeyEvent.VK_I);
		sintaticoMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO: Análise sintática
			}
		});
		
		semanticoMenu = new JMenu("Semântico");
		semanticoMenu.setEnabled(false);
		semanticoMenu.setMnemonic(KeyEvent.VK_I);
		semanticoMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO: Análise Semântica
			}
		});
		
	}

	private class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int chooserStatus;

			JFileChooser chooser = new JFileChooser();
			chooserStatus = chooser.showOpenDialog(null);
			if (chooserStatus == JFileChooser.APPROVE_OPTION) {

				File selectedFile = chooser.getSelectedFile();

				filename = selectedFile.getPath();

				if (!openFile(filename)) {
					JOptionPane.showMessageDialog(null, "Error reading "
							+ filename, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		private boolean openFile(String filename) {
			boolean success;
			String inputLine, editorString = "";
			FileReader freader;
			BufferedReader inputFile;

			try {

				freader = new FileReader(filename);
				inputFile = new BufferedReader(freader);

				inputLine = inputFile.readLine();
				while (inputLine != null) {
					editorString = editorString + inputLine + "\n";
					inputLine = inputFile.readLine();
				}
				editorText.setText(editorString);

				inputFile.close();

				success = true;
			} catch (IOException e) {

				success = false;
			}

			return success;
		}
	}

	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int chooserStatus;

			if (e.getActionCommand() == "Save As" || filename == null) {
				JFileChooser chooser = new JFileChooser();
				chooserStatus = chooser.showSaveDialog(null);
				if (chooserStatus == JFileChooser.APPROVE_OPTION) {

					File selectedFile = chooser.getSelectedFile();

					filename = selectedFile.getPath();
				}
			}

			if (!saveFile(filename)) {
				JOptionPane.showMessageDialog(null, "Error saving " + filename,
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		private boolean saveFile(String filename) {
			boolean success;
			String editorString;
			FileWriter fwriter;
			PrintWriter outputFile;

			try {

				fwriter = new FileWriter(filename);
				outputFile = new PrintWriter(fwriter);

				editorString = editorText.getText();
				outputFile.print(editorString);

				outputFile.close();

				success = true;
			} catch (IOException e) {

				success = false;
			}

			return success;
		}
	}
}