package br.com.gabriel.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DadosTemporada(@JsonAlias("Season") Integer temporada,
                             @JsonAlias("Episodes") List<DadosEpsodio> epsodios) {
}
