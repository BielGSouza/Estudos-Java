package Desafio01.br.com.rodaMusic.Audios;

import Desafio01.br.com.rodaMusic.Implementos.Avaliacao;

public class Podcast extends Audio implements Avaliacao {

    @Override
    public String getAvaliar() {
        if (notaAvaliacao() >= 8) {
            return "Podcast bem avaliado";
        } else if (notaAvaliacao() >= 5) {
            return "Podcast que vale a pena ouvir";
        } else if (notaAvaliacao() >= 3) {
            return "Podcast em acensão";
        } else {
            return "Podcast em queda.";
        }
    }
}
