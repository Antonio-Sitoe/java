package ex05;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Valter Sitoe", "788888888H", "Masculino");
        Pessoa p2 = new Pessoa("Alfredo Sitoe", "758888888H", "Masculino");

        Livro l1 = new Livro("Amor & Ódio", "Edson Rugnate", "2008", 5);
        Livro l2 = new Livro("Amor VS Paixão", "Edson Manjate", "2012", 3);

        Emprestimo e1 = new Emprestimo(l2, p2);
//        e1.setPessoa(p2);
//        e1.setLivro(l2);
//        e1.setDataEmprestimo(new Date());

        System.out.println(e1);
        System.out.println(e1.emprestar(new Date()));
        System.out.println(e1);
        System.out.println(e1.devolver(new Date()));
        System.out.println(e1);
    }
}
