package calculadoraMatematica;

import java.util.Locale;
import java.util.Scanner;

import administrador.sistemaInterno;

public class usuario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sistemaInterno calculo = new sistemaInterno();

		System.out.println("Digite um numero de 1 até 5: ");
		System.out.println("1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa! ");
		int codigo = sc.nextInt();

		if (codigo >= 1 && codigo <= 4) {
			while (codigo != 5) {

				if (codigo == 1) {
					System.out.print("Digite um números para fazermos a soma: ");
					calculo.x = sc.nextDouble();
					System.out.print("Digite outro números para fazermos a soma: ");
					calculo.y = sc.nextDouble();

					calculo.soma();
					System.out.println("    ");
					System.out.println("O resultado da soma é: " + calculo.resultado);
					System.out.println("    ");

					if (codigo != 5) {
						System.out.println("Digite um numero de 1 até 5: ");
						System.out.println(
								"1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa! ");
						codigo = sc.nextInt();
					}

				}

				if (codigo == 2) {
					System.out.print("Digite um números para fazermos a subtração: ");
					calculo.x = sc.nextDouble();
					System.out.print("Digite outro números para fazermos a subtração: ");
					calculo.y = sc.nextDouble();

					calculo.subtracao();
					System.out.println("    ");
					System.out.println("O resultado da subtracao é: " + calculo.resultado);
					System.out.println("    ");

					if (codigo != 5) {
						System.out.println("Digite um numero de 1 até 5: ");
						System.out.println(
								"1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa! ");
						codigo = sc.nextInt();
					}

				}

				if (codigo == 3) {
					System.out.print("Digite um números para fazermos a multiplição: ");
					calculo.x = sc.nextDouble();
					System.out.print("Digite outro números para fazermos a multiplição: ");
					calculo.y = sc.nextDouble();

					calculo.multiplicacao();
					System.out.println("    ");
					System.out.println("O resultado da multiplição é: " + calculo.resultado);
					System.out.println("    ");

					if (codigo != 5) {
						System.out.println("Digite um numero de 1 até 5: ");
						System.out.println(
								"1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa! ");
						codigo = sc.nextInt();
					}

				}

				if (codigo == 4) {
					System.out.print("Digite um números para fazermos a divisão: ");
					calculo.x = sc.nextDouble();
					System.out.print("Digite outro números para fazermos a divisão: ");
					calculo.y = sc.nextDouble();

					calculo.divisao();
					System.out.println("    ");
					System.out.println("O resultado da divisão é: " + calculo.resultado);
					System.out.println("    ");

					if (codigo != 5) {
						System.out.println("Digite um numero de 1 até 5: ");
						System.out.println(
								"1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa! ");
						codigo = sc.nextInt();
					}

				}

			}

		} else if (codigo == 5) {
			System.out.println("Programa encerrado pelo cliente!");
		} else {
			System.out.println(
					"O número digitado não corresponde a uma operação fornecida pelo sistema. O programa se encerrará automaticamente.");
		}

		sc.close();
	}

}
