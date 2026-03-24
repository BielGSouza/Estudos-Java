 package br.gabriel.aluno.principal;

import br.gabriel.aluno.execao.ErroDeConversaodeAnoExcepition;
import br.gabriel.aluno.modelos.Titulo;
import br.gabriel.aluno.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBuscas {
    static void main() throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Qual o filme que quer buscar");
            busca = scan.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=84711ae4";

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloomdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloomdb);
                //try {
                Titulo meuTitulo = new Titulo(meuTituloomdb);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na formatação da busca");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaodeAnoExcepition e) {
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("o programa finalizou!");
    }
}
