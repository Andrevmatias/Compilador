package br.edu.ufsc.compilador.analisadores;

import java.util.List;
import java.util.Stack;

import br.edu.ufsc.compilador.analisadores.semantico.ContextoExpressao;
import br.edu.ufsc.compilador.analisadores.semantico.ContextoListaIds;
import br.edu.ufsc.compilador.analisadores.semantico.IdentificadorJaDefinidoException;
import br.edu.ufsc.compilador.analisadores.semantico.IdentificadorNaoDefinidoException;
import br.edu.ufsc.compilador.analisadores.semantico.TabelaDeSimbolos;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.Identificador;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorConstante;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorMetodo;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorParametro;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorPrograma;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavel;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavelCadeia;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavelCampoRegistro;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavelRegistro;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavelTipoPredefinido;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.IdentificadorVariavelVetor;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.Tipo;
import br.edu.ufsc.compilador.analisadores.semantico.identificadores.TipoPassagemParametro;

/**
 * @author Gabriel Soares
 * Última atualização 07/12/2014
 * @author André Matias
 * Última atualização 05/12/2014
 */

public class Semantico implements Constants
{
	private TabelaDeSimbolos tabela = new TabelaDeSimbolos();
	
	public TabelaDeSimbolos getTabela() {
		return tabela;
	}

	//Contexto
	private int nivelAtual = 0;
	private int deslocamento = 0;
	
	private Identificador idAtual = null;
	private IdentificadorVariavelRegistro regAtual = null;
	private Stack<IdentificadorMetodo> pilhaMetodosAtuais = new Stack<>();
	
	private ContextoListaIds contextoListaIds;
	private ContextoExpressao contextoExpressao;
	
	private Tipo tipoAtual;
	private Tipo tipoConstante;
	private Tipo tipoExpressao;
	private Tipo tipoMetodo;
	private Tipo tipoLadoEsquerdo;
	private Tipo tipoVariavelIndexada;
	private Tipo tipoVariavel;
	private Tipo tipoTermo;
	private Tipo tipoFator;
	private Tipo tipoExpressaoSimples;
	
	private String valorConstante;
	private TipoPassagemParametro metodoDePassagemDeParametro;
	private boolean analisandoRegistro = false;
	private boolean analisandoMetodoComTipo = false;
	private boolean leVar = false;
	
	private Tipo tipoLimiteInferior;
	private int valorLimiteInferior;
	private Tipo tipoElementos;
		
	private List<Identificador> listaIdsVariaveis;
	private List<Identificador> listaIdsCamposRegistro;
	private List<Identificador> listaParametros;
	
