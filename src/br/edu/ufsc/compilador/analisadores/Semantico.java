package br.edu.ufsc.compilador.analisadores;

import br.edu.ufsc.compilador.analisadores.semantico.identificadores.*;
import br.edu.ufsc.compilador.analisadores.semantico.*;

public class Semantico implements Constants
{
	TabelaDeSimbolos tabela = new TabelaDeSimbolos();
	int nivelAtual = 0;
	
    public void executeAction(int action, Token token)	throws SemanticError, IdentificadorJaDefinidoException
    {
    	switch(action)
    	{
    		case 101: System.out.println("ENTROU #101");
    		String nomePrograma = token.getLexeme();
    		IdentificadorPrograma idPrograma = new IdentificadorPrograma(nomePrograma);
    		tabela.add(idPrograma, nivelAtual);
    		System.out.println("FIM #101");
    		break;
    		
    		case 102: System.out.println("ENTROU #102");
    		String nomeConstante = token.getLexeme();
    		IdentificadorConstante idConstante = new IdentificadorConstante(nomeConstante, null, null);
    		tabela.add(idConstante, nivelAtual);
    		//Falta guardar posição na tabela(necessário?)
    		System.out.println("FIM #102");
    		break;
    		
    		case 103: System.out.println("ENTROU #103");
    		//Atualiza os atributos 'null' da constante de #102 na tabela
    		//Eu acredito que basta atualizar 'idConstante'
    		System.out.println("FIM #103");
    		break;
    		
    		default: System.out.println("Ação #"+action+", Token: "+token); 
        }

    }	
}
