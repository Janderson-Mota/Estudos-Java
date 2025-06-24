package IntroducaoExcesoes;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class aula1_TryCatch {

	public static void main(String[] args) {

		metodo1();
		System.out.println("Fim do programa.");

	}

	public static void metodo1() {

		System.out.println("**** Metodo 1 Start ****");

		metodo2();

		System.out.println("**** Metodo 1 Fim ****");

	}

	public static void metodo2() {

		System.out.println("**** Metodo 2 Start ****");

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida!");
			//e.printStackTrace();
			//sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}

		System.out.println("**** Metodo 2 Fim ****");
		sc.close();
	}
}
