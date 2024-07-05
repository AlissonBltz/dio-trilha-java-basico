
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Stickerbrush Simphony");

        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }


    public void pausar(){
        System.out.println("Pausando a música");
    }
    public void tocar(){
        System.out.println("Tocando a música");
    }
    public void selecionarMusica(String musica){
        System.out.println("Musica " + musica + " selecionada");
    }
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    public void atender(){
        System.out.println("Atender chamada?");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página de endereço " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }

}
