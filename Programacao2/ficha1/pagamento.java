package Sequencial;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double SalarioPhora, qtdHoras, pagamento;

        System.out.print("Nome: ");
        nome = sc.next();

        System.out.println("Valor por hora: ");
        SalarioPhora= sc.nextDouble();

        System.out.println("Horas trabalhadas: ");
        qtdHoras= sc.nextDouble();

        pagamento = qtdHoras*SalarioPhora;
        System.out.println("O pagamento para "+nome+" deve ser "+ pagamento);
    }
}