    public void executeAction(int action, Token token)	throws SemanticError
    {
    	switch(action)
    	{
    		case 101: acao101(token);
    		break;
    		case 102: acao102(token);
    		break;
    		case 103: acao103(token);
    		break;
    		case 104: acao104(token);
    		break;
    		case 105: acao105(token);
    		break;
    		case 106: acao106(token);
    		break;
    		case 107: acao107(token);
    		break;
    		case 108: acao108(token);
    		break;
    		case 109: acao109(token);
    		break;
    		case 110: acao110(token);
    		break;
    		case 111: acao111(token);
    		break;
    		case 112: acao112(token);
    		break;
    		case 113: acao113(token);
    		break;
    		case 114: acao114(token);
    		break;
    		case 115: acao115();
    		break;
    		case 116: acao116();
    		break;
    		case 117: acao117();
    		break;
    		case 118: acao118();
    		break;
    		case 119: acao119();
    		break;
    		case 120: acao120();
    		break;
    		case 121: acao121(token);
    		break;
    		case 122: acao122(token);
    		break;
    		case 123: acao123(token);
    		break;
    		case 124: acao124();
    		break;
    		case 125: acao125();
    		break;
    		case 126: acao126();
    		break;
    		case 127: acao127(token);
    		break;
    		case 128: acao128(token);
    		break;
    		case 129: acao129(token);
    		break;
    		case 130: acao130();
    		break;
    		case 131: acao131(token);
    		break;
    		case 132: acao132(token);
    		break;
    		case 133: acao133(token);
    		break;
    		case 134: acao134(token);
    		break;
    		case 135: acao135(token);
    		break;
    		case 136: acao136(token);
    		break;
    		case 137: acao137(token);
    		break;
    		
    		case 140: acao140(token);
    		break;
    		case 141: acao141(token);
    		break;
    		/*case 142:
    		break;
    		case 143:
    		break;*/
    		case 144: acao144();
    		break;
    		/*case 145:
    		break;
    		case 146:
    		break;
    		case 147:
    		break;
    		case 148:
    		break;
    		case 149:
    		break;
    		case 150:
    		break;
    		case 151:
        	break;*/
    		case 152: acao152();
        	break;
    		/*case 153:
		break;
    		case 154:
        	break;*/
    		case 155: acao155();
    		break;
    		case 156: acao156();
    		break;
    		case 157: acao157();
    		break;
    		case 158: acao158();
    		break;
    		/*case 159:
		break;
    		case 160:
		 break;*/
    		case 161: acao161();
    		break;
    		case 162: acao162();
    		break;
    		case 163: acao163();
    		break;
    		case 164: acao164();
    		break;
    		case 165: acao165(token);
		break;
    		case 166: acao166(token);
		break;
    		case 167: acao167();
    		break;
    		case 168: acao168();
    		break;
    		case 169: acao169();
    		break;
    		/*case 170:
    		break;
    		case 171:
    		break;
    		case 172:
    		break;
    		case 173:
    		break;
    		case 174:
    		break;*/
    		case 175: acao175(token);
    		break;
    		case 176: acao176(token);
    		break;
    		case 177: acao177(token);
    		break;
    		case 178: acao178(token);
    		break;
    		case 179: acao179(token);
    		break;

    		default: 
    			System.out.println("Ação não definida: #"+action+", Token: " + token); 
        }
    }

	private void acao179(Token token) {
		tipoConstante  = Tipo.CARACTERE;
		valorConstante = token.getLexeme();
	}

	private void acao178(Token token) {
		tipoConstante  = Tipo.BOOLEANO;
		valorConstante = token.getLexeme();
	}

	private void acao177(Token token) {
		tipoConstante  = Tipo.BOOLEANO;
		valorConstante = token.getLexeme();
	}

	private void acao176(Token token) {
		tipoConstante  = Tipo.REAL;
		valorConstante = token.getLexeme();
	}

    	private void acao175(Token token) {
		tipoConstante = Tipo.INTEIRO;
		valorConstante = token.getLexeme();
	}
    
	private void acao169(){
    		tipoFator = tipoConstante;
    	}
    
	private void acao168(){
    		tipoFator = tipoVariavel;
    	}
    
    	private void acao167(){
    		tipoFator = tipoExpressao;
    	}
    
    	private void acao166(Token token) throws SemanticError{
    		if(tipoFator != Tipo.INTEIRO && tipoFator != Tipo.REAL){
    			throw new SemanticError("Operador unário exige operando numérico", token.getPosition());
    		}
    	}
    
    	private void acao165(Token token) throws SemanticError{
    		if(tipoFator != Tipo.BOOLEANO){
    			throw new SemanticError("Operador 'não' exige operando BOOLEANO", token.getPosition());
    		}
    	}
    
    	private void acao164(){
    		//Guarda operador 'div' para futura geração de código
    	}
    
    	private void acao163(){
    		//Guarda operador 'e' para futura geração de código
    	}
    
    	private void acao162(){
    		//Guarda operador '/' para futura geração de código
	}
    
    	private void acao161(){
    		//Guarda operador '*' para futura geração de código
    	}
    
    	private void acao158(){
    		tipoTermo = tipoFator;
    	}
    
    	private void acao157(){
    		//Guarda operador 'ou' para futura geração de código
    	}
    
    	private void acao156(){
    		//Guarda operador '-' para futura geração de código
    	}
    
    	private void acao155(){
    		//Guarda operador '+' para futura geração de código
    	}
    
    	private void acao152(){
    		tipoExpressao = tipoTermo;
    	}
    
    	private void acao144(){
    		tipoExpressao = tipoExpressaoSimples;
    	}
    
