package br.com.gabriel.screenmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
