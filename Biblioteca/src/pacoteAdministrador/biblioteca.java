package pacoteAdministrador;

import java.util.Scanner;
import admBiblioteca.Biblioteca;
import admUsuario.Cadastro;

public class biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Biblioteca livro1 = new Biblioteca("Dom Casmurro", "Romance", 5);
		Biblioteca livro2 = new Biblioteca("1984", "Ficção Científica", 8);
		Biblioteca livro3 = new Biblioteca("O Senhor dos Anéis", "Fantasia", 10);
		Biblioteca livro4 = new Biblioteca("A Revolução dos Bichos", "Satírico", 6);
		Biblioteca livro5 = new Biblioteca("O Pequeno Príncipe", "Fábula", 12);
		Biblioteca livro6 = new Biblioteca("O Código Da Vinci", "Suspense", 7);
		Biblioteca livro7 = new Biblioteca("It: A Coisa", "Terror", 4);
		Biblioteca livro8 = new Biblioteca("Orgulho e Preconceito", "Romance", 9);
		Biblioteca livro9 = new Biblioteca("Cem Anos de Solidão", "Realismo Mágico", 6);
		Biblioteca livro10 = new Biblioteca("Harry Potter e a Pedra Filosofal", "Fantasia", 11);
		
		
		
		sc.close();
	}

}
