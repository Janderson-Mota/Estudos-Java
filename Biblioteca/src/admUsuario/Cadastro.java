package admUsuario;

public class Cadastro {

	private String nome;
	private String genero;
	private int idade = 0;
	
	public Cadastro(String nome, String genero, int idade) {
		
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}


    //Configurações de nomes 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Fim Configurações de nomes 

	
    //Configurações de sexos
	public String getgenero() {
		return genero;
	}
	
	public void setSexo(String sexo) {
		this.genero = sexo;
	}
	//Fim Configurações de sexos


	
	//Configurações de idades
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	//Fim Configurações de idades
	
	
	
	
	
	
}
