package exercicios_EstruturasCondicionais;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int verificarNumero;
		
		System.out.println("Escolha um número:");
		verificarNumero = sc.nextInt();
		System.out.println("Analizando...");
		
		if( verificarNumero < 0) {
		    System.out.println("O número digitado é negativo! ");
		}
		else {
			System.out.println("O número digitado é positivo! ");
		}
		System.out.println("Obrigado por participar!");
	
		
	}

}
