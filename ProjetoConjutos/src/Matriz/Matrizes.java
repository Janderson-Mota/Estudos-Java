package Matriz;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho da matris: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
        
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j]= sc.nextInt();			}
		}
		System.out.println("Principal diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i]+ "  ");
			System.out.println();
		}
		
		
		
	}

}
