package pacoteCliente;

import java.util.Scanner;
import admBiblioteca.Biblioteca;
import admUsuario.Cadastro;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo a nossa biblioteca! Para começarmos vou precisar de algumas informações suas.");
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		String genero="";
		System.out.println("Digite seu sexo (M/F): ");
		char sexo = sc.next().charAt(0);
		
		// Verificação do sexo
		if (sexo == 'F' || sexo == 'f') {genero = "feminino";}
		else if (sexo == 'M' || sexo == 'm') {genero = "Masculinho";}
		// Fim verificação do sexo
		
	  
		
		
		
		
		
		
		
	}

}
