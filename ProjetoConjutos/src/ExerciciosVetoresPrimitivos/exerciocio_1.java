package ExerciciosVetoresPrimitivos;

import java.util.Scanner;

public class exerciocio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você irá digitar? R. ");
		int n = sc.nextInt();
		int[] vetor = new int [n];
		System.out.println();
	
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
				
			}
		
		System.out.println();
		System.out.println("Números negativos:");
		
		for (int i=0; i<n; i++) {
			
	        if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
		}
		
		
		
		
		sc.close();

	}

}
