package br.edu.ufsc.compilador.analisadores;

public class Sintatico implements Constants, ParserConstants
{
	private Token currentToken;
    private Token previousToken;
    private Lexico scanner;
    
    /*A parte semântica foi gerada automaticamente pelo GALS,
      uma vez que isso não será necessário na primeira entrega,
      eu comentei todas as partes em que aparecia.
      Att. Gabriel*/
    
    //private Semantico semanticAnalyser;

    //public void parse(Lexico scanner, Semantico semanticAnalyser) throws AnalysisError
    public void parse(Lexico scanner) throws AnalysisError
    {
        this.scanner = scanner;
       //this.semanticAnalyser = semanticAnalyser;

        currentToken = scanner.nextToken();
        if (currentToken == null)
            currentToken = new Token(DOLLAR, "$", 0);

        programa();

        if (currentToken.getId() != DOLLAR)
            throw new SyntaticError(PARSER_ERROR[DOLLAR], currentToken.getPosition());
    }

    private void match(int token) throws AnalysisError
    {
        if (currentToken.getId() == token)
        {
            previousToken = currentToken;
            currentToken = scanner.nextToken();
            if (currentToken == null)
            {
                int pos = 0;
                if (previousToken != null)
                    pos = previousToken.getPosition()+previousToken.getLexeme().length();

                currentToken = new Token(DOLLAR, "$", pos);
            }
        }
        else
            throw new SyntaticError(PARSER_ERROR[token], currentToken.getPosition());
    }

