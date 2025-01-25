package edu.Janderson.classesOperadores;

import java.util.Date;

public class Java_Operadores_1 {

    /**
     * @param args
     */
    @SuppressWarnings("unused")

    public static void main(String[] args) {

        // Atribuição a variaveis e constantes
        String nome = "Janderson";
        int idade = 18;
        double peso = 66.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Operadores Matemáticos
        double soma = 10.5 + 15.8;
        int subtracao = 100 - 82;
        int multiplicacao = 20 * 5;
        int divisao = 15 / 5;
        int modulo = 18 % 3;
        double resultado = (10 * 8) + (20 / 5);

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        // qual o resultado das expressoes abaixo?
        String concatenacao;

        concatenacao = 1 + 1 + 1 + "1"; // = 31
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1; // = 1111
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1"; // = 1111
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1; // = 1111
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1); // = 13

        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        // // classe Operadores.java
        // int a, b;

        // a = 5;
        // b = 6;

        // /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";
        // */

        // //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL
        // TERNÁRIO
        // String resultado = (a==b) ? "verdadeiro" : "false";

        // System.out.println(valor);

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");
    }
}