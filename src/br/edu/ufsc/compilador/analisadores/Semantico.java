package br.edu.ufsc.compilador.analisadores;

import java.util.ArrayList;
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
 * Última atualização 09/12/2014
 * @author André Matias 
 * Última atualização 07/12/2014
 */

public class Semantico implements Constants {
	private TabelaDeSimbolos tabela = new TabelaDeSimbolos();

	public TabelaDeSimbolos getTabela() {
		return tabela;
	}

	// Contexto
	private int nivelAtual = 0;
	private int deslocamento = 0;
	private int numeroParametrosAtuais;

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
	private IdentificadorMetodo idMetodoChamado;

	private String operadorAdd;
	private String operadorMult;
	private String operadorRel;
	private String operador;
	
	private String valorConstante;
	private TipoPassagemParametro metodoDePassagemDeParametro;
	private boolean analisandoRegistro = false;
	private boolean indexandoVetorParametro = false; 
	private boolean parametroAtualPodeSerReferencia = true;
	private boolean retornoDeclarado;
	private boolean leVar = false;

	private Tipo tipoLimiteInferior;
	private int valorLimiteInferior;
	private Tipo tipoElementos;

	private List<Identificador> listaIdsVariaveis;
	private List<IdentificadorVariavelCampoRegistro> listaIdsCamposRegistro;
	private List<Identificador> listaParametros;
	private List<Identificador> listaIdsCamposRegistroTemp;

