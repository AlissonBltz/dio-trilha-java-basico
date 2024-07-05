public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tele";
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }else {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();





















        /*//Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        // Tiro os botões dele pra salvar histórico e 
        vereficar se enta conectado a internet pq o 
        programa que tem que fazer isso e não o usuário //
        msn.receberMensagem();

        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();
        
        FacebookMessenger face = new FacebookMessenger();
        face.enviarMensagem();
        face.receberMensagem(); */
    }
}
