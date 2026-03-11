import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            avaliacao += nota;
        }

        System.out.printf("A média foi: %.2f", avaliacao/3);

    }
}
