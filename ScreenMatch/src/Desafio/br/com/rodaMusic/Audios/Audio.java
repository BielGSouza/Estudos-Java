package Desafio.br.com.rodaMusic.Audios;

public class Audio {
    private String nomeAudio;
    private double duracaoAudio;
    private int totalReproducoesAudio;
    private int totalDeCurtidasAudio;

    private double notasAudio;
    private int quantasNotasAudio;

    public String getNomeAudio() {
        return nomeAudio;
    }

    public void setNomeAudio(String nomeAudio) {
        this.nomeAudio = nomeAudio;
    }

    public double getDuracaoAudio() {
        return duracaoAudio;
    }

    public void setDuracaoAudio(double duracaoAudio) {
        this.duracaoAudio = duracaoAudio;
    }

    public int getTotalReproducoesAudio() {
        return totalReproducoesAudio;
    }

    public void setTotalReproducoesAudio(int totalReproducoesAudio) {
        this.totalReproducoesAudio = totalReproducoesAudio;
    }

    public int getTotalDeCurtidasAudio() {
        return totalDeCurtidasAudio;
    }

    public void setTotalDeCurtidasAudio(int totalDeCurtidasAudio) {
        this.totalDeCurtidasAudio = totalDeCurtidasAudio;
    }


    public void setNotasAudio(double notasAudio) {
        this.notasAudio += notasAudio;
        quantasNotasAudio++;
    }

    public double getNotasAudio() {
        return notasAudio;
    }

    public int getQuantasNotasAudio() {
        return quantasNotasAudio;
    }

    public double notaAvaliacao() {
        return notasAudio / quantasNotasAudio;
    }
}
