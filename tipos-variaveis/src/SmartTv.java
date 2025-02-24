

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 2;

    public void ligarDesligar(){
        if (ligada == false){
            ligada = true;
            System.out.println("ligando tv");
        } else {
            ligada = false;
            System.out.println("desligando tv");
        }
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        if(canal <= 0){
            canal = 1;
            System.out.println("mudando Canal atual: " + canal);
        } else{
            System.out.println("mudando Canal atual: " + canal);
        }
        
    }

    public void abaixarCanal(){
        if(ligada == true && canal != 1){
            canal--;
            System.out.println("abaixando Canal atual: " + canal);
        } else {
            System.out.println("Canal atual: " + canal);
        }
    }

    public void aumentarCanal(){
        if(ligada == true && canal >= 1){
            canal++;
            System.out.println("aumentando Canal atual: " + canal);
        }
    }

    public void abaixarVolume(){
        if(ligada == true && volume != 0 ){
            volume--;
            System.out.println("diminuindo Volume atual: " + volume);
        }
    }

    public void aumentarVolume(){
        if(ligada == true && canal >= 1){
            volume++;
            System.out.println("aumentando Volume atual: " + volume);
        }
    }
}


