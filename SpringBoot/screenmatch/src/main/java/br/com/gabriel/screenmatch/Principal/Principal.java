package br.com.gabriel.screenmatch.Principal;

import br.com.gabriel.screenmatch.Model.DadosEpsodio;
import br.com.gabriel.screenmatch.Model.DadosSerie;
import br.com.gabriel.screenmatch.Model.DadosTemporada;
import br.com.gabriel.screenmatch.Model.Epsodios;
import br.com.gabriel.screenmatch.Service.ConsumoAPI;
import br.com.gabriel.screenmatch.Service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner scan = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=84711ae4";

    public void exibeMenu() {
        System.out.println("Digite o nome da série");
        var nomeSerie = scan.nextLine();

        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

        for (int i = 0; i < dados.totalTemporadas(); i++) {
            List<DadosEpsodio> epsodiosTemporada = temporadas.get(i).epsodios();
            for (int j = 0; j < epsodiosTemporada.size(); j++) {
                System.out.println(epsodiosTemporada.get(j).titulo());
            }
        }

        temporadas.forEach(t -> t.epsodios().forEach(e -> System.out.println(e.titulo())));

//        List<String> nomes = Arrays.asList("Messi", "Ronaldo", "Neymar", "Salah", "Lewandowisk");
//
//        nomes.stream()
//                .sorted()
//                .limit(3)
//                .filter(n -> n.startsWith("N"))
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);

        List<DadosEpsodio> dadosEpsodios = temporadas.stream()
                .flatMap(t -> t.epsodios().stream())
                .collect(Collectors.toList());

//        System.out.println("\n Top 5 epsódios");
//        dadosEpsodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .sorted(Comparator.comparing(DadosEpsodio::avaliacao).reversed())
//                .limit(5)
//                .forEach(System.out::println);

        List<Epsodios> epsodios = temporadas.stream()
                .flatMap(t -> t.epsodios().stream()
                        .map(d -> new Epsodios(t.temporada(), d)))
                .collect(Collectors.toList());

        epsodios.forEach(System.out::println);

//        System.out.println("Pesquise um episódio: ");
//
//        var trechoTitulo = scan.nextLine();
//        Optional<Epsodios> episodioBuscado = epsodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//        if (episodioBuscado.isPresent()) {
//            System.out.println("Episódio encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        } else {
//            System.out.println("Episódio não encontrado");
//        }

//        System.out.println("Digite um ano para ver os epsodios: ");
//        var ano = scan.nextInt();
//        scan.nextLine();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        epsodios.stream()
//                .filter(e -> e.getDataDeLancamento() != null && e.getDataDeLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getDataDeLancamento() +
//                                " Episódio: " + e.getTitulo() +
//                                " Data de  lançamento: " + e.getDataDeLancamento().format(formatadorDeData)
//                ));

        Map<Integer, Double> avaliacaoPorTemporada = epsodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Epsodios::getTemporada, Collectors.averagingDouble(Epsodios::getAvaliacao)));
        System.out.println(avaliacaoPorTemporada);

        DoubleSummaryStatistics est = epsodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Epsodios::getAvaliacao));
        System.out.println("Média :" + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());
    }
}
