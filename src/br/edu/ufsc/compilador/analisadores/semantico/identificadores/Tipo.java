package br.edu.ufsc.compilador.analisadores.semantico.identificadores;


/**
 * Enumerador de tipos da LSI-142
 * @author André
 */
public enum Tipo {
	INTEIRO,
	REAL,
	CARACTERE,
	CADEIA,
	VETOR,
	BOOLEANO, 
	REGISTRO;
	
	public static boolean isPreDefinido(Tipo tipo)
	{
		switch(tipo){
			case INTEIRO:
			case REAL:
			case CARACTERE:
			case BOOLEANO:
				return true;
			default: 
				return false;
		}
	}
	
	public static boolean isImprimivel(Tipo tipo)
	{
		switch(tipo){
			case INTEIRO:
			case REAL:
			case CARACTERE:
			case CADEIA:
				return true;
			default: 
				return false;
		}
	}

	public static boolean isCompativel(Tipo tipo1, Tipo tipo2) {
		if(tipo1 != tipo2){
			return (tipo1 == REAL && tipo2 == INTEIRO)
					|| (tipo1 == CADEIA && tipo2 == CARACTERE);
		}
		else
		{
			return true;
		}
	}
}
