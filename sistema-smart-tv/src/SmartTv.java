public class SmartTv{
    //objeto tv
    boolean ligada = false;
    int canal = 1;
    int volume = 15;


    //metodos da tv ligar/desligar
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    //metodo volume mais menos 
    public void aumentarVolume(){
        System.out.println("Aumentando o volume +1");
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume -1");
        volume--;
    }

    //metodo trocar canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}