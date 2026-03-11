package Desafios;

import java.util.Scanner;

public class ContaBancaria {
    static void main() {
        Scanner scan = new Scanner(System.in);

        String nome = "Gabriel de Souza";
        String tipo_de_conta = "Corrente";
        float saldo = 0;
        int opcao = 0;

        String cabecalho = """
                **************************************************
                Dados do Cliente:
                
                Nome:                   %s
                Tipo de Conta:          %s
                Saldo:                  R$ %.2f
                **************************************************
                
                """.formatted(nome, tipo_de_conta, saldo);
        System.out.println(cabecalho);


        while (opcao != 4) {
            String operacoes = """
                    
                    Operações:
                    
                    1- Consultar Saldo
                    2- Receber Valor
                    3- Trânsferir Valor
                    4- Sair
                    
                    """;
            System.out.println(operacoes);

            System.out.println("Digite a opção desejada: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("O seu saldo é de: R$" + saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Qual o valor recebido?");
                    float valorRecebido = scan.nextFloat();
                    saldo = saldo + valorRecebido;
                    System.out.println();
                    System.out.printf("Valor de R$%.2f adicionado a conta. ", valorRecebido);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Qual o valor da transferência?");
                    float valorTransferido = scan.nextFloat();

                    if (valorTransferido > saldo) {
                        System.out.println();
                        System.out.println("Saldo insuficiente. A transferência não foi realizada.");
                        System.out.println();
                    } else {
                        saldo = saldo - valorTransferido;
                        System.out.println();
                        System.out.printf("Transferência de R$%.2f descontado da sua conta.", valorTransferido);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Fechando aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
