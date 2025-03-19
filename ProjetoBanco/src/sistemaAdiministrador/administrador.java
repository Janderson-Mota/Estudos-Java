package sistemaAdiministrador;

public class administrador {

	//Atributos
	private int numeroConta;
	private String nome;
	private double deposito;

	//Construtores
	public administrador(int numeroConta, String nome, double deposito) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.deposito = deposito;
	}

	//Metodos getters e setters
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return deposito;
	}

	//Metodos de manipulação
	public double acrescentar(double depositar) {
		return deposito = deposito + depositar;
	}
	public double diminuir(double retirada) {
		return deposito = deposito - retirada;
	}
	public double taxa(double taxa) {
		return deposito = deposito - taxa;
	}

}
