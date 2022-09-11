package maractona.Sequencial1;
import java.util.Scanner;

public class Terreno {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);

     double largura, comprimento, metroQuadrado;
     double area, preco;

     System.out.println("Digite a largura do terreno");
     largura = sc.nextDouble();

     System.out.println("Digite o comprimento do terreno");
     comprimento = sc.nextDouble();

     System.out.println("Digite o valor por metro quadrado");
     metroQuadrado = sc.nextDouble();

     area  = comprimento * largura;
     preco =  area * metroQuadrado;

     System.out.print("Area do terreno ");
     System.out.println(area);

     System.out.print("Preco do terreno ");
     System.out.println(preco);

     sc.close();
    }
}
