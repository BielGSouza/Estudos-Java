package br.gabriel.aluno.modelos;

import br.gabriel.aluno.calculadora.Classificavel;

public class Epsodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacaoes;

    public int getTotalVisualizacaoes() {
        return totalVisualizacaoes;
    }

    public void setTotalVisualizacaoes(int totalVisualizacaoes) {
        this.totalVisualizacaoes = totalVisualizacaoes;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacaoes > 100) {
            return  4;
        } else {
            return 2;
        }
    }
}
