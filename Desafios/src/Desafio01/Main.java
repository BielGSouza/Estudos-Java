package Desafio01;

import Desafio01.br.com.rodaMusic.Audios.Audio;
import Desafio01.br.com.rodaMusic.Audios.Musica;
import Desafio01.br.com.rodaMusic.Audios.Podcast;

public class Main {
    //Desafio de fazer um sistema simples de um APP de musica. algo simples mesmo. Nome RodaMusic.

    static void main() {
        Audio audio = new Audio();
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        audio.setNomeAudio("Podcast: Flow com Neymar");
        audio.setDuracaoAudio(120);
        audio.setTotalDeCurtidasAudio(50);
        audio.setTotalReproducoesAudio(249);

        audio.setNotasAudio(10);
        audio.setNotasAudio(8);

        podcast.setNotasAudio(4.5);
        podcast.setNotasAudio(7);

        System.out.printf("""
                ===========================
                Nome: %s
                Duração: %.0f min
                Curtidas: %d
                Reproduções: %d
                Classificação: %s (%.2f)
                ===========================
                """, audio.getNomeAudio(), audio.getDuracaoAudio(), audio.getTotalDeCurtidasAudio(), audio.getTotalReproducoesAudio(), podcast.getAvaliar(), podcast.notaAvaliacao());
    }
}
