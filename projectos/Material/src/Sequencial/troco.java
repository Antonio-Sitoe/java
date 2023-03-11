package Sequencial;
import  java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoUnitario, quantidade, dinheiroRecebido, troco;

        System.out.println("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.println("Quantidade comprada: ");
        quantidade = sc.nextDouble();

        System.out.println("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        troco = dinheiroRecebido- (precoUnitario * quantidade);
        System.out.println("TROCO "+troco);
    }
}
