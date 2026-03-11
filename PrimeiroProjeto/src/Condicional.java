public class Condicional {
    static void main() {
        int anoDeLancamento = 2023;
        boolean incluidoPlano = false;
        double nota = 5.8;
        String plano = "plus";

        if (anoDeLancamento > 2021) {
            System.out.println("Lançamento de novos filmes");
        } else {
            System.out.println("Filmes antigos");
        }

        if (incluidoPlano || plano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague para ter acesso");
        }
    }
}
