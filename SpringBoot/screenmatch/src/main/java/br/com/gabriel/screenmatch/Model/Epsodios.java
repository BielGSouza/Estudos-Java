package br.com.gabriel.screenmatch.Model;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Epsodios {
    private Integer temporada;
    private String titulo;
    private Integer epsodio;
    private double avaliacao;
    private LocalDate dataDeLancamento;

    public Epsodios(Integer numeroTemporada, DadosEpsodio dadosEpsodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpsodio.titulo();
        this.epsodio = dadosEpsodio.epsodio();

        try {
            this.avaliacao = Double.valueOf(dadosEpsodio.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }

        try {
            this.dataDeLancamento = LocalDate.parse(dadosEpsodio.dataDeLancamento());
        } catch (DateTimeParseException ex) {
            this.dataDeLancamento = null;
        }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEpsodio() {
        return epsodio;
    }

    public void setEpsodio(Integer epsodio) {
        this.epsodio = epsodio;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", epsodio=" + epsodio +
                ", avaliacao=" + avaliacao +
                ", dataDeLancamento=" + dataDeLancamento;
    }
}
