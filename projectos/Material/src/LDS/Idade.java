package LDS;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        double age, month, day, hour, minuts;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tua idade");
        age = sc.nextDouble();
        // Validação da entrada do usuário
        if (age < 0) {
            System.out.println("A idade deve ser um valor positivo.");
            return;
        }

        month = age * 12;
        day  = age * 365;
        hour = day * 24;
        minuts = hour * 60;
        System.out.println("Idade  : "+ age);
        System.out.println("Meses  : "+ month);
        System.out.println("Dias   : "+day);
        System.out.println("Horas  : "+hour);
        System.out.println("Minutos : "+ minuts);

    }
}
