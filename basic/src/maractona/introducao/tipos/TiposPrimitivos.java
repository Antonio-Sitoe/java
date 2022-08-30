package maractona.introducao.tipos;

public class TiposPrimitivos {
    public static void main(String[] args) {
         // Tipos primitivos sao tipos que guardam em memoria valores simples
        //  int, double, float, char, byte, short, long, boolean
        int idadeDoPai; // Tipo - inteiro
        double idadeDoPaiNaHoraDoCadastro;

        // TIPOS DE NUMEROS
        int age=2, year = 2020024659;
        long numeroGrande =(long) 1_00.0_458_975;  //
        char caractere = 'M';   // aceita um caractere
        String nome = "Antonio Manuel";
        String LastName = "Sitoe";
        float  salarioEmFloat = (float) 25.56f;       // podemos colocar o "f" - para float ou d
        double SalarioDoble = (float) 1500.5656;       // forcar o tipo double em 
        boolean haveMoney = true;
        short idade_Short =32000;

        // String - e um tipo de referencia. String e uma classe e comeca com a letra Maiuscula
        
        String text = "lorem upsonasansansnd nkksnjns";
        System.out.println(text);
        System.out.println("A idade e : "+ age);
        System.out.println(year);
        System.out.println(numeroGrande);
        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(LastName);
        System.out.println(SalarioDoble);
        System.out.println(salarioEmFloat);
        System.out.println(haveMoney);
    }
}
