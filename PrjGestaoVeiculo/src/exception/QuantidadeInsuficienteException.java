package exception;

public class QuantidadeInsuficienteException extends RuntimeException {

    @Override
    public String getMessage(){
        return "Erro: Quantidade insuficiente em estoque!!";
    }
}
