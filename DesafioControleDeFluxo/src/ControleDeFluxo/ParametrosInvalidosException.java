package ControleDeFluxo;

// Exce��o personalizada para indicar par�metros inv�lidos.

public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L; // Vers�o de serializa��o para compatibilidade

   //Criar uma exce��o com mensagem espec�fica.A mensagem ser� exibida quando a exce��o for lan�ada.
     
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