    private void programa() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 26: // programa
                match(26); // programa
                match(2); // id
                match(34); // ";"
                bloco();
                match(36); // "."
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[56], currentToken.getPosition());
        }
    }

    private void bloco() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 6: // var
            case 27: // const
            case 28: // metodo
            case 54: // "{"
                dcl_const();
                dcl_var();
                dcl_metodos();
                match(54); // "{"
                lista_com();
                match(55); // "}"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[57], currentToken.getPosition());
        }
    }

    private void dcl_const() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 6: // var
            case 28: // metodo
            case 54: // "{"
                // EPSILON
                break;
            case 27: // const
                match(27); // const
                match(2); // id
                match(39); // "="
                constante();
                match(34); // ";"
                dcl_const();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[58], currentToken.getPosition());
        }
    }

    private void dcl_var() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 6: // var
                match(6); // var
                lid();
                match(48); // ":"
                tipo();
                match(34); // ";"
                dcl_var();
                break;
            case 28: // metodo
            case 54: // "{"
            case 55: // "}"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[59], currentToken.getPosition());
        }
    }

    private void dcl_metodos() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 28: // metodo
                dcl_metodo();
                match(34); // ";"
                dcl_metodos();
                break;
            case 54: // "{"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[60], currentToken.getPosition());
        }
    }

    private void dcl_metodo() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 28: // metodo
                match(28); // metodo
                match(2); // id
                par_formais();
                tipo_metodo();
                match(34); // ";"
                bloco();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[61], currentToken.getPosition());
        }
    }

    private void par_formais() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 34: // ";"
            case 48: // ":"
                // EPSILON
                break;
            case 40: // "("
                match(40); // "("
                mp_par();
                lid();
                match(48); // ":"
                tipo_pre_definido();
                rep_par();
                match(41); // ")"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[62], currentToken.getPosition());
        }
    }

    private void rep_par() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 34: // ";"
                match(34); // ";"
                mp_par();
                lid();
                match(48); // ":"
                tipo_pre_definido();
                rep_par();
                break;
            case 41: // ")"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[63], currentToken.getPosition());
        }
    }

    private void tipo_metodo() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 34: // ";"
                // EPSILON
                break;
            case 48: // ":"
                match(48); // ":"
                tipo_pre_definido();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[64], currentToken.getPosition());
        }
    }

    private void lid() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
                match(2); // id
                rep_lid();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[65], currentToken.getPosition());
        }
    }

    private void rep_lid() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 35: // ","
                match(35); // ","
                lid();
                break;
            case 48: // ":"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[66], currentToken.getPosition());
        }
    }

    private void mp_par() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 29: // ref
                match(29); // ref
                break;
            case 30: // val
                match(30); // val
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[67], currentToken.getPosition());
        }
    }

    private void tipo() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 7: // caracter
            case 9: // inteiro
            case 10: // booleano
            case 23: // real
                tipo_pre_definido();
                break;
            case 8: // cadeia
                match(8); // cadeia
                match(42); // "["
                constante();
                match(43); // "]"
                break;
            case 24: // vetor
                match(24); // vetor
                match(42); // "["
                constante();
                match(50); // ".."
                constante();
                match(43); // "]"
                match(21); // de
                tipo_pre_definido();
                break;
            case 31: // registro
                match(31); // registro
                match(54); // "{"
                dcl_var();
                match(55); // "}"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[68], currentToken.getPosition());
        }
    }

    private void constante() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
                match(2); // id
                break;
            case 3: // num_int
            case 4: // num_real
            case 5: // literal
            case 19: // falso
            case 20: // verdadeiro
                constante_explicita();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[69], currentToken.getPosition());
        }
    }

    private void tipo_pre_definido() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 7: // caracter
                match(7); // caracter
                break;
            case 9: // inteiro
                match(9); // inteiro
                break;
            case 10: // booleano
                match(10); // booleano
                break;
            case 23: // real
                match(23); // real
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[70], currentToken.getPosition());
        }
    }

    private void lista_com() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
            case 11: // se
            case 14: // leia
            case 15: // escreva
            case 25: // enquanto
            case 32: // retorne
            case 34: // ";"
            case 54: // "{"
            case 55: // "}"
                comando();
                rep_lista_com();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[71], currentToken.getPosition());
        }
    }

    private void rep_lista_com() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 34: // ";"
                match(34); // ";"
                comando();
                rep_lista_com();
                break;
            case 55: // "}"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[72], currentToken.getPosition());
        }
    }

    private void comando() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
                match(2); // id
                rcomid();
                break;
            case 11: // se
                match(11); // se
                expressao();
                match(12); // entao
                comando();
                senaoparte();
                break;
            case 13: // senao
            case 34: // ";"
            case 55: // "}"
                // EPSILON
                break;
            case 14: // leia
                match(14); // leia
                match(40); // "("
                var();
                match(41); // ")"
                break;
            case 15: // escreva
                match(15); // escreva
                match(40); // "("
                expressao();
                rep_expr();
                match(41); // ")"
                break;
            case 25: // enquanto
                match(25); // enquanto
                expressao();
                match(22); // faca
                comando();
                break;
            case 32: // retorne
                match(32); // retorne
                expressao();
                break;
            case 54: // "{"
                match(54); // "{"
                lista_com();
                match(55); // "}"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[73], currentToken.getPosition());
        }
    }

    private void senaoparte() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 13: // senao
                match(13); // senao
                comando();
                break;
            case 34: // ";"
            case 55: // "}"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[74], currentToken.getPosition());
        }
    }

    private void rcomid() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 13: // senao
            case 34: // ";"
            case 55: // "}"
                // EPSILON
                break;
            case 36: // "."
                match(36); // "."
                match(2); // id
                break;
            case 40: // "("
                match(40); // "("
                expressao();
                rep_expr();
                match(41); // ")"
                break;
            case 42: // "["
                match(42); // "["
                expressao();
                match(43); // "]"
                match(49); // ":="
                expressao();
                break;
            case 49: // ":="
                match(49); // ":="
                expressao();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[75], currentToken.getPosition());
        }
    }

    private void rep_expr() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 35: // ","
                match(35); // ","
                expressao();
                rep_expr();
                break;
            case 41: // ")"
                // EPSILON
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[76], currentToken.getPosition());
        }
    }

    private void expressao() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
            case 3: // num_int
            case 4: // num_real
            case 5: // literal
            case 18: // nao
            case 19: // falso
            case 20: // verdadeiro
            case 40: // "("
            case 45: // "-"
                expsimp();
                resto_expressao();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[77], currentToken.getPosition());
        }
    }

    private void resto_expressao() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 12: // entao
            case 13: // senao
            case 22: // faca
            case 34: // ";"
            case 35: // ","
            case 41: // ")"
            case 43: // "]"
            case 55: // "}"
                // EPSILON
                break;
            case 37: // ">"
            case 38: // "<"
            case 39: // "="
            case 51: // "<>"
            case 52: // "<="
            case 53: // ">="
                oprel();
                expsimp();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[78], currentToken.getPosition());
        }
    }

    private void oprel() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 37: // ">"
                match(37); // ">"
                break;
            case 38: // "<"
                match(38); // "<"
                break;
            case 39: // "="
                match(39); // "="
                break;
            case 51: // "<>"
                match(51); // "<>"
                break;
            case 52: // "<="
                match(52); // "<="
                break;
            case 53: // ">="
                match(53); // ">="
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[79], currentToken.getPosition());
        }
    }

    private void expsimp() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
            case 3: // num_int
            case 4: // num_real
            case 5: // literal
            case 18: // nao
            case 19: // falso
            case 20: // verdadeiro
            case 40: // "("
            case 45: // "-"
                termo();
                rep_expsimp();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[80], currentToken.getPosition());
        }
    }

    private void rep_expsimp() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 12: // entao
            case 13: // senao
            case 22: // faca
            case 34: // ";"
            case 35: // ","
            case 37: // ">"
            case 38: // "<"
            case 39: // "="
            case 41: // ")"
            case 43: // "]"
            case 51: // "<>"
            case 52: // "<="
            case 53: // ">="
            case 55: // "}"
                // EPSILON
                break;
            case 16: // ou
            case 44: // "+"
            case 45: // "-"
                op_add();
                termo();
                rep_expsimp();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[81], currentToken.getPosition());
        }
    }

    private void op_add() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 16: // ou
                match(16); // ou
                break;
            case 44: // "+"
                match(44); // "+"
                break;
            case 45: // "-"
                match(45); // "-"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[82], currentToken.getPosition());
        }
    }

    private void termo() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
            case 3: // num_int
            case 4: // num_real
            case 5: // literal
            case 18: // nao
            case 19: // falso
            case 20: // verdadeiro
            case 40: // "("
            case 45: // "-"
                fator();
                rep_termo();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[83], currentToken.getPosition());
        }
    }

    private void rep_termo() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 12: // entao
            case 13: // senao
            case 16: // ou
            case 22: // faca
            case 34: // ";"
            case 35: // ","
            case 37: // ">"
            case 38: // "<"
            case 39: // "="
            case 41: // ")"
            case 43: // "]"
            case 44: // "+"
            case 45: // "-"
            case 51: // "<>"
            case 52: // "<="
            case 53: // ">="
            case 55: // "}"
                // EPSILON
                break;
            case 17: // e
            case 33: // div
            case 46: // "*"
            case 47: // "/"
                op_mult();
                fator();
                rep_termo();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[84], currentToken.getPosition());
        }
    }

    private void op_mult() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 17: // e
                match(17); // e
                break;
            case 33: // div
                match(33); // div
                break;
            case 46: // "*"
                match(46); // "*"
                break;
            case 47: // "/"
                match(47); // "/"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[85], currentToken.getPosition());
        }
    }

    private void fator() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
                var();
                break;
            case 3: // num_int
            case 4: // num_real
            case 5: // literal
            case 19: // falso
            case 20: // verdadeiro
                constante_explicita();
                break;
            case 18: // nao
                match(18); // nao
                fator();
                break;
            case 40: // "("
                match(40); // "("
                expressao();
                match(41); // ")"
                break;
            case 45: // "-"
                match(45); // "-"
                fator();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[86], currentToken.getPosition());
        }
    }

    private void var() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 2: // id
                match(2); // id
                rvar();
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[87], currentToken.getPosition());
        }
    }

    private void rvar() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 12: // entao
            case 13: // senao
            case 16: // ou
            case 17: // e
            case 22: // faca
            case 33: // div
            case 34: // ";"
            case 35: // ","
            case 37: // ">"
            case 38: // "<"
            case 39: // "="
            case 41: // ")"
            case 43: // "]"
            case 44: // "+"
            case 45: // "-"
            case 46: // "*"
            case 47: // "/"
            case 51: // "<>"
            case 52: // "<="
            case 53: // ">="
            case 55: // "}"
                // EPSILON
                break;
            case 36: // "."
                match(36); // "."
                match(2); // id
                break;
            case 40: // "("
                match(40); // "("
                expressao();
                rep_expr();
                match(41); // ")"
                break;
            case 42: // "["
                match(42); // "["
                expressao();
                match(43); // "]"
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[88], currentToken.getPosition());
        }
    }

    private void constante_explicita() throws AnalysisError
    {
        switch (currentToken.getId())
        {
            case 3: // num_int
                match(3); // num_int
                break;
            case 4: // num_real
                match(4); // num_real
                break;
            case 5: // literal
                match(5); // literal
                break;
            case 19: // falso
                match(19); // falso
                break;
            case 20: // verdadeiro
                match(20); // verdadeiro
                break;
            default:
                throw new SyntaticError(PARSER_ERROR[89], currentToken.getPosition());
        }
    }

}
