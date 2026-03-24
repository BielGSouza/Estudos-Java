package br.com.gabriel.screenmatch.Service;

import br.com.gabriel.screenmatch.Model.DadosSerie;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
