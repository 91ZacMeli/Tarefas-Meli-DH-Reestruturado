package exemplo4.excecoes;

public class PersistenciaException extends RuntimeException{


    public PersistenciaException(String mensagem) {
        super(mensagem);
    }
}
