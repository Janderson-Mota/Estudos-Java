package petshop.model;

public class Cachorro extends Animal{

	private String raca;
	
	// Construtores
	public Cachorro() {
	}

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	// Metodos Gets e Sets
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	// Metodos
	@Override
	public void emitirSom() {
		System.out.println("Au Au!");
	}

	@Override
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Raça: " + raca);
		emitirSom();
	}
	

}
