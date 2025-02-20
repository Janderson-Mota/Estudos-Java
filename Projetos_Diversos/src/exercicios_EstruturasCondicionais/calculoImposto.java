package exercicios_EstruturasCondicionais;
import java.util.Scanner;

public class calculoImposto {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
		
     double imposto;
     double salario;
     double totalImposto;
     
     
    System.out.println("Digite o seu salario para a verificação do imposto:");
    salario = sc.nextDouble();
    
    if(salario <= 2.000){
    	imposto = 8;
        totalImposto =(salario*imposto)/100;
        System.out.println (totalImposto);
    }
    
     
     
     
     
     

	}

}
