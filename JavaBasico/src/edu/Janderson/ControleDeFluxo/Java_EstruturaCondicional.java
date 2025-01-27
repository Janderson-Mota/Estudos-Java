package edu.Janderson.ControleDeFluxo;

public class Java_EstruturaCondicional{
 
     public static void main(String[] args) {
        
      //Estruturas condicionais: if-else, switch-case

      // if-else

      String siglam = "M";

		if(siglam == "P")
			System.out.println("PEQUENO");
		else if(siglam == "M")
			System.out.println("MEDIO");
		else if(siglam == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

      
     // switch-case

     String sigla = "M";

     switch (sigla) {
     case "P":{
         System.out.println("PEQUENO");
         break;
     }
     case "M":{
         System.out.println("MEDIO");
         break;
     }
     case "G":{
         System.out.println("GRANDE");
         break;
     }
     default:
         System.out.println("INDEFINIDO");
     }







     }
}