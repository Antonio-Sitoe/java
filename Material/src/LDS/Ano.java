package LDS;

import java.util.Scanner;

public class Ano {
    public static void main(String[] args) {
        double bornYear, frequentYear, age, ageForWeek;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        bornYear = sc.nextDouble();

        System.out.print("Digite o ano actual: ");
        frequentYear = sc.nextDouble();

        age = frequentYear - bornYear;
        ageForWeek = age * 52.177;

        System.out.println("IDADE : " + age);
        System.out.println("Essa idade convertida em semanas. : " + ageForWeek);
    }
}
