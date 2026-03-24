package Desafio03;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    static void main() throws IOException, InterruptedException {
        //Desafio para informar o CEP e retornar os dados um arquivo

        int CEP = 0;
        Scanner scan = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        FileWriter escrever = new FileWriter("DadosCep.json");

        System.out.println("Qual o seu CEP?");
        CEP = scan.nextInt();
        String CEPstring = String.valueOf(CEP);

        String enderecoAPI = "https://viacep.com.br/ws/" + CEP + "/json/";

        if (CEPstring.length() == 8) {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(enderecoAPI))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                escrever.write(gson.toJson(json));
                escrever.close();
                System.out.println(json);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("CEP inválido");
        }
    }
}
