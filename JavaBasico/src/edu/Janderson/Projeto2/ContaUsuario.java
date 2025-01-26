package edu.Janderson.Projeto2;
import java.util.Scanner;

@SuppressWarnings("unused")

public class ContaUsuario {

    public static void main(String[] args) {

        int numeroContaCliente;
        String agenciaCliente;
        String nomeCliente;
        double saldoCliente= 1000.95;
     
        
         //Criando objeto scanner
         Scanner Scanner = new Scanner(System.in);
     

     //Nome do cliente
     System.out.println("Seja Bem Vindo a nossa agencia!");
     System.out.println("Para Começarmos nosso atendimento, digite seu nome:");
     nomeCliente =  Scanner.nextLine();
     System.out.println("óla, "+ nomeCliente +"!");

     //Agencia do cliente
     System.out.println("Digite sua agencia:");
     agenciaCliente =  Scanner.nextLine();
     System.out.println("Registrado!");

     //Número da conta do cliente
     System.out.println("Digite o número da sua conta:");
     numeroContaCliente =  Scanner.nextInt();
     System.out.println("Registrado!");

     
     //Declaração final 

     System.out.println("Olá " + nomeCliente +"! Obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaCliente +", conta " + numeroContaCliente + " e seu saldo é R$ " +saldoCliente+ ". Já está disponível para saque.");








   









    }
}