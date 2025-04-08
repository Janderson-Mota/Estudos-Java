package pacoteCliente;

import java.util.Scanner;
import admBiblioteca.Biblioteca;
import admUsuario.Cadastro;
import pacoteAdministrador.biblioteca;

public class Cliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int encerrar = 1;

		System.out.println("Bem vindo a nossa biblioteca! Para começarmos vou precisar de algumas informações suas.");

		System.out.println("Digite seu nome: ");
		String nome = sc.next();

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();

		String genero = "";
		System.out.println("Digite seu sexo (M/F): ");
		char sexo = sc.next().charAt(0);

		// Verificação do sexo
		if (sexo == 'F' || sexo == 'f') {
			genero = "feminino";
		} else if (sexo == 'M' || sexo == 'm') {
			genero = "Masculinho";
		}
		// Fim verificação do sexo

		Cadastro cliente = new Cadastro(nome, genero, idade);

		if (encerrar == 1 && idade >= 12) {	
			
		} else {
			System.out.println("O programa está encerrado!");
		}

		if (encerrar == 0) {
			System.out.println("O programa está encerrado!");
		}

		sc.close();
	}

}
