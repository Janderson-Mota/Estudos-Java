package petshop.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import petshop.model.*;

public class PetShop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Animal> pet = new ArrayList<>();
		int parar = 1; 
		
		System.out.println("Bem vindos ao Pet Shop");
		do {
		System.out.print("Digite (C) cachorro ou (G) gato: ");
		char n = sc.next().charAt(0);
		if (n== 'C' || n== 'c') {
			System.out.println("Você escolheu um cachorro para cadatrar digite as iformações dele.");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade:  ");
			int idade = sc.nextInt();
			System.out.print("Raça: ");
			String raca =sc.next();
			pet.add(new Cachorro(nome , idade, raca));
		}
		else {
			System.out.println("Você escolheu um Gato para cadatrar digite as iformações dele.");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade:  ");
			int idade = sc.nextInt();
			pet.add(new Gato(nome , idade));
		}
		
		System.out.println("Cadastro realizado com sucesso!");
		
		
		System.out.print("\nCaso queira cadastrar mais algum animal digite '1' ou se quiser finalizar o programa digite '0': ");
		parar = sc.nextInt();
		System.out.println();
		}
		while (parar > 0);
		
		for (Animal x : pet) {
			 x.exibirDados();
			 System.out.println();
		}
		
		
	    sc.close();
	}

}
