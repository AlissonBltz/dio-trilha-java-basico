package strategy;

public class Gatinho {
    private Movimento movimento;

	public void setComportamento(Movimento movimento) {
		this.movimento = movimento;
	}
	
	public void mover() {
		movimento.mover();
	}
}