public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); //objeto

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);


        smartTv.ligar(); //metodo ligar desligar
        System.out.println("TV ligada agora? " + smartTv.ligada);


        smartTv.aumentarVolume(); //metodo aumentar volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual da TV: " + smartTv.volume);

        smartTv.aumentarCanal(); //metodo aumentar canal
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual da TV: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal atual da TV: " + smartTv.canal);



    }
}
