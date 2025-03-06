package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Funcionario;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario ();
		System.out.println("Digite os dados do funcionario: ");
		
		System.out.print("Nome: ");
		funcionario.nome= sc.next();	
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto= sc.nextDouble();
		
		System.out.print("Impostos: ");
		funcionario.taxa= sc.nextDouble();	
		
		System.out.println("");
		System.out.printf("Dados do funcionarios: " +funcionario.nome+ ", R$ %.2f%n", funcionario.salarioLiquido());
		
		System.out.println("");
		System.out.print("Digite uma porcentagem para acrescentar no salario do funcionario: ");
		double porcentagem = sc.nextDouble();
		funcionario.incrementarSalario(porcentagem);
		
		System.out.println("");
		System.out.print(funcionario);
		
		
		
		
		 sc.close();

	}

}
