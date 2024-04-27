package ex05;

public class Livro {

    private String titulo;
    private String autor;
    private String ano;
    private int quantidade;

    public Livro(String titulo, String autor, String ano, int quantidade) {
        this.setTitulo(titulo);
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", quantidade=" + quantidade + '}';
    }
    
    
}
