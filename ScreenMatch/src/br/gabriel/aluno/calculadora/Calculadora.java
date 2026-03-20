package br.gabriel.aluno.calculadora;

import br.gabriel.aluno.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
