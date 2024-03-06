package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado = CepAPI.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
