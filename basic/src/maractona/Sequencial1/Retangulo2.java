package maractona.Sequencial1;
import  java.util.Scanner;

public class Retangulo2 {
    public static  void  main (String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, altura, perimetro, area, diagonal;

        System.out.print("Base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retangulo ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = (2*base) + (2*altura);
        diagonal = Math.sqrt((base*base) + (altura * altura));
        System.out.println("AREA "+ area);
        System.out.println("PERIMETRO "+ perimetro);
        System.out.println("DIAGONAL "+ diagonal);

        sc.close();
    }
}
