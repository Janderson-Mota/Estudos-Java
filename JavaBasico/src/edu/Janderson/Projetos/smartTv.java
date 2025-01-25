package edu.Janderson.Projetos;

public class smartTv {
     boolean ligada= false;
     int canal = 1;
     int volume = 25;

 
     //status Tv 
     public void ligar(){
        ligada=true;
     }

     public void desligar(){
        ligada= false;
     }


     //status canal
     public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


    //status Volume
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }










}