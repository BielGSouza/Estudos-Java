package br.gabriel.aluno.principal;

import br.gabriel.aluno.modelos.Epsodios;
import br.gabriel.aluno.modelos.Filme;
import br.gabriel.aluno.modelos.Serie;
import br.gabriel.aluno.calculadora.Calculadora;
import br.gabriel.aluno.calculadora.Recomendacao;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(7);
        favorito.avalia(8);


        Filme outro = new Filme("Vingadore Ultimato", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2017);
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

        Filme filmeDoGabriel = new Filme("Superman", 2015);
        filmeDoGabriel.setDuracaoEmMinutos(200);
        filmeDoGabriel.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoGabriel);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);
        System.out.println("tamanho da lista de filmes " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }
}
