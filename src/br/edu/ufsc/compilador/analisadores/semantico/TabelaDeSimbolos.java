package br.edu.ufsc.compilador.analisadores.semantico;

import java.util.HashMap;

import br.edu.ufsc.compilador.analisadores.semantico.identificadores.Identificador;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorPrograma;

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
	private IdentificadorPrograma idPrograma = null;
	
	public TabelaDeSimbolos() {
		this.tabela = new HashMap<Integer, HashMap<String, Identificador>>();
	}
	
	/**
	 * Insere um identificador em um certo nível na tabela de símbolos
	 * @param id Identificador
	 * @param nivel Nível do identificador
	 * @throws IdentificadorJaDefinidoException Caso o identificador já tenha sido declarado no nível ou seja o identificador do programa
	 */
	public void add(Identificador id, int nivel) throws IdentificadorJaDefinidoException{
		verificarIdPrograma(id);
		
		if(!tabela.containsKey(nivel))
			tabela.put(nivel, new HashMap<String, Identificador>());
		
		HashMap<String, Identificador> tabelaNivel = tabela.get(nivel);
		
		if(tabelaNivel.containsKey(id.getNome()))
			throw new IdentificadorJaDefinidoException(id.getNome(), nivel);
		
		tabelaNivel.put(id.getNome(), id);
	}
	
	/**
	 * Verifica se é identificador do programa ou se é
	 * mesmo identificador que o do programa
	 * @param id Identificador a verificar
	 * @throws IdentificadorJaDefinidoException Caso o identificador de programa já tenha sido definido ou o identificador seja igual ao do programa
	 */
	private void verificarIdPrograma(Identificador id) throws IdentificadorJaDefinidoException {
		if(id instanceof IdentificadorPrograma){
			if(idPrograma == null)
				idPrograma = (IdentificadorPrograma)id;
			else
				throw new IdentificadorJaDefinidoException("O identificador de programa já foi definido");
		} else if(idPrograma.getNome().equals(id.getNome())){
			throw new IdentificadorJaDefinidoException("Nenhum identificador pode ser igual ao do programa");
		}
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
	
	/**
	 * Substitui o objeto de informações de um identificador
	 * @param id Objeto com informações do identificador
	 * @param nivel Nível onde deve ocorrer a operação
	 * @throws IdentificadorJaDefinidoException Caso o identificador a ser substituido seja o do programa
	 */
	public void override(Identificador id, int nivel) 
			throws IdentificadorJaDefinidoException{
		verificarIdPrograma(id);
		
		HashMap<String, Identificador> tabelaNivel = tabela.get(nivel);
		
		if(!tabelaNivel.containsKey(id.getNome()))
			throw new RuntimeException("Este identificador não existe para ser sobreescrito");
		
		tabelaNivel.put(id.getNome(), id);
	}
}
