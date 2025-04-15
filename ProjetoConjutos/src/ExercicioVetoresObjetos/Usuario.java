 package ExercicioVetoresObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = "";
		String nomeMaior = "";

		int idade = 0;
		int idadeMaior = 0;

		System.out.print("Digite quantas pessoas você irá digitar: ");
		int n = sc.nextInt();
		Pessoas[] pessoas = new Pessoas[n];

		for (int i = 0; i < pessoas.length; i++) {

			System.out.println();
			System.out.println("Dados da " + (i + 1) + "º pessoa.");
			System.out.print("Digite um nome:");
			nome = sc.next();
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			System.out.println();

			pessoas[i] = new Pessoas(nome, idade);

			if (idadeMaior < idade) {
				idadeMaior = idade;
				nomeMaior = nome;
			}
		}

		System.out.println("A pessoa mais velha é a(o) " + nomeMaior + " com " + idadeMaior + " anos.");

		sc.close();

	}

}
