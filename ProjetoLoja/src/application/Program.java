package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite os dados do produto:");
		
		System.out.print("Name: ");
		String nome = sc.next();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		int quantidade = sc.nextInt();
		
		Product produto = new Product (nome, preco, quantidade);
		
	    //Troca de nome pelo sistema
		System.out.println("");
		produto.setNome("computador");
		System.out.println("nome atualizado: "+ produto.getNome());
		
		//Troca de preço pelo sistema
		produto.setPreco(100.00);
		System.out.println("nome atualizado: "+ produto.getPreco());
		
		System.out.println("");
		System.out.println("Os dados do produto : "+produto);
		
		System.out.println("");
		System.out.print("Entre com o número para ser acrescentado no estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println("");
		System.out.print("Produto atualizado: "+ produto);
		
		System.out.println("");
		System.out.print("Entre com o número para ser removidos no estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("");
		System.out.print("Produto atualizado: "+ produto);
		
		
		
		sc.close();

	}

}
