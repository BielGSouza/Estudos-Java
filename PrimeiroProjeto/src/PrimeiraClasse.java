public  class PrimeiraClasse {
    static void main() {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: As Branquelas");
        System.out.println();

        int ano = 2026;
        System.out.println(ano);

        double media = (7.2 + 7 + 5.9) / 3;
        System.out.println(media);

        String sinopse = """
                Filme: As Branquelas
                Ano de Lançamento: 2005
                Media: %.2f
                """.formatted(media);

        System.out.println(sinopse + media);
    }
}