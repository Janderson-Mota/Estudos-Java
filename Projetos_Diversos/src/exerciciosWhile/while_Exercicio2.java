package exerciciosWhile;

import java.util.Scanner;

public class while_Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Alcool = 1;
		int Gasolina = 2;
		int Diesel = 3;
		int Fim = 4;
		int Combustivel = 0;
		
		int somaCombustivelClienteAlcool = 0;
		int somaCombustivelClienteGasolina = 0;
		int somaCombustivelClienteDiesel = 0;
		
		System.out.println("Óla, Senhor Cliente! Qual combustível gostaria de usar hoje?");
		System.out.println("Codigos de produtos:");
        System.out.println("Alcool - 1    Gasolina - 2    Diesel - 3    Fim do pedido - 4");
		
		Combustivel = sc.nextInt();
		
        
        while (Combustivel != Fim) {
        	
        	
        	if(Combustivel == Alcool){
        		somaCombustivelClienteAlcool = somaCombustivelClienteAlcool + 1 ;
        		
        	}
        	else if(Combustivel == Gasolina) {
        		somaCombustivelClienteGasolina = somaCombustivelClienteGasolina + 1;
        	}
        	
        	else if(Combustivel == Diesel) {
        		somaCombustivelClienteDiesel = somaCombustivelClienteDiesel + 1;
        	}
        	else {Combustivel = 0;}
        	
        	
        	System.out.println("Óla, Senhor Cliente! Qual combustível gostaria de usar hoje?");
    		System.out.println("Codigos de produtos:");
            System.out.println("Alcool - 1    Gasolina - 2    Diesel - 3    Fim do pedido - 4");
        	
            Combustivel = sc.nextInt();

        }
		
        System.out.println("");
        System.out.println("Muito obrigado por investir em nosso estabelecimento!");
        System.out.println("Total de clientes que abasteceram com Alcool:"+ somaCombustivelClienteAlcool);
        System.out.println("Total de clientes que abasteceram com Gasolina:"+ somaCombustivelClienteGasolina);
        System.out.println("Total de clientes que abasteceram com Diesel:"+ somaCombustivelClienteDiesel);
		
		sc.close();

	}

}