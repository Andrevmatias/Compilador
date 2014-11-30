package br.edu.ufsc.compilador.analisadores.semantico;

import java.util.HashMap;

import br.edu.ufsc.compilador.analisadores.semantico.identificadores.Identificador;

/**
 * Classe que encapsula a tabela de símbolos
 * @author André
 */
public class TabelaDeSimbolos {

	/**
	 * A tabela de símbolos é mapeada da seguinte forma:
	 * nível -> nome -> identificador
	 */
	private HashMap<Integer, HashMap<String, Identificador>> tabela;
	
	public TabelaDeSimbolos() {
		this.tabela = new HashMap<Integer, HashMap<String, Identificador>>();
	}
	
	/**
	 * Insere um identificador em um certo nível na tabela de símbolos
	 * @param id Identificador
	 * @param nivel Nível do identificador
	 * @throws IdentificadorJaDefinidoException Caso o identificador já tenha sido declarado no nível
	 */
	public void add(Identificador id, int nivel) throws IdentificadorJaDefinidoException{
		if(!tabela.containsKey(nivel))
			tabela.put(nivel, new HashMap<String, Identificador>());
		
		HashMap<String, Identificador> tabelaNivel = tabela.get(nivel);
		
		if(tabelaNivel.containsKey(id.getNome()))
			throw new IdentificadorJaDefinidoException(id.getNome(), nivel);
		
		tabelaNivel.put(id.getNome(), id);
	}
	
	/**
	 * Retorna um identificador pelo seu nome conforme a visibilidade de um nível
	 * do programa
	 * @param nome Nome do identificador
	 * @param nivel Nível de visibilidade
	 * @return Identificador com o nome conforme a visibilidade do nível
	 * @throws IdentificadorNaoDefinidoException Caso o identificador não esteja definido para o nível
	 */
	public Identificador get(String nome, int nivel) throws IdentificadorNaoDefinidoException{
		for (int i = nivel; i >= 0; i--){
			if(tabela.containsKey(i))
				if(tabela.get(i).containsKey(nome))
					return tabela.get(i).get(nome);
		}
		
		throw new IdentificadorNaoDefinidoException(nome, nivel);
	}
	
	/**
	 * Remove a tabela de símbolos de um nível
	 * @param nivel Nível a ser removido 
	 */
	public void clear(int nivel){
		tabela.remove(nivel);
	}
}
