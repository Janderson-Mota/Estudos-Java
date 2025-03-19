package sistemaUsuario;

import java.util.Locale;
import java.util.Scanner;
import sistemaAdiministrador.administrador;

public class Usuario {

	public static void main(String[] args) {

		//Criação de objetos uteis no programa
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//linhas de declaração
		System.out.print("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer algum deposito (s/n)? ");
		char verificacaoDeposito = sc.next().charAt(0);

		double deposito = 0.0;

		if (verificacaoDeposito == 's') {
			System.out.print("Digite um valor inicial para deposito: ");
			deposito = sc.nextDouble();
		}

		//Instanciamento
		administrador banco = new administrador(numeroConta, nome, deposito);
		System.out.println("  ");
		System.out.println("Dados da Conta: ");
		System.out.println("Numero da conta: " + banco.getNumeroConta() + ", " + "Nome: " + banco.getNome() + ", "
				+ "Saldo da conta: R$ " + banco.getDeposito());

		// Adicionar saldo
		System.out.println("  ");
		System.out.print("Digite um valor que para adicionar na sua conta: R$ ");
		double depositar = sc.nextDouble();
		banco.acrescentar(depositar);
		System.out.println("Dados da Conta: ");
		System.out.println("Numero da conta: " + banco.getNumeroConta() + ", " + "Nome: " + banco.getNome() + ", "
				+ "Saldo da conta: R$ " + banco.getDeposito());

		// Diminuir saldo
		System.out.println("  ");
		System.out.print("Digite um valor que para sacar da sua conta: R$ ");
		double retirada = sc.nextDouble();
		banco.diminuir(retirada);
		
		// taxa
		final double taxa = 5.00;
		banco.taxa(taxa);
		System.out.println("Dados da Conta: ");
		System.out.println("Numero da conta: " + banco.getNumeroConta() + ", " + "Nome: " + banco.getNome() + ", "
				+ "Saldo da conta: R$ " + banco.getDeposito());

		sc.close();

	}

}
