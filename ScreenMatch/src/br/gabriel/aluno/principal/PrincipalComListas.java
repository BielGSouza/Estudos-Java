package br.gabriel.aluno.principal;

import br.gabriel.aluno.modelos.Filme;
import br.gabriel.aluno.modelos.Serie;
import br.gabriel.aluno.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main() {
        Filme filmeDoGabriel = new Filme("Superman",
                2015);
        filmeDoGabriel.avalia(10);
        Filme outro = new Filme("Vingadore Ultimato", 2014);
        outro.avalia(8);
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(7);
        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoGabriel);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme) {
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Neymar");
        buscaPorArtista.add("CR7");
        buscaPorArtista.add("Messi");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
