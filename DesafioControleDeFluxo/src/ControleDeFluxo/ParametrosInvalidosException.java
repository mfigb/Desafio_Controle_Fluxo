package ControleDeFluxo;

// Exceção personalizada para indicar parâmetros inválidos.

public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L; // Versão de serialização para compatibilidade

   //Criar uma exceção com mensagem específica.A mensagem será exibida quando a exceção for lançada.
     
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
