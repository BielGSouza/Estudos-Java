package br.com.gabriel.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEpsodio(@JsonAlias("Title") String titulo,
                           @JsonAlias("Episode") Integer epsodio,
                           @JsonAlias("imdbRating") String avaliacao,
                           @JsonAlias("Released") String dataDeLancamento) {
}
