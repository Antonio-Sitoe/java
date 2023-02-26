package LDS;
import java.util.Scanner;
public class valorDeA {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite o valor de C: ");
            double c = sc.nextDouble();
            System.out.println("Digite o valor de B: ");
            double b = sc.nextDouble();


            double a = (c / b) - b;


            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("Valor de C: " + c);
        }
}
