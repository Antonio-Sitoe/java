package ex05;

import java.util.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Livro livro;
    private Pessoa pessoa;
    private boolean devolvido;



    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
    }




    public boolean emprestar(Date dataEmprestimo) {
        if (this.getLivro().getQuantidade() > 0) {
            this.setDataEmprestimo(dataEmprestimo);

            this.setDevolvido(false);
            this.getLivro().setQuantidade(this.getLivro().getQuantidade() - 1);
            return true;
        }
        return false;
    }
    

    public boolean devolver(Date dataDevolucao) {
        this.setDataDevolucao(dataDevolucao);
        this.setDevolvido(true);
        this.getLivro().setQuantidade(this.getLivro().getQuantidade() + 1);
        return true;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + ", livro=" + livro + ", pessoa=" + pessoa + ", devolvido=" + devolvido + '}';
    }

}
