package LDS;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo  numero ");
        num2 = sc.nextInt();

//        a) soma dos dois numeros
        System.out.println("A soma dos dois numeros: "+ (num1+num2));
        System.out.println("Subtracao do primeiro pelo segundo "+ (num1-num2));
        System.out.println("Subtracção do segundo pelo primeiro "+ (num2 - num1));
        System.out.println("Multiplicação dos dois números "+ (num2 * num1));
        System.out.println("Divisão do primeiro pelo segundo "+ (num1 / num2));
        System.out.println("Divisão do segundo pelo primeiro "+ (num2 / num1));
        System.out.println("o primeiro elevado ao quadrado "+  Math.pow(num1, 2));

    }
}
