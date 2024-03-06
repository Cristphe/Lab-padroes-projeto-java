package subsistema2.cep;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }
    public static CepAPI getInstance(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Joinville";
    }
    public String recuperarEstado(String cep){
        return "SC";
    }
}
