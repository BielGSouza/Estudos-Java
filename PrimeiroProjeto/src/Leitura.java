import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Dgite a data de lançamento:");
        int ano = leitura.nextInt();
        System.out.println("Digite sua nota para esse filme:");
        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(nota);
    }
}
