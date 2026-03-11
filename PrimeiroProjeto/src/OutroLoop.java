import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;
        int quantidadeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                avaliacao += nota;
                quantidadeNotas++;
            }
        }

        System.out.printf("A média foi: %.2f", avaliacao/quantidadeNotas);

    }
}
