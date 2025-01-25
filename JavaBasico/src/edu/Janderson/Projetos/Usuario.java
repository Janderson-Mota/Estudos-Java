package edu.Janderson.Projetos;

public class Usuario {

public static void main(String[] args) {

          smartTv smartTv = new smartTv();
  

          //Status televisão
          smartTv.ligar();{
                System.out.println("Novo Status -> Tv ligada : " + smartTv.ligada);}

          smartTv.desligar();{
                System.out.println("Novo Status -> Tv Desligada : " + smartTv.ligada);}
  
          
          //Status Canal
          smartTv.aumentarCanal();{
               System.out.println("Canal aumentado para : " + smartTv.canal);}
          
          smartTv.diminuirCanal();{
               System.out.println("Canal diminuindo para : " + smartTv.canal);}


          //Status Volume
          smartTv.aumentarVolume();{
               System.out.println("Volume aumentando para : " + smartTv.volume);}

               smartTv.diminuirVolume();{
                    System.out.println("Volume diminuindo para : " + smartTv.volume);}

  
  
  
  
  
  
     }
}
    
    
     
