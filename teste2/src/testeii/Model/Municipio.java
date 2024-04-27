package testeii.Model;

import java.io.Serializable;
import java.util.Random;

public class Municipio implements Serializable {

    private String nome;
    String provincia;
    int quantidadeRecenciados;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Municipio() {
        this.provincia = "Maputo";
    }

    public int getQuantidadeDeRecenciado() {
        return this.quantidadeRecenciados;
    }

    public void setQuantidadeDeRecenciado(int quantidadeRecenciados) {
        this.quantidadeRecenciados = quantidadeRecenciados;
    }

}
