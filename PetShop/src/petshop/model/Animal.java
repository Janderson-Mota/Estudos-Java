package petshop.model;

public abstract class Animal {

	private String nome;
	private int idade;

	// Construtores
	public Animal() {
	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Metodos
	public abstract void emitirSom();

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}
