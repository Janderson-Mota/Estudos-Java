package exerciciosWhile;
import java.util.Scanner;

public class while_Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo! Qual é sua senha?");
		int senha = sc.nextInt();
		int senhaQuardada = 2002;
		int tentativas = 1;

		while (senha != senhaQuardada ) {
			tentativas = tentativas + 1; 
			System.out.println(	"Senha Invalida! Dica: Nesse ano o Brasil tinha acabado de ganhar mais uma copa do mundo!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		System.out.println("Você tentou sua senha "+ tentativas + " vezes!");
		sc.close();

	}

}
