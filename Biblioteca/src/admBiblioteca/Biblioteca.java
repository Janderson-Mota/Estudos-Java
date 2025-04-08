package admBiblioteca;

public class Biblioteca {
	
	
	private String nome;
	private String genero;
	private int quantidade;
	
	public Biblioteca(String nome, String genero, int quantidade) {
		
		this.nome = nome;
		this.genero = genero;
		this.quantidade = quantidade;
		
	}

	//Configurações de nomes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//Fim Configurações de nomes

	
	
	//Configurações de Genero
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	//Fim Configurações de Genero

	
	
	//Configurações de Quantidades
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionar (int adicionar) {
		this.quantidade = this.quantidade + adicionar;
	}
	
	public void retirar (int retirar) {
		this.quantidade = this.quantidade - retirar;
	}
	//Fim Configurações de Quantidades
	
	
	//Tranformando um objeto em String
	public String toString() {
		
		return "Livro : "+ getNome() + "\n"+ 
				"Gênero: "+ getGenero()  +"\n"+
				"Quantidade "+ getQuantidade();	
	}
	
	
}
