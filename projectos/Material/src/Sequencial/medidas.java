package Sequencial;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C,areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.print("Digite a medida A: ");
        A = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        B = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        C = sc.nextDouble();

        areaQuadrado = A * A;
        areaTriangulo = (A * B)/2;
        areaTrapezio = ((A+B)*C)/2;

        System.out.println("AREA DO QUADRADO = " +areaQuadrado);
        System.out.println("AREA DO TRIANGULO = "+areaTriangulo);
        System.out.println("AREA DO TRAPEZIO = " + areaTrapezio);
    }
}
