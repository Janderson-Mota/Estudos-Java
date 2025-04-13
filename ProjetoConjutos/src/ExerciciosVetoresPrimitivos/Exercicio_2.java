package ExerciciosVetoresPrimitivos;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você irá digitar? R. ");
		int n = sc.nextInt();
		System.out.println();

		double valores = 0.0, soma = 0.0, media = 0.0;

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();

			soma += vetor[i];
			media = soma / vetor.length;
		}

		System.out.println();
		System.out.print("Valores digitados: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}

		System.out.println();
		System.out.printf("A soma dos números é: %.2f%n", soma);
		System.out.printf("A média é: %.2f%n", media);

		sc.close();
	}

}
