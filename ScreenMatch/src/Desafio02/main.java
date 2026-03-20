package Desafio02;

import Desafio02.Itens.ListaItens;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        List<ListaItens> listaDeItens = new LinkedList();
        double saldoCartao = 0;
        String itemComprado = " ";
        double valorItemComprado = 0;
        int opcao = 1;
        double totalValorComprado = 0;

        System.out.println("Qual o limite do cartão de crédito");
        saldoCartao = scan.nextDouble();

        ListaItens item = new ListaItens(itemComprado, valorItemComprado);

        while (opcao != 0) {
            System.out.println("Digite 0 para sair e 1 para adicionar uma nova compra:");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite a descrição da compra: ");
                    itemComprado = scan.next();

                    System.out.println("Digite o valor da compra: ");
                    valorItemComprado = scan.nextDouble();

                    var valorInv = totalValorComprado + valorItemComprado;
                    double saldoRestanteDoCartao = saldoCartao - totalValorComprado;
                    listaDeItens.sort(Comparator.comparing(ListaItens::getValorItem));

                    if (valorInv > saldoCartao) {
                        System.out.println("Saldo insuficiente.");
                        System.out.println(" ");
                        System.out.println("""
                                *******************************
                                COMPRAS REALIZADAS:
                                """);
                        for (ListaItens itemAListar : listaDeItens) {
                            System.out.println(itemAListar);
                        };
                        System.out.printf("""
                                
                                *******************************
                                
                                SALDO CARTÃO: %.2f
                                
                                """, saldoRestanteDoCartao);
                        break;
                    } else {
                        totalValorComprado += valorItemComprado;
                        item = new ListaItens(itemComprado, valorItemComprado);
                        listaDeItens.add(item);

                        System.out.println("Compra realizada!");
                        System.out.println(totalValorComprado);
                        break;
                    }
                default:
                    System.out.println("Opção inválida!");
            }
        }


    }
}
