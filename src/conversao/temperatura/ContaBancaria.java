package conversao.temperatura;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Bruno Venancio";
        String conta  = "Correte";
        double saldo = 2500.00;

        String cliente = """
                     *********************************
                     Nome:              %s
                     Tipo de Conta:     %s
                     Saldo inicial:     %.2f
                     *********************************
                     
                     Operações
                     
                     """.formatted(nome, conta, saldo);
        String mensagem = """
                          1 - Consultar saldos
                          2 - Receber valor
                          3 - Transferir valor
                          4 - Sair
                          """;
        System.out.println(cliente);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(mensagem);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O valor do seu saldo: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor para receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor na conta atualizado: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Digite o valor para tranferir: ");
                double valor = leitura.nextDouble();
                saldo -= valor;
                System.out.println("Valor na conta atualizado: " + saldo);
            }else {
                System.out.println("Valor diferente das opções");
            }
        }
        System.out.println("você saiu do sistema");
    }
}
