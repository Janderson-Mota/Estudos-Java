package Vetores;

import java.util.Locale;
import java.util.Scanner;
import Vetores.admAula_2;

public class aula_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n =sc.nextInt();
		admAula_2[] vect = new admAula_2[n];
		
		for(int i =0; i<vect.length; i++) {
			
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();		
			vect[i]= new admAula_2(nome,preco);
			
		}
		
		double soma = 0.0;
		for(int i =0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma/vect.length;
		System.out.printf("A média dos valores é: %.2f%n",media);
		
		sc.close();

	}

}
