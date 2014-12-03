package br.edu.ufsc.compilador.analisadores;

/**
 * @author Gabriel Soares
 * Última atualização 02/12/2014
 */
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
        {  26,   2, 191,  34,  57,  36 },
        {  58,  59,  60,  54,  71,  55 },
        {  27,   2, 192,  39,  69, 193,  34,  58 },
        {   0 },
        {   6, 194,  65,  48,  68, 195,  34,  59 },
        {   0 },
        {  61,  34,  60 },
        {   0 },
        {  28,   2, 196,  62, 197,  64, 198,  34,  57, 199 },
        {  40,  67, 200,  65,  48,  70, 201,  63,  41 },
        {   0 },
        {  34,  67, 200,  65,  48,  70, 201,  63 },
        {   0 },
        {  48,  70, 202 },
        { 203 },
        {   2, 204,  66 },
        {  35,  65 },
        {   0 },
        {  29, 205 },
        {  30, 206 },
        {  70 },
        {   8,  42,  69, 211,  43 },
        {  24,  42,  69, 212,  50,  69, 213,  43,  21,  70, 214 },
        {  31,  54, 215,  59, 216,  55 },
        {   2, 217 },
        {  89 },
        {   9, 207 },
        {  23, 208 },
        {  10, 209 },
        {   7, 210 },
        {  73,  72 },
        {  34,  73,  72 },
        {   0 },
        {   2, 218,  75 },
        {  54,  71,  55 },
        {  11,  77, 219,  12,  73,  74 },
        {  25,  77, 219,  22,  73 },
        {  14,  40, 220,  87,  41 },
        {  15,  40,  77, 221,  76,  41 },
        {  32,  77, 222 },
        {   0 },
        {  13,  73 },
        {   0 },
        { 223,  49,  77, 224 },
        {  42, 225,  77, 226,  43,  49,  77, 224 },
        {  40, 227,  77, 228,  76,  41, 229 },
        { 230,  36,   2, 231,  49,  77, 224 },
        { 232 },
        {  35,  77, 233,  76 },
        {   0 },
        {  80, 234,  78 },
        {  79,  80, 235 },
        {   0 },
        {  39, 236 },
        {  38, 237 },
        {  37, 238 },
        {  53, 239 },
        {  52, 240 },
        {  51, 241 },
        {  83, 242,  81 },
        {  82, 243,  83, 244,  81 },
        {   0 },
        {  44, 245 },
        {  45, 246 },
        {  16, 247 },
        {  86, 248,  84 },
        {  85, 249,  86, 250,  84 },
        {   0 },
        {  46, 251 },
        {  47, 252 },
        {  17, 253 },
        {  33, 254 },
        {  18,  86, 255 },
        {  45,  86, 256 },
        {  40,  77,  41, 257 },
        {  87, 258 },
        {  89, 259 },
        {   2, 218,  88 },
        {  40, 260,  77, 228,  76,  41, 261 },
        {  42, 225,  77, 262,  43 },
        { 230,  36,   2, 263 },
        { 264 },
        {   3, 265 },
        {   4, 266 },
        {  19, 267 },
        {  20, 268 },
        {   5, 269 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado id",
        "Era esperado numero inteiro",
        "Era esperado numero real",
        "Era esperado literal",
        "Era esperado var",
        "Era esperado caracter",
        "Era esperado cadeia",
        "Era esperado inteiro",
        "Era esperado booleano",
        "Era esperado se",
        "Era esperado entao",
        "Era esperado senao",
        "Era esperado leia",
        "Era esperado escreva",
        "Era esperado ou",
        "Era esperado e",
        "Era esperado nao",
        "Era esperado falso",
        "Era esperado verdadeiro",
        "Era esperado de",
        "Era esperado faca",
        "Era esperado real",
        "Era esperado vetor",
        "Era esperado enquanto",
        "Era esperado programa",
        "Era esperado const",
        "Era esperado metodo",
        "Era esperado ref",
        "Era esperado val",
        "Era esperado registro",
        "Era esperado retorne",
        "Era esperado div",
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
        "Era esperado \" .. \"",
        "Era esperado \"<>\"",
        "Era esperado \"<=\"",
        "Era esperado \">=\"",
        "Era esperado \"{\"",
        "Era esperado \"}\"",
        /*"<programa> inválido",*/"Era esperado \"programa\"",
        /*"<bloco> inválido",*/"Era esperado \"const\" OU \"var\" OU \"metodo\" OU \"{\"",
        /*"<dcl_const> inválido",*/"Era esperado \"const\" OU \"var\" OU \"metodo\" OU \"{\"",
        /*"<dcl_var> inválido",*/"Era esperado \"var\" OU \"metodo\" OU \"{\" OU \"}\"",
        /*"<dcl_metodos> inválido",*/"Era esperado \"metodo\" OU \"{\"",
        /*"<dcl_metodo> inválido",*/"Era esperado \"metodo\"",
        /*"<par_formais> inválido",*/"Era esperado \"(\" OU \";\" OU \":\"",
        /*"<rep_par> inválido",*/"Era esperado \";\" OU \")\"",
        /*"<tipo_metodo> inválido",*/"Era esperado \":\" OU \";\"",
        /*"<lid> inválido",*/"Era esperado id",
        /*"<rep_lid> inválido",*/"Era esperado \",\" OU \":\"",
        /*"<mp_par> inválido",*/"Era esperado \"ref\" OU \"val\"",
        /*"<tipo> inválido",*/"Era esperado \"caracter\" OU \"cadeia\" OU \"inteiro\" OU \"booleano\" OU \"real\" OU \"vetor\" OU \"registro\"",
        /*"<constante> inválido",*/"Era esperado id OU número inteiro OU número real OU \"falso\" OU \"verdadeiro\" OU literal",
        /*"<tipo_pre_definido> inválido",*/"Era esperado \"caracter\" OU \"inteiro\" OU \"booleano\" OU \"real\"",
        /*"<lista_com> inválido",*/"Era esperado id OU \"se\" OU \"leia\" OU \"escreva\" OU \"enquanto\" OU \"retorne\" OU \";\" OU \"{\" OU \"}\"",
        /*"<rep_lista_com> inválido",*/"Era esperado \";\" OU \"}\"",
        /*"<comando> inválido",*/"Era esperado id OU \"se\" OU \"leia\" OU \"escreva\" OU \"enquanto\" OU \"retorne\" OU \"{\" OU \"senao\" OU \";\" OU \"}\"",
        /*"<senaoparte> inválido",*/"Era esperado \"senao\" OU \";\" OU \"}\"",
        /*"<rcomid> inválido",*/"Era esperado \".\" OU \"(\" OU \"[\" OU \":=\" OU \"senao\" OU \";\" OU \"}\"",
        /*"<rep_expr> inválido",*/"Era esperado \",\" OU \")\"",
        /*"<expressao> inválido",*/"Era esperado id OU número inteiro OU número real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<resto_expressao> inválido",*/"Era esperado \">\" OU \"<\" OU \"=\" OU \"<>\" OU \"<=\" OU \">=\" OU \"entao\" OU \"senao\" OU \"faca\" OU \";\" OU \",\" OU \")\" OU \"]\" OU \"}\"",
        /*"<oprel> inválido",*/"Era esperado \">\" OU \"<\" OU \"=\" OU \"<>\" OU \"<=\" OU \">=\"",
        /*"<expsimp> inválido",*/"Era esperado id OU número inteiro OU número real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<rep_expsimp> inválido",*/"Era esperado \"ou\" OU \"+\" OU \"-\" OU \"entao\" OU \"senao\" OU \"faca\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<op_add> inválido",*/"Era esperado \"ou\" OU \"+\" OU \"-\"",
        /*"<termo> inválido",*/"Era esperado id OU número inteiro OU número real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<rep_termo> inválido",*/"Era esperado \"e\" OU \"div\" OU \"*\" OU \"/\" OU \"entao\" OU \"senao\" OU \"ou\" OU \"faca\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"+\" OU \"-\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<op_mult> inválido",*/"Era esperado \"e\" OU \"div\" OU \"*\" OU \"/\"",
        /*"<fator> inválido",*/"Era esperado id OU número inteiro OU número real OU literal OU \"nao\" OU \"falso\" OU \"verdadeiro\" OU \"(\" OU \"-\"",
        /*"<var> inválido",*/"Era esperado id",
        /*"<rvar> inválido",*/"Era esperado \".\" OU \"(\" OU \"[\" OU \"entao\" OU \"senao\" OU \"ou\" OU \"e\" OU \"faca\" OU \"div\" OU \";\" OU \",\" OU \">\" OU \"<\" OU \"=\" OU \")\" OU \"]\" OU \"+\" OU \"-\" OU \"*\" OU \"/\" OU \"<>\" OU \"<=\" OU \">=\" OU \"}\"",
        /*"<constante_explicita> inválido"*/"Era esperado número inteiro OU número real OU \"falso\" OU \"verdadeiro\" OU literal",
    };
}
