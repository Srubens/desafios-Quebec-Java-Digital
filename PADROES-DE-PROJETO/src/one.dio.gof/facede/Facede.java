package one.dio.gof.facede;

import subsistema2.CepAPI;
import subsitema1.CRMService;

public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CRMService.gravarCliente(nome, cep,cidade,estado);
    }
}
