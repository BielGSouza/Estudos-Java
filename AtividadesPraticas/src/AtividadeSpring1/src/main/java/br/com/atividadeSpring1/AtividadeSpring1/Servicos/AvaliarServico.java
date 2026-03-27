package br.com.atividadeSpring1.AtividadeSpring1.Servicos;

public class AvaliarServico<T> {
    private T item;
    private double notaServico;
    private String comentarioServico;

    public void avaliarServico(T item, double nota, String comentario) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
        }

        this.item = item;
        this.comentarioServico = comentario;
        this.notaServico = nota;
    }

    public T getItem() {
        return item;
    }

    public double getNotaServico() {
        return notaServico;
    }

    public void setNotaServico(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
        }
        this.notaServico = nota;
    }

    public String getComentarioServico() {
        return comentarioServico;
    }

    public void setComentarioServico(String comentarioServico) {
        this.comentarioServico = comentarioServico;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item:" + item +
                ", nota=" + notaServico +
                ", comentario='" + comentarioServico + '\'' +
                '}';
    }
}
