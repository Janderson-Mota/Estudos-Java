package estruturaFor;

import java.util.Scanner;

public class for_Estrutura {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int I = 0;
		int somaDeNumeros = 0;
		
		for ( I = 0; I < N; I++) {
			I = sc.nextInt();
			somaDeNumeros = somaDeNumeros + I;
			System.out.println(somaDeNumeros);
		}

	}

}
