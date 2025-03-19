package entities;

public class Product {

	// declaração atributos
	private String nome;
	private double preco;
	private int quantidade;

	// construtores
	public Product() {
	}

	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	// end contrutores

	
	// privados nome
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	// end privados nome
	
	
	// privados preço
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getPreco() {
		return preco;
	}
	// end privados preço
	
	
	//privados quantidade
	public int getQuantidade() {
		return quantidade;
	}
	// end privados quantidade



	
	// metodos do programa
	public double totalValorEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ "
				+ String.format("%.2f", totalValorEstoque());
	}
	// end metodos do programa

}
