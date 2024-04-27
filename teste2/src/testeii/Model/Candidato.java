package testeii.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Candidato implements Serializable {

    private String nome, historico;
    private double BI;
    public Municipio municipio;
    ArrayList<Voto> votos = new ArrayList<Voto>();

    public Candidato(String nome, double BI, Municipio municipio) {
        this.nome = nome;
        this.BI = BI;
        this.municipio = municipio;
        this.historico = "Candidato para a concorrencia";
    }

    public String getNome() {
        return nome;
    }

    public String getHistorico() {
        return historico;
    }

    public double getBI() {
        return this.BI;
    }

    public double getVotos() {
        return this.votos.size();
    }

    public ArrayList<Voto> votosTotal() {
        return this.votos;
    }

    public void setVotos(boolean isNull, boolean isValid) {
        Voto novoVoto = new Voto(isNull, isValid);
        votos.add(novoVoto);
    }
}
