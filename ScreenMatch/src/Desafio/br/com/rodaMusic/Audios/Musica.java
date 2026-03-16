package Desafio.br.com.rodaMusic.Audios;

import Desafio.br.com.rodaMusic.Implementos.Avaliacao;

public class Musica extends Audio implements Avaliacao {
    @Override
    public String getAvaliar() {
        if (notaAvaliacao() >= 8) {
            return "Música bem avaliado";
        } else if (notaAvaliacao() >= 5) {
            return "Música que vale a pena ouvir";
        } else if (notaAvaliacao() >= 3) {
            return "Música em acensão";
        } else {
            return "Música em queda.";
        }
    }
}