	public void executeAction(int action, Token token) throws SemanticError {
		try{
			switch (action) {
			case 101:
				acao101(token);
				break;
			case 102:
				acao102(token);
				break;
			case 103:
				acao103();
				break;
			case 104:
				acao104();
				break;
			case 105:
				acao105();
				break;
			case 106:
				acao106(token);
				break;
			case 107:
				acao107(token);
				break;
			case 108:
				acao108();
				break;
			case 109:
				acao109();
				break;
			case 110:
				acao110();
				break;
			case 111:
				acao111();
				break;
			case 112:
				acao112();
				break;
			case 113:
				acao113();
				break;
			case 114:
				acao114(token);
				break;
			case 115:
				acao115();
				break;
			case 116:
				acao116();
				break;
			case 117:
				acao117();
				break;
			case 118:
				acao118();
				break;
			case 119:
				acao119();
				break;
			case 120:
				acao120();
				break;
			case 121:
				acao121();
				break;
			case 122:
				acao122();
				break;
			case 123:
				acao123();
				break;
			case 124:
				acao124();
				break;
			case 125:
				acao125();
				break;
			case 126:
				acao126();
				break;
			case 127:
				acao127(token);
				break;
			case 128:
				acao128(token);
				break;
			case 129:
				acao129();
				break;
			case 130:
				acao130();
				break;
			case 131:
				acao131();
				break;
			case 132:
				acao132();
				break;
			case 133:
				acao133();
				break;
			case 134:
				acao134();
				break;
			case 135:
				acao135();
				break;
			case 136:
				acao136();
				break;
			case 137:
				acao137();
				break;
			case 138:
				acao138();
				break;
			case 139:
				acao139();
				break;
			case 140:
				acao140(token);
				break;
			case 141:
				acao141(token);
				break;
			case 142:
				acao142(token);
				break;
			case 143: 
				acao143();
				break;
			case 144:
				acao144();
				break;
			case 145:
				acao145();
				break;
			case 146:
				acao146(token);
				break;
			case 147:
				acao147(token);
				break; 
			case 148:
				acao148(token);
				break;
			case 149:
				acao149(token);
				break; 
			case 150:
				acao150(token);
				break; 
			case 151:
				acao151(token);
				break;
			case 152:
				acao152();
				break;
			case 153:
				acao153(token);
				break;
			case 154:
				acao154();
				break;
			case 155:
				acao155(token);
				break;
			case 156:
				acao156(token);
				break;
			case 157:
				acao157(token);
				break;
			case 158:
				acao158();
				break;
			case 159:
			  	acao159(token);
			  	break;
			case 160:
				acao160();
				break;
			case 161:
				acao161(token);
				break;
			case 162:
				acao162(token);
				break;
			case 163:
				acao163(token);
				break;
			case 164:
				acao164(token);
				break;
			case 165:
				acao165(token);
				break;
			case 166:
				acao166(token);
				break;
			case 167:
				acao167();
				break;
			case 168:
				acao168();
				break;
			case 169:
				acao169();
				break;
			case 170:
				acao170();
				break; 
			case 171:
				acao171();
				break;
			case 172:
				acao172();
				break; 
			case 173:
				acao173(token);
				break;
			case 174:
				acao174(token);
				break;
			case 175:
				acao175(token);
				break;
			case 176:
				acao176(token);
				break;
			case 177:
				acao177(token);
				break;
			case 178:
				acao178(token);
				break;
			case 179:
				acao179(token);
				break;
	
			default:
				System.out.println("Ação não definida: #" + action + ", Token: "
						+ token);
			}
		}catch(SemanticError ex){
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
	}

	private void acao179(Token token) {
		//Retira aspas
		valorConstante = token.getLexeme().length() > 2 ?
				token.getLexeme().substring(1, token.getLexeme().length() - 1) :
				"";
		tipoConstante = valorConstante.length() == 1 ? Tipo.CARACTERE : Tipo.CADEIA;
	}

	private void acao178(Token token) {
		tipoConstante = Tipo.BOOLEANO;
		valorConstante = token.getLexeme();
	}

	private void acao177(Token token) {
		tipoConstante = Tipo.BOOLEANO;
		valorConstante = token.getLexeme();
	}

	private void acao176(Token token) {
		tipoConstante = Tipo.REAL;
		valorConstante = token.getLexeme();
	}

	private void acao175(Token token) {
		tipoConstante = Tipo.INTEIRO;
		valorConstante = token.getLexeme();
	}
	
	private void acao174(Token token) throws SemanticError{
		if(idAtual instanceof IdentificadorVariavel){
			if(((IdentificadorVariavel) idAtual).getTipo() != Tipo.VETOR){
				if(((IdentificadorVariavel) idAtual).getTipo() != Tipo.REGISTRO){
					if(leVar){
						if(((IdentificadorVariavel) idAtual).getTipo() != Tipo.BOOLEANO){
							leVar = false;
							//Gera Código de leitura
						} else {
							throw new SemanticError("Booleano não pode ser lido", token.getPosition());
						}
					} else {
						tipoVariavel = ((IdentificadorVariavel) idAtual).getTipo();
					}
				} else {
					throw new SemanticError(token.getLexeme() + " deveria ser qualificado");
				}
			} else {
				throw new SemanticError("Vetor deve ser indexado", token.getPosition());
			}
		} else if(idAtual instanceof IdentificadorParametro){
			if(((IdentificadorParametro) idAtual).getTipo() != Tipo.VETOR){
				if(((IdentificadorParametro) idAtual).getTipo() != Tipo.REGISTRO){
					if(leVar){
						if(((IdentificadorParametro) idAtual).getTipo() != Tipo.BOOLEANO){
							leVar = false;
							//Gera Código de leitura
						} else {
							throw new SemanticError("Booleano não pode ser lido", token.getPosition());
						}
					} else {
						tipoVariavel = ((IdentificadorParametro) idAtual).getTipo();
					}
				} else {
					throw new SemanticError(token.getLexeme() + " deveria ser qualificado");
				}
			} else {
				throw new SemanticError("Vetor deve ser indexado", token.getPosition());
			}
		} else if(leVar) {
			leVar = false;
			throw new SemanticError("Apenas variáveis e parâmetros podem ser lidos", token.getPosition());
		} else if(idAtual instanceof IdentificadorMetodo){
			idMetodoChamado = (IdentificadorMetodo) idAtual;
			if(idMetodoChamado.getTipo() != null){
				if(idMetodoChamado.getParametros().size() == 0){
					tipoVariavel = idMetodoChamado.getTipo();
					//Gera código
				} else {
					throw new SemanticError("Erro na quantidade de parâmetros (esperava-se 0)", token.getPosition());
				}
			} else {
				throw new SemanticError("Esperava-se método com tipo", token.getPosition());
			}
		} else if(idAtual instanceof IdentificadorConstante){
			tipoVariavel = ((IdentificadorConstante) idAtual).getTipo();
		} else {
			throw new SemanticError("Esperava-se variável, parâmetro, método ou constante", token.getPosition());
		}
	}
	
	private void acao173(Token token) throws SemanticError{
		try {
			idAtual = tabela.get(token.getLexeme(), nivelAtual);
			if (idAtual instanceof IdentificadorVariavelCampoRegistro) {
				if (regAtual.getListaCampos().contains(idAtual)) {
					tipoVariavel = ((IdentificadorVariavel) idAtual).getTipo();
				} else {
					throw new SemanticError(token.getLexeme()
							+ " não é campo do registro atual",
							token.getPosition());
				}
			} else {
				throw new SemanticError("Esperava-se um campo de registro",
						token.getPosition());
			}

			if (leVar) {
				if (tipoVariavel != Tipo.BOOLEANO) {
					leVar = false;
					// Gera código para leitura
				} else {
					throw new SemanticError(
							"Variável booleana não pode ser lida",
							token.getPosition());
				}
			}

		} catch (IdentificadorNaoDefinidoException ex) {
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
	}
	
	private void acao172() throws SemanticError{
		if(tipoVariavelIndexada == Tipo.CADEIA){
			if(tipoExpressao == Tipo.INTEIRO){
				tipoVariavel = Tipo.CARACTERE;
			} else {
				throw new SemanticError("Índice deveria ser Inteiro");
			}
		}else if(tipoExpressao == ((IdentificadorVariavelVetor) idAtual).getTipoIndice()){
				tipoVariavel = ((IdentificadorVariavelVetor) idAtual).getTipoElementos();
			}else{
				throw new SemanticError("Tipo do índice inválido");
		}
		
		if(tipoVariavelIndexada == Tipo.VETOR)
			indexandoVetorParametro = false;
		
		if(leVar){
			if(tipoVariavel == Tipo.BOOLEANO){
				throw new SemanticError("Variável Booleana não pode ser lida");
			} else {
				leVar = false;
				//Gera código para leitura
			}
		}
	}
	
	private void acao171() throws SemanticError{
		int numeroEsperado = idMetodoChamado.getParametros().size();
		if(numeroParametrosAtuais != numeroEsperado){
			throw new SemanticError("Erro na quantidade de parâmetros");
		} else {
			tipoVariavel = idMetodoChamado.getTipo();
			//Gera código para ativação de método
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}
	private void acao170() throws SemanticError{
		if(idAtual instanceof IdentificadorMetodo){
			if(tipoMetodo != null){
				if(leVar){
					leVar = false;
					throw new SemanticError("Só variáveis/parâmetros podem ser lidos");
				}
			} else {
				throw new SemanticError("Esperava-se método com tipo");
			}
		} else {
			throw new SemanticError(idAtual.getNome() + " deveria ser um método");
		}
		
		idMetodoChamado = (IdentificadorMetodo) idAtual;
		parametroAtualPodeSerReferencia = true;
	}
	private void acao169() {
		tipoFator = tipoConstante;
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}

	private void acao168() {
		tipoFator = tipoVariavel;
	}

	private void acao167() {
		tipoFator = tipoExpressao;
	}

	private void acao166(Token token) throws SemanticError {
		if (tipoFator != Tipo.INTEIRO && tipoFator != Tipo.REAL) {
			throw new SemanticError("Operador unário exige operando numérico",
					token.getPosition());
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}

	private void acao165(Token token) throws SemanticError {
		if (tipoFator != Tipo.BOOLEANO) {
			throw new SemanticError("Operador 'não' exige operando BOOLEANO",
					token.getPosition());
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}

	private void acao164(Token token) {
		operadorMult = token.getLexeme();
		// Guarda operador 'div' para futura geração de código
	}

	private void acao163(Token token) {
		operadorMult = token.getLexeme();
		// Guarda operador 'e' para futura geração de código
	}

	private void acao162(Token token) {
		operadorMult = token.getLexeme();
		// Guarda operador '/' para futura geração de código
	}

	private void acao161(Token token) {
		operadorMult = token.getLexeme();
		// Guarda operador '*' para futura geração de código
	}
	
	private void acao160() throws SemanticError{
		operador = operadorMult;
		if(!Tipo.isCompativel(tipoTermo, tipoFator)){
			throw new SemanticError("Operandos Incompatíveis");
		}else if(tipoFator != Tipo.INTEIRO || tipoTermo != Tipo.INTEIRO){
			if(operador.equals("*") || operador.equals("/")){
				tipoTermo = Tipo.REAL;
			}else if(operador.equals("e")){
				tipoTermo = Tipo.BOOLEANO;
			}else{
				throw new SemanticError("Operador 'div' usado apenas para Inteiros");
			}
		}else if(operador.equals("div") || operador.equals("*")){
			tipoTermo = Tipo.INTEIRO;
		}else if(operador.equals("/")){
			tipoTermo = Tipo.REAL;
		}else{
			throw new SemanticError("Operador 'e' incompatível com Inteiro");
		}
	}
	
	private void acao159(Token token) throws SemanticError{
		String operador = token.getLexeme();
		if(operador.equals("*") || operador.equals("/")){
			if(tipoTermo != Tipo.INTEIRO && tipoTermo != Tipo.REAL){
				throw new SemanticError("Operador e Operando incompatíveis", token.getPosition());
			}
		}else if(operador.equals("e")){
			if(tipoTermo != Tipo.BOOLEANO){
				throw new SemanticError("Operador e Operando incompatíveis", token.getPosition());
			}
		}else if(operador.equals("div")){
			if(tipoTermo != Tipo.INTEIRO){
				throw new SemanticError("Operador e Operando incompatíveis", token.getPosition());
			}
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}
	private void acao158() {
		tipoTermo = tipoFator;
	}

	private void acao157(Token token) {
		operadorAdd = token.getLexeme();
		// Guarda operador 'ou' para futura geração de código
	}

	private void acao156(Token token) {
		operadorAdd = token.getLexeme();
		// Guarda operador '-' para futura geração de código
	}

	private void acao155(Token token) {
		operadorAdd = token.getLexeme();
		// Guarda operador '+' para futura geração de código
	}
	
	private void acao154() throws SemanticError{
		operador = operadorAdd;
		if (!Tipo.isCompativel(tipoExpressaoSimples, tipoTermo)){
			throw new SemanticError("Operandos incompatíveis");
		} else {
			if(operador.equals("ou")){
			tipoExpressaoSimples = Tipo.BOOLEANO;
			}else if(tipoTermo != Tipo.INTEIRO || tipoExpressaoSimples != Tipo.INTEIRO){
				tipoExpressaoSimples = Tipo.REAL;
			}else{
				tipoExpressaoSimples = Tipo.INTEIRO;
			}
		}
	}
	
	private void acao153(Token token) throws SemanticError{
		String operador = token.getLexeme();
		if(operador.equals("+") || operador.equals("-")){
			if(tipoExpressaoSimples != Tipo.INTEIRO && tipoExpressaoSimples != Tipo.REAL){
				throw new SemanticError("Operador e Operando incompatíveis", token.getPosition());
			}
		}else if(operador.equals("ou")){
			if(tipoExpressaoSimples != Tipo.BOOLEANO){
				throw new SemanticError("Operador e Operando incompatíveis", token.getPosition());
			}
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}
	private void acao152() {
		tipoExpressaoSimples = tipoTermo;
	}

	private void acao151(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '<>' para futura geração de código
	}
	
	private void acao150(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '<=' para futura geração de código
	}
	
	private void acao149(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '>=' para futura geração de código
	}
	
	private void acao148(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '>' para futura geração de código
	}
	
	private void acao147(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '<' para futura geração de código
	}
	
	private void acao146(Token token) {
		operadorRel = token.getLexeme();
		// Guarda operador '=' para futura geração de código
	}
	
	private void acao145() throws SemanticError{
		if (!Tipo.isCompativel(tipoExpressao, tipoExpressaoSimples)){
			throw new SemanticError("Operandos incompatíveis");
		} else {
			tipoExpressao = Tipo.BOOLEANO;
		}
		
		if(!indexandoVetorParametro)
			parametroAtualPodeSerReferencia = false;
	}
	
	private void acao144() {
		tipoExpressao = tipoExpressaoSimples;
	}
	
	private void acao143() throws SemanticError{
		numeroParametrosAtuais++;
		
		if(contextoExpressao == ContextoExpressao.PARAMETROS_ATUAIS)
			verificarParametro();
		else if(contextoExpressao == ContextoExpressao.IMPRESSAO)
			if(tipoExpressao == Tipo.BOOLEANO)
				throw new SemanticError("Tipo inválido para impressão");
		
		parametroAtualPodeSerReferencia = true;
	}
	
	private void verificarParametro() throws SemanticError {
		if(idMetodoChamado.getParametros().size() < numeroParametrosAtuais)
			throw new SemanticError("Número de parâmetros não corresponde à declaração do método");
		
		IdentificadorParametro parFormal 
			= idMetodoChamado.getParametros().get(numeroParametrosAtuais - 1);
		if(!Tipo.isCompativel(parFormal.getTipo(), tipoExpressao))
			throw new SemanticError("Tipo da expressão não corresponde ao tipo do parâmetro");
		
		if(parFormal.getTipoPassagem() == TipoPassagemParametro.REFERENCIA)
			if(!parametroAtualPodeSerReferencia)
				throw new SemanticError("Parâmetros de referência devem ser variáveis ou parâmetros");
	}

	private void acao142(Token token) throws SemanticError{
		if (idAtual instanceof IdentificadorMetodo){
			idMetodoChamado = (IdentificadorMetodo) idAtual;
			if(idMetodoChamado.getTipo() == null){
				if(idMetodoChamado.getParametros().size() == 0){
					//Geração de código para chamada de método
				} else {
					throw new SemanticError("Erro na quantidade de parâmetros (esperava-se 0)", token.getPosition());
				}
			} else {
				throw new SemanticError("Esperava-se método sem tipo", token.getPosition());
			}
		} else {
			throw new SemanticError(idAtual.getNome() + " deveria ser um método", token.getPosition());
		}
	}

	private void acao141(Token token) throws SemanticError {
		try{
		idAtual = tabela.get(token.getLexeme(), nivelAtual);
		if (idAtual instanceof IdentificadorVariavelCampoRegistro) {
			if (regAtual.getListaCampos().contains(idAtual)) {
				tipoLadoEsquerdo = ((IdentificadorVariavel) idAtual).getTipo();
			} else {
				throw new SemanticError(token.getLexeme()
						+ " não é campo do registro atual", token.getPosition());
			}
		} else {
			throw new SemanticError("Esperava-se um campo de registro",
					token.getPosition());
		}
		}catch(IdentificadorNaoDefinidoException ex){
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
	}

	private void acao140(Token token) throws SemanticError {
		if (idAtual instanceof IdentificadorVariavel) {
			if (idAtual instanceof IdentificadorVariavelRegistro) {
				regAtual = (IdentificadorVariavelRegistro) idAtual;
			} else {
				throw new SemanticError(
						"Apenas registros podem ser qualificados",
						token.getPosition());
			}
		} else {
			throw new SemanticError("Variável esperada", token.getPosition());
		}
	}

	private void acao139() throws SemanticError {
		int numeroEsperado = idMetodoChamado.getParametros().size();
		if(numeroParametrosAtuais != numeroEsperado)
			throw new SemanticError("Número de parâmetros atuais deveria ser " 
					+ numeroEsperado);
	}
	
	private void acao138() throws SemanticError {
		numeroParametrosAtuais = 1;
		contextoExpressao = ContextoExpressao.PARAMETROS_ATUAIS;
		
		verificarParametro();
		
		parametroAtualPodeSerReferencia = true;
	}

	private void acao137() throws SemanticError {
		if (idAtual instanceof IdentificadorMetodo) {
			if (((IdentificadorMetodo) idAtual).getTipo() != null)
				throw new SemanticError("Método sem tipo esperado");
		} else {
			throw new SemanticError("Identificador de método esperado");
		}
		
		idMetodoChamado = (IdentificadorMetodo) idAtual;
		parametroAtualPodeSerReferencia = true;
	}

	private void acao136() throws SemanticError {
		switch (tipoVariavelIndexada) {
		case CADEIA:
			if (tipoExpressao != Tipo.INTEIRO)
				throw new SemanticError("Índice deveria ser inteiro");
			tipoLadoEsquerdo = Tipo.CARACTERE;
			break;
		case VETOR:
			IdentificadorVariavelVetor idVetor = (IdentificadorVariavelVetor) idAtual;
			if (tipoExpressao != idVetor.getTipoIndice())
				throw new SemanticError("Tipo de índice inválido");
			tipoLadoEsquerdo = idVetor.getTipoElementos();
			indexandoVetorParametro = false;
			break;
		default:
			break;
		}
	}

	private void acao135() throws SemanticError {
		if (idAtual instanceof IdentificadorVariavel) {
			if (idAtual instanceof IdentificadorVariavelCadeia)
				tipoVariavelIndexada = Tipo.CADEIA;
			else if (idAtual instanceof IdentificadorVariavelVetor)
				tipoVariavelIndexada = Tipo.VETOR;
			else
				throw new SemanticError(
						"Apenas vetores e cadeias podem ser indexados");
		} else {
			throw new SemanticError("Variável esperada");
		}
		
		if(tipoVariavelIndexada == Tipo.VETOR)
			indexandoVetorParametro = true;
	}

	private void acao134() throws SemanticError {
		if (!Tipo.isCompativel(tipoLadoEsquerdo, tipoExpressao))
			throw new SemanticError("Tipos incompatíveis");

		// Gerar Código
	}

	private void acao133() throws SemanticError {
		if (!(idAtual instanceof IdentificadorVariavel || idAtual instanceof IdentificadorParametro))
			throw new SemanticError("Esperado variável ou parâmetro");

		if (idAtual instanceof IdentificadorVariavelVetor)
			throw new SemanticError("Vetores devem ser indexados");

		if (idAtual instanceof IdentificadorVariavelRegistro)
			throw new SemanticError("Registros devem ser qualificados");

		tipoLadoEsquerdo = idAtual instanceof IdentificadorVariavel ? ((IdentificadorVariavel) idAtual)
				.getTipo() : ((IdentificadorParametro) idAtual).getTipo();
	}

	private void acao132() throws SemanticError {
		if (pilhaMetodosAtuais.peek().getTipo() == null)
			throw new SemanticError(
					"\"Retorne\" só pode ser utilizado em métodos com tipo");

		if (!Tipo.isCompativel(pilhaMetodosAtuais.peek().getTipo(), tipoExpressao))
			throw new SemanticError(
					"Tipo da expressão diferente do tipo do método");

		retornoDeclarado = true;
		// Gerar código
	}

	private void acao131() throws SemanticError {
		contextoExpressao = ContextoExpressao.IMPRESSAO;
		if (!Tipo.isImprimivel(tipoExpressao))
			throw new SemanticError("Tipo inválido para impressão");

		// Gerar código
	}

	private void acao130() {
		leVar = true;
	}

	private void acao129() throws SemanticError {
		if (tipoExpressao != Tipo.BOOLEANO && tipoExpressao != Tipo.INTEIRO)
			throw new SemanticError("Tipo inválido de expressão");

		// Gerar código
	}

	private void acao128(Token token) throws SemanticError {
		try {
			idAtual = tabela.get(token.getLexeme(), nivelAtual);
			
			if(idAtual instanceof IdentificadorConstante && !indexandoVetorParametro)
				parametroAtualPodeSerReferencia = false;
			
			if(idAtual instanceof IdentificadorVariavelCampoRegistro)
				throw new SemanticError("Identificadores de campo de registro só podem ser usados se qualificados");
		} catch (IdentificadorNaoDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao127(Token token) throws SemanticError {
		try {
			Identificador id = tabela.get(token.getLexeme(), nivelAtual);
			if (!(id instanceof IdentificadorConstante))
				throw new SemanticError(
						"Esperava-se um identificador de constante",
						token.getPosition());

			tipoConstante = ((IdentificadorConstante) id).getTipo();
			valorConstante = ((IdentificadorConstante) id).getValor();
		} catch (IdentificadorNaoDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao126() {
		analisandoRegistro = false;
		tipoAtual = Tipo.REGISTRO;
	}

	private void acao125() {
		listaIdsCamposRegistro = new ArrayList<>();
		analisandoRegistro = true;
	}

	private void acao124() {
		tipoElementos = tipoAtual;
		tipoAtual = Tipo.VETOR;
	}

	private void acao123() throws SemanticError {
		if (tipoLimiteInferior != tipoConstante)
			throw new SemanticError(
					"Constantes de intervalo de tipos diferentes");

		int valorLimiteSuperior = tipoConstante == Tipo.INTEIRO ? Integer
				.parseInt(valorConstante) : valorConstante.charAt(0);

		if (valorLimiteSuperior <= valorLimiteInferior)
			throw new SemanticError(
					"Limite superior menor ou igual ao limite inferior do vetor");
	}

	private void acao122() throws SemanticError {
		if (tipoConstante != Tipo.INTEIRO && tipoConstante != Tipo.CARACTERE)
			throw new SemanticError(
					"Esperava-se uma constante inteira ou caractere");

		tipoLimiteInferior = tipoConstante;
		valorLimiteInferior = tipoConstante == Tipo.INTEIRO ? Integer
				.parseInt(valorConstante) : valorConstante.charAt(0);
	}

	private void acao121() throws SemanticError {
		if (tipoConstante != Tipo.INTEIRO)
			throw new SemanticError("Esperava-se uma constante inteira");

		if (Integer.parseInt(valorConstante) > 255)
			throw new SemanticError(
					"Tamanho da cadeia maior que o permitido (255)");

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
		try {
			Identificador idParametro = new Identificador(token.getLexeme());
			tabela.add(idParametro, nivelAtual);

			listaParametros.add(idParametro);
		} catch (IdentificadorJaDefinidoException ex) {
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}
	}

	private void acao114Declaracao(Token token) throws SemanticError {
		try {
			Identificador idVariavel = new Identificador(token.getLexeme());
			tabela.add(idVariavel, nivelAtual);

			if (analisandoRegistro)
				listaIdsCamposRegistroTemp.add(idVariavel);
			else
				listaIdsVariaveis.add(idVariavel);

		} catch (IdentificadorJaDefinidoException ex) {
			throw new SemanticError(ex.getMessage(), token.getPosition());
		}

	}

	private void acao113() {
		tipoMetodo = null;
	}

	private void acao112() {
		tipoMetodo = tipoAtual;
	}

	private void acao111() throws SemanticError {
		try{
			IdentificadorMetodo idMetodo = pilhaMetodosAtuais.peek();
			for(Identificador id : listaParametros){
				IdentificadorParametro idParametro = completarIdParametro(id);
				idMetodo.getParametros().add(idParametro);
				tabela.override(idParametro, nivelAtual);
			}
			listaParametros = new ArrayList<>();
		}catch(IdentificadorJaDefinidoException ex){
			throw new SemanticError(ex.getMessage());
		}
	}

	private IdentificadorParametro completarIdParametro(Identificador id) {
		return new IdentificadorParametro(id.getNome(), deslocamento++, 
				tipoAtual, metodoDePassagemDeParametro);
	}

	private void acao110() {
		contextoListaIds = ContextoListaIds.PARAMETROS;
	}

	private void acao108() {
		IdentificadorMetodo id = (IdentificadorMetodo) idAtual;
		id.setTipo(tipoMetodo);
	}

	private void acao107(Token token) {
		// TODO Verificar se necesário

	}

	private void acao109() throws SemanticError {
		IdentificadorMetodo idMetodo = pilhaMetodosAtuais.pop();
		if(idMetodo.getTipo() != null && !retornoDeclarado)
			throw new SemanticError("Métodos com tipo devem possuir pelo menos um comando de retorno");
		
		retornoDeclarado = false;
		tabela.clear(nivelAtual);
		nivelAtual--;
	}

	private void acao106(Token token) throws SemanticError {
		try {
			listaParametros = new ArrayList<>();
			idAtual = new IdentificadorMetodo(token.getLexeme(), 0, null);
			tabela.add(idAtual, nivelAtual);
			nivelAtual++;
			pilhaMetodosAtuais.push((IdentificadorMetodo) idAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao105() throws SemanticError {
		try {
			List<Identificador> listaIds = analisandoRegistro ?
					listaIdsCamposRegistroTemp : listaIdsVariaveis;
			
			for (Identificador id : listaIds){
				IdentificadorVariavel idVar = completarIdVariavel(id);
				
				if(analisandoRegistro)
					listaIdsCamposRegistro.add((IdentificadorVariavelCampoRegistro)idVar);
				
				tabela.override(idVar, nivelAtual);
			}
			
		} catch (IdentificadorJaDefinidoException | IdentificadorNaoDefinidoException e) {
			throw new SemanticError(e.getMessage());
		}
	}

	private IdentificadorVariavel completarIdVariavel(Identificador id)
			throws SemanticError, IdentificadorNaoDefinidoException {
		if(analisandoRegistro)
			return new IdentificadorVariavelCampoRegistro(id.getNome(),
					deslocamento++, tipoAtual);
		
		switch (tipoAtual) {
		case VETOR:
			return completarIdVariavelVetor(id);
		case CADEIA:
			return completarIdVariavelCadeia(id);
		case REGISTRO:
			return completarIdVariavelRegistro(id);
		default:
			return new IdentificadorVariavelTipoPredefinido(id.getNome(),
					deslocamento++, tipoAtual);
		}
	}

	private IdentificadorVariavelRegistro completarIdVariavelRegistro(
			Identificador id) throws IdentificadorNaoDefinidoException {
		int deslocamentoRegistro = deslocamento;
		deslocamento += listaIdsCamposRegistro.size();
			
		return new IdentificadorVariavelRegistro(id.getNome(),
				deslocamentoRegistro, listaIdsCamposRegistro);
	}

	private IdentificadorVariavelCadeia completarIdVariavelCadeia(
			Identificador id) {
		return new IdentificadorVariavelCadeia(id.getNome(), deslocamento++,
				valorConstante.length());
	}

	private IdentificadorVariavelVetor completarIdVariavelVetor(Identificador id)
			throws SemanticError {
		int limiteSuperior = tipoConstante == Tipo.INTEIRO ?
				Integer.parseInt(valorConstante) :
				valorConstante.charAt(0);
		int tamanho = limiteSuperior - valorLimiteInferior + 1;
		int deslocamentoVetor = deslocamento;
		deslocamento += tamanho;
		return new IdentificadorVariavelVetor(id.getNome(), deslocamentoVetor,
				tipoElementos, tipoLimiteInferior, valorLimiteInferior,
				limiteSuperior);
	}

	private void acao104() {
		if(!analisandoRegistro)
			listaIdsVariaveis = new ArrayList<>();
		else
			listaIdsCamposRegistroTemp = new ArrayList<>();
			
		contextoListaIds = ContextoListaIds.DECLARACAO;
	}

	private void acao101(Token token) throws SemanticError {
		try {
			String nomePrograma = token.getLexeme();
			IdentificadorPrograma idPrograma = new IdentificadorPrograma(
					nomePrograma);
			tabela.add(idPrograma, nivelAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao102(Token token) throws SemanticError {
		try {
			String nomeConstante = token.getLexeme();
			idAtual = new IdentificadorConstante(nomeConstante, null, null);
			tabela.add(idAtual, nivelAtual);
		} catch (IdentificadorJaDefinidoException e) {
			throw new SemanticError(e.getMessage(), token.getPosition());
		}
	}

	private void acao103() throws SemanticError {
		IdentificadorConstante id = (IdentificadorConstante) idAtual;
		id.setTipo(tipoConstante);
		id.setValor(valorConstante);
		idAtual = null;
	}

}
