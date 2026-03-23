package br.gabriel.aluno.execao;

public class ErroDeConversaodeAnoExcepition extends RuntimeException {
    private String mensagem;

    public ErroDeConversaodeAnoExcepition(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
