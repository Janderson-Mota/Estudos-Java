package edu.Janderson.ControleDeFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class Java_EstruturaRepeticao{

    public static void main(String[] args) {
    
        //Estruturas de repetição: for(para) , while(enquanto), do-while(faça enquanto)


        //Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
       

        // ExemploFor.java
           
                int carneirinhos = 1; 
         
                for(carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
                    System.out.println(carneirinhos + " - Carneirinho(s)"); 
                
                    if (carneirinhos == 20){
                        System.out.println("João dormiu");
                    }
                }

                /*break; e continue;
                Break significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço. O comando break interrompe o laço, já o continue interrompe somente a iteração atual. */

               
               // ExemploWhile.java

            //ExemploWhile {

       	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2, 8);
        



    //     //ExemploDovWhile 
	// 	System.out.println("Discando...");
		
	// 	do {
	// 		//excutando repetidas vezes até alguém atender
	// 		System.out.println("Telefone tocando");
		
	// 	}while(tocando());
		
	// 	System.out.println("Alô !!!");
	
	//  private static boolean tocando() {
	// 	boolean atendeu = new Random().nextInt(3)==1;
	// 	System.out.println("Atendeu? " + atendeu);
	// 	//negando o ato de continuar tocando
	// 	return ! atendeu;


    }
    

 
}