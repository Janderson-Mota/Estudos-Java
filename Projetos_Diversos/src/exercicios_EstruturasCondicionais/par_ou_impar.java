package exercicios_EstruturasCondicionais;
import java.util.Scanner;

public class par_ou_impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numerador;
		
		System.out.println("Escolha um número para verificar se é par ou impar:");
		numerador = sc.nextInt();
		System.out.println("Analizando...");
		
		
		
		if( numerador % 2 == 0) {
		    System.out.println("O número digitado é par! ");
		}
		else {
			System.out.println("O número digitado é impar! ");
		}
		System.out.println("Obrigado por participar!");

	}

}