    	private void acao141(Token token) throws SemanticError{
    		if(idAtual instanceof IdentificadorVariavelCampoRegistro){
			if(regAtual.getListaCampos().contains(idAtual) /*Assim é verificado se id é campo do regAtual?*/){
				tipoLadoEsquerdo = ((IdentificadorVariavel) idAtual).getTipo();
			}
			else{
				throw new SemanticError(token.getLexeme() + " não é campo do registro atual", token.getPosition());
			}
		}else{
			throw new SemanticError("Esperava-se um campo de registro", token.getPosition());
		}
    	}
    
    	private void acao140(Token token) throws SemanticError{
    		if(idAtual instanceof IdentificadorVariavel){
			if(idAtual instanceof IdentificadorVariavelRegistro){
				regAtual = (IdentificadorVariavelRegistro) idAtual; //regAtual = POSID ---- Está correto?
			}
			else{
				throw new SemanticError("Apenas registros podem ser qualificados", token.getPosition());
			}
		}else{
			throw new SemanticError("Variável esperada", token.getPosition());
		}
    	}
    
     	private void acao138(Token token) {
		//TODO Verificar se necessário contar parâmetros
    		contextoExpressao = ContextoExpressao.ParametrosAtuais;
    	//TODO Terminar
	}

	private void acao137(Token token) throws SemanticError {
    	if(idAtual instanceof IdentificadorMetodo){
    		if(((IdentificadorMetodo)idAtual).getTipo() != null)
    			throw new SemanticError("Método sem tipo esperado", token.getPosition());
    	} else {
    		throw new SemanticError("Identificador de método esperado", token.getPosition());
    	}
		
	}

	private void acao136(Token token) throws SemanticError {
		switch(tipoVariavelIndexada){	
			case CADEIA:
				if(tipoExpressao != Tipo.INTEIRO)
					throw new SemanticError("Índice deveria ser inteiro", token.getPosition());
				tipoLadoEsquerdo = Tipo.CARACTERE;
				break;
			case VETOR:
				IdentificadorVariavelVetor idVetor = (IdentificadorVariavelVetor) idAtual;
				if(tipoExpressao != idVetor.getTipoIndice())
					throw new SemanticError("Tipo de índice inválido", token.getPosition());
				tipoLadoEsquerdo = idVetor.getTipoElementos();
				break;
			default:
				break;
		}
	}

	private void acao135(Token token) throws SemanticError {
    	if(idAtual instanceof IdentificadorVariavel){
			if(idAtual instanceof IdentificadorVariavelCadeia)
				tipoVariavelIndexada = Tipo.CADEIA;
			else if(idAtual instanceof IdentificadorVariavelVetor)
				tipoVariavelIndexada = Tipo.VETOR;
			else
				throw new SemanticError("Apenas vetores e cadeias podem ser indexados", token.getPosition());
		}else{
			 throw new SemanticError("Variável esperada", token.getPosition());
		}
	}

	private void acao134(Token token) throws SemanticError {
		if(!Tipo.isCompativel(tipoLadoEsquerdo, tipoExpressao))
			throw new SemanticError("Tipos incompatíveis", token.getPosition());
		
		//Gerar Código
	}

	private void acao133(Token token) throws SemanticError {
		if(!(idAtual instanceof IdentificadorVariavel 
				|| idAtual instanceof IdentificadorParametro))
			throw new SemanticError("Esperado variável ou parâmetro", token.getPosition());
		
		if(idAtual instanceof IdentificadorVariavelVetor)
			throw new SemanticError("Vetores devem ser indexados", token.getPosition());
		
		if(idAtual instanceof IdentificadorVariavelRegistro)
			throw new SemanticError("Registros devem ser qualificados", token.getPosition());
		
		tipoLadoEsquerdo = idAtual instanceof IdentificadorVariavel ?
				((IdentificadorVariavel)idAtual).getTipo() :
				((IdentificadorParametro)idAtual).getTipo();
	}

	private void acao132(Token token) throws SemanticError {
		if(!analisandoMetodoComTipo)
			throw new SemanticError("\"Retorne\" só pode ser utilizado em métodos com tipo", token.getPosition());
		
		if(tipoExpressao != pilhaMetodosAtuais.peek().getTipo())
			throw new SemanticError("Tipo da expressão diferente do tipo do método", token.getPosition());
		
		//Gerar código
	}
    
