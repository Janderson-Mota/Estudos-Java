package petshop.model;

public class Gato extends Animal {

	// Construtores
	public Gato() {
	}

	public Gato(String nome, int idade) {
		super(nome, idade);

	}

	// Metodos
	@Override
	public void emitirSom() {
		
		System.out.println("Miau!");
	}

	@Override
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		emitirSom();
	}

}
