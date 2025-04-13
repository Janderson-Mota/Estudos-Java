package ExercicioVetoresObjetos;

public class Pessoas {

	private String nome = "";
	private int idade = 0;

	public Pessoas(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
     public String toString() {
		
		return "Nome: "+ getNome() + "\n"+ 
			   "Idade: "+ getIdade();
					
	}
	
	

}
