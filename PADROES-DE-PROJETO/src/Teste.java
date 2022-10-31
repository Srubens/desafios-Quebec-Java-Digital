import one.dio.gof.facede.Facede;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Teste {
    public static void main(String[] args){
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        Robo r2d2 = new Robo();
        r2d2.setComportamento(normal);
        r2d2.mover();
        r2d2.setComportamento(agressivo);
        r2d2.mover();
        r2d2.mover();
        r2d2.setComportamento(defensivo);
        r2d2.mover();
        r2d2.mover();
        /**
         * facede
         */
        Facede facede = new Facede();
        facede.migrarCliente("Jose","53417330");
    }
}
