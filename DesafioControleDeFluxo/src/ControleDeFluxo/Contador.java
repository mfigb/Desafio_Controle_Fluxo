package ControleDeFluxo;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro par�metro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo par�metro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            terminal.close(); // Fecha o Scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o parametroUm � maior que o parametroDois e lan�a uma exce��o.
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
        }

        // Imprime os n�meros conforme os par�metros fornecidos
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o n�mero " + i);
        }
    }
}
