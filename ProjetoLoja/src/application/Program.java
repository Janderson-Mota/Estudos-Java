package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product produto = new Product();
		System.out.println("Digite os dados do produto:");
		
		System.out.print("Name: ");
		produto.nome = sc.next();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("");
		System.out.println("Os dados do produto : "+produto);
		
		System.out.println("");
		System.out.print("Entre com o número para ser acrescentado no estoque: ");
		int quantidade = sc.nextInt();
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
