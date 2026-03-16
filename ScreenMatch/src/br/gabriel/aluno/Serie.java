package br.gabriel.aluno;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsidiosPorTemporada;
    private int minutosPorEpsodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsidiosPorTemporada() {
        return epsidiosPorTemporada;
    }

    public void setEpsidiosPorTemporada(int epsidiosPorTemporada) {
        this.epsidiosPorTemporada = epsidiosPorTemporada;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * minutosPorEpsodio * epsidiosPorTemporada;
    }
}