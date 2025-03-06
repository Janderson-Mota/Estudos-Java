package entities;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;

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

}
