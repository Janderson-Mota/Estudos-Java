package estruturaFor;
import java.util.Scanner;

public class exercicio_For1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para terminar a contagem de números impares!");
		int contagemNumero = sc.nextInt();;
		int numeroImpar;
		int soma = 1;
		
		for(numeroImpar = 1; numeroImpar < contagemNumero; numeroImpar++) {
			       System.out.println(soma);
			       soma = soma + 2;
		}
		sc.close();
	}
}
