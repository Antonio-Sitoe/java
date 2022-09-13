package Sequencial;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distancia, combustivel, consumoMedio;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextDouble();

        System.out.print("Combustível gasto: ");
        combustivel = sc.nextDouble();

        consumoMedio= distancia/combustivel;

        System.out.print("Consumo medio: "+consumoMedio);


    }

}
