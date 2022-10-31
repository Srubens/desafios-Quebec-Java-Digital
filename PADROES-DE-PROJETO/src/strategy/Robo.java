package strategy;

public class Robo {
    private Comportamento comportamento;

    /**
     * @param comportamento the comportamento to set
     */
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

}
