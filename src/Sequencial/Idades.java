import  java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner mainPrint = new Scanner(System.in);
        String nome1, nome2;
        double idade1, idade2;

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome:");
        nome1=mainPrint.next();
        System.out.print("Idade:");
        idade1 = mainPrint.nextDouble();

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        nome2=mainPrint.next();
        System.out.print("Idade: ");
        idade2 = mainPrint.nextDouble();

        System.out.println("A idade média de " +nome1+" e "+nome2+" é  de "+ ((idade1+idade2)/2) +" anos");





        mainPrint.close();
    }
}
