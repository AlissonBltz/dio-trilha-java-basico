import strategy.AndandoLento;
import strategy.AndandoRapido;
import strategy.Correndo;
import strategy.Gatinho;
import strategy.Movimento;
import strategy.MovimentoPular;

public class Test {
    public static void main(String[] args) {
        Movimento lento = new AndandoLento();
        Movimento rapido = new AndandoRapido();
        Movimento pular = new MovimentoPular();
        Movimento correndo = new Correndo();

        Gatinho gatinho = new Gatinho();

        gatinho.setComportamento(pular);
		gatinho.mover();
		gatinho.setComportamento(lento);
		gatinho.mover();
		gatinho.setComportamento(rapido);
		gatinho.mover();
		gatinho.mover();
        gatinho.setComportamento(correndo);
		gatinho.mover();
        gatinho.setComportamento(pular);
        gatinho.mover();


    }
}
