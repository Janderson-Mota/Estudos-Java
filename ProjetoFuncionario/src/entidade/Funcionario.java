package entidade;

public class Funcionario {

	public String nome;
    public double salarioBruto;
    public double taxa;
    
    
    public double salarioLiquido () {
    	return salarioBruto - taxa;
    }
    
    public void incrementarSalario(double porcentagem) {
    	 salarioBruto += salarioBruto *(porcentagem / 100.0);
    }
    
    public String toString() {
		return "Dados do funcionarios: "+nome+" , R$ "+ String.format("%.2f", salarioLiquido());
	}
    
	
}
