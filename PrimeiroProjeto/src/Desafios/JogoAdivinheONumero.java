package Desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinheONumero {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int numeroMisterioso = new Random().nextInt(100);
        int nossoNumero = 0;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Numero de tentativas %d/5", i);
            System.out.println("");
            nossoNumero = scan.nextInt();

            if (nossoNumero < numeroMisterioso && i < 5) {
                System.out.println("O numero misterioso é maior.");
            } else if (nossoNumero > numeroMisterioso && i < 5) {
                System.out.println("O numero misterioso é menor.");
            } else if (nossoNumero == numeroMisterioso) {
                System.out.println("Parabens você acertou o numero misterioso: " + numeroMisterioso + " em " + i + " tentativas");
                break;
            } else {
                System.out.println("Você não acertou o número misterioso " + numeroMisterioso);
            }
        }
    }
}