    private void acao131(Token token) throws SemanticError {
		contextoExpressao = ContextoExpressao.IMPRESSAO;
		if(!Tipo.isImprimivel(tipoExpressao))
			throw new SemanticError("Tipo inválido para impressão", token.getPosition());
		
		//Gerar código
	}

	private void acao130() {
		leVar = true;
	}

	private void acao129(Token token) throws SemanticError {
		if(tipoExpressao != Tipo.BOOLEANO 
				&& tipoExpressao != Tipo.INTEIRO)
			throw new SemanticError("Tipo inválido de expressão", token.getPosition());
		
		//Gerar código
	}

	private void acao128(Token token) throws SemanticError {
    	try {
			idAtual = tabela.get(token.getLexeme(), nivelAtual);
		} catch (IdentificadorNaoDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao127(Token token) throws SemanticError {
		try {
			Identificador id = tabela.get(token.getLexeme(), nivelAtual);
			if(!(id instanceof IdentificadorConstante))
				throw new SemanticError("Esperava-se um identificador de constante", token.getPosition());
			
			tipoConstante = ((IdentificadorConstante)id).getTipo();
			valorConstante = ((IdentificadorConstante)id).getValor();
		} catch (IdentificadorNaoDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao126() {
		analisandoRegistro = false;
		tipoAtual = Tipo.REGISTRO;
	}

	private void acao125() {
		analisandoRegistro = true;
	}

	private void acao124() {
		tipoElementos = tipoAtual;
		tipoAtual = Tipo.VETOR;
	}

	private void acao123(Token token) throws SemanticError {
		if(tipoLimiteInferior != tipoConstante)
			throw new SemanticError("Contantes de intervalo de tipos diferentes", 
    				token.getPosition());
		
		int valorLimiteSuperior = tipoConstante == Tipo.INTEIRO ?
    			Integer.parseInt(valorConstante) : valorConstante.charAt(0);
		
		if(valorLimiteSuperior <= valorLimiteInferior)
			throw new SemanticError("Limite superior menor ou igual ao limite inferior do vetor", 
    				token.getPosition());
	}

	private void acao122(Token token) throws SemanticError {
    	if(tipoConstante != Tipo.INTEIRO
    			|| tipoConstante != Tipo.CARACTERE)
    		throw new SemanticError("Esperava-se uma constante inteira ou caractere", 
    				token.getPosition());
    	
    	tipoLimiteInferior = tipoConstante;
    	valorLimiteInferior = tipoConstante == Tipo.INTEIRO ?
    			Integer.parseInt(valorConstante) : valorConstante.charAt(0);
	}

	private void acao121(Token token) throws SemanticError {
		if(tipoConstante != Tipo.INTEIRO)
			throw new SemanticError("Esperava-se uma constante inteira", token.getPosition());
		
		if(Integer.parseInt(valorConstante) > 255)
			throw new SemanticError("Tamanho da cadeia maior que o permitido (255)", token.getPosition());
		
		tipoAtual = Tipo.CADEIA;
	}

	private void acao120() {
    	tipoAtual = Tipo.CARACTERE;
	}

	private void acao119() {
		tipoAtual = Tipo.BOOLEANO;
	}

	private void acao118() {
		tipoAtual = Tipo.REAL;
	}

	private void acao117() {
		tipoAtual = Tipo.INTEIRO;
	}

	private void acao116() {
		metodoDePassagemDeParametro = TipoPassagemParametro.VALOR;
	}

	private void acao115() {
		metodoDePassagemDeParametro = TipoPassagemParametro.REFERENCIA;
	}

	private void acao114(Token token) throws SemanticError {
		switch (contextoListaIds) {
			case DECLARACAO:
				acao114Declaracao(token);
				break;
			case PARAMETROS:
				acao114Parametros(token);
			default:
				break;
		}
	}

	private void acao114Parametros(Token token) throws SemanticError {
		try{
			Identificador idParametro = new Identificador(token.getLexeme());
			tabela.add(idParametro, nivelAtual);
			
			listaParametros.add(idParametro);
		} catch(IdentificadorJaDefinidoException ex){
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
	}

	private void acao114Declaracao(Token token) throws SemanticError {
		try{
			Identificador idVariavel = new Identificador(token.getLexeme());
			tabela.add(idVariavel, nivelAtual);
			
			if(analisandoRegistro)
				listaIdsCamposRegistro.add(idVariavel);
			else
				listaIdsVariaveis.add(idVariavel);
			
		} catch(IdentificadorJaDefinidoException ex){
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
		
	}

	private void acao113(Token token) {
    	tipoMetodo = tipoAtual;
    	analisandoMetodoComTipo = true;
	}

	private void acao112(Token token) {
		tipoMetodo = null;
	}

	private void acao111(Token token) {
		// TODO Implementar
	}

	private void acao110(Token token) {
		contextoListaIds = ContextoListaIds.PARAMETROS;
	}

	private void acao108(Token token) {
    	IdentificadorMetodo id = (IdentificadorMetodo)idAtual;
		id.setTipo(tipoMetodo);
	}

	private void acao107(Token token) {
		// TODO Verificar se necesário
		
	}

	private void acao109(Token token) {
		analisandoMetodoComTipo = false;
		pilhaMetodosAtuais.pop();
		tabela.clear(nivelAtual);
		nivelAtual--;
	}

	private void acao106(Token token) throws SemanticError {
    	try {
    		idAtual = new IdentificadorMetodo(token.getLexeme(), 0, null);
			tabela.add(idAtual, nivelAtual);
			nivelAtual++;
			pilhaMetodosAtuais.push((IdentificadorMetodo)idAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao105(Token token) throws SemanticError {
		try {
			for(Identificador id : listaIdsVariaveis)
				tabela.override(completarIdVariavel(id), nivelAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private IdentificadorVariavel completarIdVariavel(Identificador id) throws SemanticError {
		switch(tipoAtual){
			case VETOR:
				return completarIdVariavelVetor(id);
			case CADEIA:
				return completarIdVariavelCadeia(id);
			case REGISTRO:
				return completarIdVariavelRegistro(id);
			default:
				return new IdentificadorVariavelTipoPredefinido(id.getNome(), deslocamento++, tipoAtual);
		}
	}

	private IdentificadorVariavelRegistro completarIdVariavelRegistro(Identificador id) {
		int deslocamentoRegistro = deslocamento;
		deslocamento += listaIdsCamposRegistro.size();
		//TODO: Encontrar solução para lista de campos do registro 
		return new IdentificadorVariavelRegistro(id.getNome(), 
				deslocamentoRegistro, null);
	}

	private IdentificadorVariavelCadeia completarIdVariavelCadeia(Identificador id) {
		return new IdentificadorVariavelCadeia(id.getNome(), deslocamento++, 
				Integer.parseInt(valorConstante));
	}

	private IdentificadorVariavelVetor completarIdVariavelVetor(Identificador id)
			throws SemanticError {
		int limiteSuperior = Integer.parseInt(valorConstante);
		int tamanho = limiteSuperior - valorLimiteInferior + 1;
		int deslocamentoVetor = deslocamento;
		deslocamento += tamanho;
		return new IdentificadorVariavelVetor(id.getNome(), deslocamentoVetor, 
				tipoElementos, tipoLimiteInferior, valorLimiteInferior, 
				limiteSuperior);
	}

	private void acao104(Token token) {
		contextoListaIds = ContextoListaIds.DECLARACAO;
	}

	private void acao101(Token token) throws SemanticError {
    	try {
	    	String nomePrograma = token.getLexeme();
			IdentificadorPrograma idPrograma = new IdentificadorPrograma(nomePrograma);
			tabela.add(idPrograma, nivelAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}	
    
    private void acao102(Token token) throws SemanticError{
    	try{
			String nomeConstante = token.getLexeme();
			idAtual = new IdentificadorConstante(nomeConstante, null, null);
			tabela.add(idAtual, nivelAtual);
	    } catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}
    
	private void acao103(Token token) {
		IdentificadorConstante id = (IdentificadorConstante)idAtual;
		id.setTipo(tipoConstante);
		id.setValor(valorConstante);
		idAtual = null;
	}
	
}
