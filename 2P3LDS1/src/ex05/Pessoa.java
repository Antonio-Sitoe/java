package ex05;

public class Pessoa {

    private String nome;
    private String bi;
    private String genero;

    public Pessoa(String nome, String bi, String genero) {
        this.setNome(nome);
        this.bi = bi;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", bi=" + bi + ", genero=" + genero + '}';
    }

}
