package edu.Janderson.Estrutura;
public class Java_classes_2 {

//Segundo código. Introdução a variáveis e métodos.

// Variáveis 
//  Tipo / NomeDaVariavel = atribuicao (opcinal em alguns casos)

String caracteres = "palavras";
int inteiros_numeros = 10;
boolean verdadeiro_falso = true;


// Métodos
// TipoRetorno /  NomeObjetivoNoInfinitivo Parametros(s)

public static void main(String[] args) {

    String primeiroNome = "Janderson ";
    String segundoNome = "Emanuel ";
    String terceiroNome = "Mota ";
    String quartoNome = "Silva";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome, quartoNome);
    System.out.println(nomeCompleto);

    
}

public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome,String quartoNome ) {
    return primeiroNome + segundoNome + terceiroNome + quartoNome;
}






}