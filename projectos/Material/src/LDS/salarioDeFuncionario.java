package LDS;
import java.util.Scanner;

public class salarioDeFuncionario {
    public static void main(String[] args) {
        String nome;
        double salario;
        double imposto;
        double taxa = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o teu nome");
        nome = sc.next();
        System.out.println("Digite o teu Salario");
        salario = sc.nextDouble();
        imposto = salario * taxa;

        System.out.println("O nome do funcionario: " + nome);
        System.out.println("O valor do imposto a pagar: " + imposto);
    }
}
