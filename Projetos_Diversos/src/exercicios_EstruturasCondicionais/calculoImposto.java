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
    
    if(salario <= 2000.00){
        System.out.print ("Isento");
    }
    else if(salario <= 3000){
    	imposto = 8;
        totalImposto =(salario*imposto)/100;
        System.out.print ("O imposto total é de: R$ " + totalImposto);
    }
    else if(salario <= 4500){
    	imposto = 18;
        totalImposto =(salario*imposto)/100;
        System.out.print ("O imposto total é de: R$ " + totalImposto);
    }
    else if(salario > 4501){
    	imposto = 28;
        totalImposto =(salario*imposto)/100;
        System.out.print ("O imposto total é de: R$ " + totalImposto);
    }
    else {
    	System.out.print ("Isento");
    }
     
     
     
     
     

	}

}
