import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pessoa m1= new Pessoa("Maria", 23, "M", null, null);
        Pessoa p1= new Pessoa("Antonio", 23, "F", null, null);

        Pessoa p4= new Pessoa("Joao", 19, "M", p1,m1);
        Pessoa m2= new Pessoa("Narcia", 30, "F",p1 , m1);
        Pessoa p2= new Pessoa("Delcio", 21, "M", p1, null);

        Pessoa m3= new Pessoa("Yula", 23, "F", null, null);

        Pessoa p5= new Pessoa("Frede", 29, "M", p4, m3);
        Pessoa p3= new Pessoa("Edmilson", 23, "M", p2, m2);


        Pessoa m4= new Pessoa("Rita", 23, "M", null, m2);
       ArrayList<Pessoa> pessoa= new ArrayList<Pessoa>();
        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);
        pessoa.add(p4);
        pessoa.add(p5);
        pessoa.add(m1);
        pessoa.add(m2);
        pessoa.add(m3);
        pessoa.add(m4);

        Pessoa.mostrarFilhos(pessoa, p4);
        Pessoa.encontreAvo(p3);
    }




}
