package subsitema1;

public class CRMService {

    private CRMService(){
        super();
    }

    public static void gravarCliente( String nome, String cep, String cidade,String estado ){
        System.out.println("Cliente salvo no Sistema de CRM");
        System.out.println(nome +"  "+ cep +"  "+ cidade +"  "+ estado);
    }

}
