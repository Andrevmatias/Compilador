package br.edu.ufsc.compilador.analisadores;

public interface ParserConstants
{
    int START_SYMBOL = 56;

    int FIRST_NON_TERMINAL    = 56;
    int FIRST_SEMANTIC_ACTION = 90;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1, -1 },
        { -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1 },
        { -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  5 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  7, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 20, 21, 20, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, 22, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 24, 25, 25, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 29, -1, 26, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, 30, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, 30 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32 },
        { -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, 40, 37, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, 39, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 40 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, 46, -1, -1, -1, 45, -1, 44, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, 47 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 50, 50, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, 51, 51, 51, -1, 52, -1, 52, -1, -1, -1, -1, -1, -1, -1, 51, 51, 51, -1, 52 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 54, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, 57, 56, -1, -1 },
        { -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, 61, -1, -1, 60, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, 61, -1, 61, 61, 61, -1, 61, -1, 61, 60, 60, -1, -1, -1, -1, -1, 61, 61, 61, -1, 61 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 65, 65, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1, 67, 66, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, 67, 67, -1, 67, 67, 67, -1, 67, -1, 67, 67, 67, 66, 66, -1, -1, -1, 67, 67, 67, -1, 67 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 69, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 75, 76, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, 81, -1, -1, 81, 81, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, 81, 81, 80, 81, 81, 81, 78, 81, 79, 81, 81, 81, 81, 81, -1, -1, -1, 81, 81, 81, -1, 81 },
        { -1, -1, 82, 83, 86, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 84, 85, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 26,  2, 34, 57, 36 },
        { 58, 59, 60, 54, 71, 55 },
        { 27,  2, 39, 69, 34, 58 },
        {  0 },
        {  6, 65, 48, 68, 34, 59 },
        {  0 },
        { 61, 34, 60 },
        {  0 },
        { 28,  2, 62, 64, 34, 57 },
        { 40, 67, 65, 48, 70, 63, 41 },
        {  0 },
        { 34, 67, 65, 48, 70, 63 },
        {  0 },
        { 48, 70 },
        {  0 },
        {  2, 66 },
        { 35, 65 },
        {  0 },
        { 29 },
        { 30 },
        { 70 },
        {  8, 42, 69, 43 },
        { 24, 42, 69, 50, 69, 43, 21, 70 },
        { 31, 54, 59, 55 },
        {  2 },
        { 89 },
        {  9 },
        { 23 },
        { 10 },
        {  7 },
        { 73, 72 },
        { 34, 73, 72 },
        {  0 },
        {  2, 75 },
        { 54, 71, 55 },
        { 11, 77, 12, 73, 74 },
        { 25, 77, 22, 73 },
        { 14, 40, 87, 41 },
        { 15, 40, 77, 76, 41 },
        { 32, 77 },
        {  0 },
        { 13, 73 },
        {  0 },
        { 49, 77 },
        { 42, 77, 43, 49, 77 },
        { 40, 77, 76, 41 },
        { 36,  2 },
        {  0 },
        { 35, 77, 76 },
        {  0 },
        { 80, 78 },
        { 79, 80 },
        {  0 },
        { 39 },
        { 38 },
        { 37 },
        { 53 },
        { 52 },
        { 51 },
        { 83, 81 },
        { 82, 83, 81 },
        {  0 },
        { 44 },
        { 45 },
        { 16 },
        { 86, 84 },
        { 85, 86, 84 },
        {  0 },
        { 46 },
        { 47 },
        { 17 },
        { 33 },
        { 18, 86 },
        { 45, 86 },
        { 40, 77, 41 },
        { 87 },
        { 89 },
        {  2, 88 },
        { 40, 77, 76, 41 },
        { 42, 77, 43 },
        { 36,  2 },
        {  0 },
        {  3 },
        {  4 },
        { 19 },
        { 20 },
        {  5 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado o fim do programa",
        "Era esperado id",
        "Era esperado n�mero inteiro",
        "Era esperado n�mero real",
        "Era esperado literal",
        "Era esperado \"var\"",
        "Era esperado \"caracter\"",
        "Era esperado \"cadeia\"",
        "Era esperado \"inteiro\"",
        "Era esperado \"booleano\"",
        "Era esperado \"se\"",
        "Era esperado \"entao\"",
        "Era esperado \"senao\"",
        "Era esperado \"leia\"",
        "Era esperado \"escreva\"",
        "Era esperado \"ou\"",
        "Era esperado \"e\"",
        "Era esperado \"nao\"",
        "Era esperado \"falso\"",
        "Era esperado \"verdadeiro\"",
        "Era esperado \"de\"",
        "Era esperado \"faca\"",
        "Era esperado \"real\"",
        "Era esperado \"vetor\"",
        "Era esperado \"enquanto\"",
        "Era esperado \"programa\"",
        "Era esperado \"const\"",
        "Era esperado \"metodo\"",
        "Era esperado \"ref\"",
        "Era esperado \"val\"",
        "Era esperado \"registro\"",
        "Era esperado \"retorne\"",
        "Era esperado \"div\"",
        "Era esperado \";\"",
        "Era esperado \",\"",
        "Era esperado \".\"",
        "Era esperado \">\"",
        "Era esperado \"<\"",
        "Era esperado \"=\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \"[\"",
        "Era esperado \"]\"",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado \":\"",
        "Era esperado \":=\"",
        "Era esperado \"..\"",
        "Era esperado \"<>\"",
        "Era esperado \"<=\"",
        "Era esperado \">=\"",
        "Era esperado \"{\"",
        "Era esperado \"}\"",
        /*"<programa> inv�lido",*/"Era esperado \"programa\"",
        /*"<bloco> inv�lido",*/"Era esperado \"const\" OU \"var\" OU \"metodo\" OU \"{\"",
        /*"<dcl_const> inv�lido",*/"Era esperado \"const\" OU \"var\" OU \"metodo\" OU \"{\"",
        /*"<dcl_var> inv�lido",*/"Era esperado \"var\" OU \"metodo\" OU \"{\" OU \"}\"",
        /*"<dcl_metodos> inv�lido",*/"Era esperado \"metodo\" OU \"{\"",
        /*"<dcl_metodo> inv�lido",*/"Era esperado \"metodo\"",
        /*"<par_formais> inv�lido",*/"Era esperado \"(\" OU \";\" OU \":\"",
        /*"<rep_par> inv�lido",*/"Era esperado \";\" OU \")\"",
        /*"<tipo_metodo> inv�lido",*/"Era esperado \":\" OU \";\"",
        /*"<lid> inv�lido",*/"Era esperado id",
        /*"<rep_lid> inv�lido",*/"Era esperado \",\" OU \":\"",
        /*"<mp_par> inv�lido",*/"Era esperado \"ref\" OU \"val\"",
        /*"<tipo> inv�lido",*/"Era esperado \"caracter\" OU \"cadeia\" OU \"inteiro\" OU \"booleano\" OU \"real\" OU \"vetor\" OU \"registro\"",
        /*"<constante> inv�lido",*/"Era esperado id OU n�mero inteiro OU n�mero real OU \"falso\" OU \"verdadeiro\" OU literal",
        /*"<tipo_pre_definido> inv�lido",*/"Era esperado \"caracter\" OU \"inteiro\" OU \"booleano\" OU \"real\"",
        /*"<lista_com> inv�lido",*/"Era esperado id OU \"se\" OU \"leia\" OU \"escreva\" OU \"enquanto\" OU \"retorne\" OU \";\" OU \"{\" OU \"}\"",
        /*"<rep_lista_com> inv�lido",*/"Era esperado \";\" OU \"}\"",
        /*"<comando> inv�lido",*/"Era esperado id OU \"se\" OU \"leia\" OU \"escreva\" OU \"enquanto\" OU \"retorne\" OU \"{\" OU \"senao\" OU \";\" OU \"}\"",
        /*"<senaoparte> inv�lido",*/"Era esperado \"senao\" OU \";\" OU \"}\"",
        /*"<rcomid> inv�lido",*/"Era esperado \".\" OU \"(\" OU \"[\" OU \":=\" OU \"senao\" OU \";\" OU \"}\"",
        /*"<rep_expr> inv�lido",*/"Era esperado \",\" OU \")\"",
        /*"<expressao> inv�lido",*/"Era esperado id OU n�mero inteiro OU n�mero real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<resto_expressao> inv�lido",*/"Era esperado \">\" OU \"<\" OU \"=\" OU \"<>\" OU \"<=\" OU \">=\" OU \"entao\" OU \"senao\" OU \"faca\" OU \";\" OU \",\" OU \")\" OU \"]\" OU \"}\"",
        /*"<oprel> inv�lido",*/"Era esperado \">\" OU \"<\" OU \"=\" OU \"<>\" OU \"<=\" OU \">=\"",
        /*"<expsimp> inv�lido",*/"Era esperado id OU n�mero inteiro OU n�mero real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<rep_expsimp> inv�lido",*/"Era esperado \"ou\" OU \"+\" OU \"-\" OU \"entao\" OU \"senao\" OU \"faca\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<op_add> inv�lido",*/"Era esperado \"ou\" OU \"+\" OU \"-\"",
        /*"<termo> inv�lido",*/"Era esperado id OU n�mero inteiro OU n�mero real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<rep_termo> inv�lido",*/"Era esperado \"e\" OU \"div\" OU \"*\" OU \"/\" OU \"entao\" OU \"senao\" OU \"ou\" OU \"faca\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"+\" OU \"-\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<op_mult> inv�lido",*/"Era esperado \"e\" OU \"div\" OU \"*\" OU \"/\"",
        /*"<fator> inv�lido",*/"Era esperado id OU n�mero inteiro OU n�mero real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<var> inv�lido",*/"Era esperado id",
        /*"<rvar> inv�lido",*/"Era esperado \".\" OU \"(\" OU \"[\" OU \"entao\" OU \"senao\" OU \"ou\" OU \"e\" OU \"faca\" OU \"div\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"+\" OU \"-\" OU \"*\" OU \"/\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<constante_explicita> inv�lido"*/"Era esperado n�mero inteiro OU n�mero real OU \"falso\" OU \"verdadeiro\" OU literal"
    };
}
