import br.gabriel.aluno.Epsodios;
import br.gabriel.aluno.Filme;
import br.gabriel.aluno.Serie;
import calculadora.Calculadora;
import calculadora.Recomendacao;

public class Principal {
    static void main() {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(7);
        favorito.avalia(8);


        Filme outro = new Filme();
        outro.setNome("Vingadore Ultimato");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtrar(favorito);

        Epsodios epsodio = new Epsodios();
        epsodio.setNumero(1);
        epsodio.setSerie(serie);
        epsodio.setTotalVisualizacaoes(300);
        filtro.filtrar(epsodio);

        Filme filmeDoGabriel = new Filme();
    }
}
