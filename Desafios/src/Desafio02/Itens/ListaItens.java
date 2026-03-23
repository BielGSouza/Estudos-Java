package Desafio02.Itens;

import java.util.LinkedList;
import java.util.List;

public class ListaItens implements Comparable<ListaItens>{
    //Variaveis para a List
    double valorItem;
    String nomeItem;


    public ListaItens(String itemNome, double itemValor) {
        this.nomeItem = itemNome;
        this.valorItem = itemValor;
    }

    public double getValorItem() {
        return valorItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    @Override
    public String toString() {
        return "Item: " + this.nomeItem + " - " + this.valorItem;
    }

    @Override
    public int compareTo(ListaItens o) {
        if (this.getValorItem() < o.getValorItem()) {
            return 1;
        } else if (this.getValorItem() > o.getValorItem()) {
            return -1;
        } else {
            return 0;
        }
    }
}
